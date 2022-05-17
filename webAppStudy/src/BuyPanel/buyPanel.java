package BuyPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import Account.Sales;
import Storage.PrMain;

public class BuyPanel extends JFrame implements ActionListener , ItemListener{
	
	JPanel mainPanel = new JPanel(); //카페 이미지 영역
	JPanel subPanel = new JPanel(); // 옵션선택+장바구니 영역
	JPanel optionPanel = new JPanel(); //옵션영역
	JPanel cartPanel = new JPanel(); // 장바구니 영역
	
	JLabel cartLabel;
	JTextArea cartText;
	JScrollPane cartScroll;
	
	String [] menuName = {"아메리카노","카페라떼","카라멜 마끼야또","밀크셰이크","과일에이드(ice)",
			"과일차(hot)","베이글","머핀","치즈스틱케이크"}; 
	int [] menuPrice = {3200,3700,3900,4300,3800,3800,1900,2000,1800};
	JButton [] cafeMenu = new JButton[9];
	Image [] cafeImg = new Image[9];
	
	// 장바구니 상품 총 개수
	int cartProduct;
	// 장바구니 총 가격
	int cartPrice;
	
	// 재고관리,매출관리로 값을 넘겨줄 ArrayList
	ArrayList<Menu> cartArray = new ArrayList<Menu>(); //매출관리
	
	//이미지 버튼 클릭시 JLabel에 넘길 카페 메뉴, 가격
	String orderName = "";
	int orderPrices=0;
	int totalPrices=0;
	
	// 주문하기 버튼시 총 주문량 (대기번호) 확인변수
	int orderNum=0;
	// 옵션 체크시 해당하는 옵션을 저장하는 String
	String orderOptions="";
	
	//optionPanel에 들어갈 값들
	JLabel orderMenu = new JLabel(orderName);
	JLabel orderPrice = new JLabel(""+orderPrices+"원");
	JRadioButton small = new JRadioButton("small");
	JRadioButton medium = new JRadioButton("medium(+500)");
	JRadioButton large = new JRadioButton("Large(+800)");
	JRadioButton hot = new JRadioButton("hot");
	JRadioButton ice = new JRadioButton("ice(+500)");
	JRadioButton addMore = new JRadioButton("시럽/휘핑추가(+500)");
	JRadioButton lemon = new JRadioButton("레몬");
	JRadioButton peach = new JRadioButton("복숭아");
	JRadioButton grapefruit = new JRadioButton("자몽");
	JRadioButton addCreamCheese = new JRadioButton("크림치즈 추가(+500)");
	JRadioButton plainMuffin = new JRadioButton("플레인");
	JRadioButton bluberryMuffin = new JRadioButton("블루베리");
	
	// 메뉴에 맞게 버튼 비활성화 할 때 사용하는 배열
	JRadioButton [] drinkSelect = {small , medium, large};
	JRadioButton [] coffeeSelect = {hot,ice,addMore};
	JRadioButton [] adeTeaSelect = {lemon, peach, grapefruit};
	JRadioButton [] bakerySelect = {addCreamCheese, plainMuffin, bluberryMuffin};
	GridBagLayout gbLayout;
	GridBagConstraints gbc;
	// 라디오버튼 중복체크 불가능 담당 버튼그룹
	ButtonGroup drink = new ButtonGroup();
	ButtonGroup coffee = new ButtonGroup();
	ButtonGroup adeTea = new ButtonGroup();
	ButtonGroup bakery = new ButtonGroup();
	
	//subPanel에 들어갈 버튼들
	JButton addBtn = new JButton("장바구니 담기");
	JButton emptyBtn = new JButton("비우기");
	protected JButton buyBtn = new JButton("주문하기");
	
	public BuyPanel() {}
	
	public void startBuyPanel() {
		Dimension menuSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize()); //컴퓨터 화면 사이즈 받아오기
		
		gbLayout = new GridBagLayout(); // 그리드백 레이아웃 선언
		gbc = new GridBagConstraints(); //그리드 백 레이아웃 구현을 위한 요소 선언.
		
		setTitle("EDIYA COFFEE ORDER"); 
		setBounds(400,5, menuSize.width/2, menuSize.height-50);
		setResizable(false);		
		
		mainPanel.setBackground(Color.BLUE);
		mainPanel.setPreferredSize(new Dimension(getWidth(),getHeight()/5*3));
		GridLayout mainGrid = new GridLayout(3,3);
		mainPanel.setLayout(mainGrid); // 이미지 영역에 그리드 레이아웃 넣어주기
		
		for (int i = 0; i < cafeImg.length; i++) { // 이미지 배열에 사진 넣어주기
			String filename = String.format("./src/img/%02d.png", i+1);
			cafeImg[i]=Toolkit.getDefaultToolkit().getImage(filename);
		}		
		
		for (int i = 0; i < cafeMenu.length; i++) { // 카페메뉴 아이콘을 이미지 아이콘으로 넣어주기
			cafeMenu[i] = new JButton(new ImageIcon(cafeImg[i]));
			cafeMenu[i].setName(menuName[i]);
//			System.out.println(cafeMenu[i].getName());
			cafeMenu[i].addActionListener(this); // 클릭시 이벤트 발생기능 추가
			cafeMenu[i].setBackground(Color.WHITE);
			cafeMenu[i].setPreferredSize(new Dimension(mainPanel.getHeight()/3,mainPanel.getWidth()/3)); // 이미지버튼 크기조절
			mainPanel.add(cafeMenu[i]); // 이미지영역에 이미지버튼 추가
		}		
		
		// 여기서부터 옵션,장바구니 영역 구축
		subPanel.setBackground(Color.white); 
		setLayout(gbLayout);
		gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=1.0;
		gbc.weighty=3.0;		
		
		add(mainPanel,gbc);
		gbc.weighty=1.0;
		gbc.gridx=0;
		gbc.gridy=1;
		add(subPanel,gbc);	
		
		subPanel.setLayout(gbLayout);
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		// 옵션 영역에 Label 넣기
		optionPanel.setBackground(Color.white);
		setLayout(gbLayout);
		
		// 옵션 영역에 그리드로 영역 잡아서 넣기
		GridLayout optionGrid = new GridLayout(5,4);
		optionPanel.setLayout(optionGrid);
		optionPanel.setBorder(new LineBorder(Color.black, 2));
		
		JLabel optionLabel = new JLabel("옵션 선택",JLabel.CENTER); 
		JLabel orderLabel = new JLabel("선택한 메뉴 : "); 		
		JLabel drinkLabel = new JLabel("음료",JLabel.CENTER);
		JLabel coffeeLabel = new JLabel("커피",JLabel.CENTER);
		JLabel adeTeaLabel = new JLabel("에이드/차",JLabel.CENTER);
		JLabel bakeryLabel = new JLabel("베이커리",JLabel.CENTER);
		
		// 옵션 패널에 라디오박스, 텍스트박스, 아이템리스너 넣기
		optionPanel.add(optionLabel);
		optionPanel.add(orderLabel);
		optionPanel.add(orderMenu);
		optionPanel.add(orderPrice);

		optionPanel.add(drinkLabel);
		small.setName("0");
		medium.setName("500");
		large.setName("800");
		optionPanel.add(small);
		optionPanel.add(medium);
		optionPanel.add(large);
		
		optionPanel.add(coffeeLabel);
		hot.setName("0");
		ice.setName("500");
		addMore.setName("500");
		optionPanel.add(hot);
		optionPanel.add(ice);
		optionPanel.add(addMore);
		
		optionPanel.add(adeTeaLabel);
		lemon.setName("0");
		peach.setName("0");
		grapefruit.setName("0");
		optionPanel.add(lemon);
		optionPanel.add(peach);
		optionPanel.add(grapefruit);
		
		optionPanel.add(bakeryLabel);
		addCreamCheese.setName("500");
		plainMuffin.setName("0");
		bluberryMuffin.setName("0");
		optionPanel.add(addCreamCheese);
		optionPanel.add(plainMuffin);
		optionPanel.add(bluberryMuffin);
		
		
		drink.add(small);
		drink.add(medium);
		drink.add(large);
		
		coffee.add(hot);
		coffee.add(ice);
//		coffee.add(addMore);
		
		adeTea.add(lemon);
		adeTea.add(peach);
		adeTea.add(grapefruit);
		
		bakery.add(addCreamCheese);
		bakery.add(plainMuffin);
		bakery.add(bluberryMuffin);
		
		small.addItemListener(this);
		medium.addItemListener(this);
		large.addItemListener(this);
		
		hot.addItemListener(this);
		ice.addItemListener(this);
		addMore.addItemListener(this);
		
		lemon.addItemListener(this);
		peach.addItemListener(this);
		grapefruit.addItemListener(this);
		
		addCreamCheese.addItemListener(this);
		plainMuffin.addItemListener(this);
		bluberryMuffin.addItemListener(this);		
		
		// 장바구니 영역 구현하기
		cartLabel = new JLabel("장바구니"); 
		cartText= new JTextArea("",1,1);
		
		cartText.setEditable(false);
		cartPanel.setBackground(Color.white);
		setLayout(gbLayout);
		cartPanel.setLayout(new BorderLayout());
		cartPanel.add(cartLabel,BorderLayout.NORTH);

		cartLabel.setBounds(0, 0, 0, 0);
		cartPanel.add(cartText);

		// 장바구니 추가, 비우기, 주문하기 버튼 구현		
		addBtn.addActionListener(this);
		emptyBtn.addActionListener(this);
		buyBtn.addActionListener(this);

		addBtn.setEnabled(false);
		emptyBtn.setEnabled(false);
		buyBtn.setEnabled(false);


		// 주문 버튼들과 option Panel 위치잡기 >> GridBagLayout
		gbc.insets=new Insets(1, 1, 1, 1);
		gbc.gridwidth=2;
		//addGrid(gbc,optionBtn,0,0,1,3);
		addGrid(gbc,optionPanel,0,0,1,3);
		//addGrid(gbc,purchaseBtn,2,0,1,3);
		cartScroll = new JScrollPane(cartPanel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		cartScroll.setVisible(true);
		addGrid(gbc,cartScroll,2,0,1,3);
		gbc.gridwidth=1;
		addGrid(gbc,addBtn,0,1,0.5,1);
		addGrid(gbc,emptyBtn,1,1,0.5,1);
		addGrid(gbc,buyBtn,2,1,2,1);		
		
			
		setVisible(true);	
		
	}
	
	// 백그리드로 영역을 주기 위한 메서드
	private void addGrid(GridBagConstraints gbc,JComponent c , int x , int y , double w , double h){
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.weightx=w;
		gbc.weighty=h;
		
		subPanel.add(c,gbc);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //버튼 클릭시 이벤트 메서드
		Object o = e.getSource();
		JButton button = (JButton)o;
		
		// 버튼값에 setName을 안해주어서 생기는 에러 막아주기
		if(button.getName()==null) {			

		}else {
			// 이미지 버튼 클릭시 일어나는 이벤트 정의
			// 이미지 버튼 클릭시 메뉴이름과 가격 가져오기
			orderOptions="";
//			System.out.println(button.getName()); //버튼 클릭시 메뉴 이름 출력 확인
			orderName=button.getName();
			
			// 이미지 버튼 클릭시 장바구니버튼만 활성화
			addBtn.setEnabled(true);
			
			int index=0;
			for (int i = 0; i < menuPrice.length; i++) {
				for (int j = 0; j < menuName.length; j++) {
					if(button.getName().equals(menuName[i])) {
						index=i;
					}
				}
			}
//			System.out.println(menuPrice[index]); //버튼 클릭시 메뉴에 맞는 가격 출력 확인
			orderPrices=menuPrice[index];
			orderMenu.setText(orderName);
			orderPrice.setText(""+menuPrice[index]+"원");			

			// 받은 재고에 따라 주문 가능/불가 설정			
			 //PrMain이 실행된 이후이기 때문에 관리자 들어가서 Pr 실행을 한 후여야 함
			if(PrMain.storage.get("원두")<=0 && (button.getName().equals("아메리카노") || button.getName().equals("카페라떼") || button.getName().equals("카라멜 마끼야또"))) {
				JOptionPane.showMessageDialog(null, "품절입니다. 직원에게 문의해주세요.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("우유")<=0 && (button.getName().equals("밀크셰이크"))) {
				JOptionPane.showMessageDialog(null, "품절입니다. 직원에게 문의해주세요.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("과일청")<=0 && (button.getName().equals("과일에이드(ice)") || button.getName().equals("과일차(hot)"))) {
				JOptionPane.showMessageDialog(null, "품절입니다. 직원에게 문의해주세요.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("머핀")<=0 && (button.getName().equals("머핀"))) {
				JOptionPane.showMessageDialog(null, "품절입니다. 직원에게 문의해주세요.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("베이글")<=0 && (button.getName().equals("베이글"))) {
				JOptionPane.showMessageDialog(null, "품절입니다. 직원에게 문의해주세요.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("치즈스틱케이크")<=0 && (button.getName().equals("치즈스틱케이크"))) {
				JOptionPane.showMessageDialog(null, "품절입니다. 직원에게 문의해주세요.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			
			// 메뉴 이미지 클릭시 맞는 옵션 라디오박스만 활성화
			switch(button.getName()) {
			case "아메리카노": case "카페라떼": case "카라멜 마끼야또":
				System.out.println(PrMain.storage.get("원두"));
				
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(true);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(false);
				}
				break;
			case "밀크셰이크":
				System.out.println(PrMain.storage.get("우유"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(false);
				}
				break;
			case "과일에이드(ice)": case "과일차(hot)":
				System.out.println(PrMain.storage.get("과일청"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(true);
					bakerySelect[i].setEnabled(false);
				}
				break;
				
			case "베이글": 
				System.out.println(PrMain.storage.get("베이글"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(false);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(true);
				}
				break;
			case "머핀": 
				System.out.println(PrMain.storage.get("머핀"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(false);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(true);
				}
				break;
			case "치즈스틱케이크":
				System.out.println(PrMain.storage.get("치즈스틱케이크"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(false);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(true);
				}
				break;
			}			
		}
		
		
		// 장바구니 담기 버튼 클릭
		if(e.getActionCommand().equals("장바구니 담기")) {
			emptyBtn.setEnabled(true);
			buyBtn.setEnabled(true);
//			orderName 지금 누른 상품 이름
//			orderPrices 지금 누른 상품 가격
//			orderOptions 지금 누른 상품 옵션
			int optionPrices=0;
			orderOptions="";
			// 옵션을 선택했는지에 대한 판별플래그
			boolean isChecked=false; //옵션1
			boolean isChecked2=false; //옵션2

			switch(orderName) {
			case "아메리카노": case "카페라떼": case "카라멜 마끼야또":
				for (int i = 0; i < drinkSelect.length; i++) {
					if(drinkSelect[i].isSelected()) {
						orderOptions += drinkSelect[i].getActionCommand()+" ";
						optionPrices+=Integer.parseInt(drinkSelect[i].getName());
						isChecked=true;
					};
					if(coffeeSelect[i].isSelected()) {
						orderOptions += coffeeSelect[i].getActionCommand()+" ";
						optionPrices+=Integer.parseInt(coffeeSelect[i].getName());
						
						// hot또는 ice를 반드시 선택해야만 옵션이 선택된 것으로 판단
						if(coffeeSelect[i].getActionCommand().equals("hot")||coffeeSelect[i].getActionCommand().equals("ice(+500)")) {
							isChecked2=true;							
						}
					}
				}
				break;
			case "밀크셰이크":
				for (int i = 0; i < drinkSelect.length; i++) {
					if(drinkSelect[i].isSelected()){	
						orderOptions += drinkSelect[i].getActionCommand()+" ";
						optionPrices+=Integer.parseInt(drinkSelect[i].getName());
						isChecked=true;
						isChecked2=true;	
					}				
				}
				break;
			case "과일에이드(ice)": case "과일차(hot)":
				for (int i = 0; i < drinkSelect.length; i++) {
					if(drinkSelect[i].isSelected()) {
						orderOptions += drinkSelect[i].getActionCommand()+" ";
						optionPrices+=Integer.parseInt(drinkSelect[i].getName());
						isChecked=true;
					}
					if(adeTeaSelect[i].isSelected()) {
						orderOptions += adeTeaSelect[i].getActionCommand()+" ";
						optionPrices+=Integer.parseInt(adeTeaSelect[i].getName());
						isChecked2=true;
					}
				}
				break;
			case "베이글": case "머핀" : case "치즈스틱케이크" :
				for (int i = 0; i < drinkSelect.length; i++) {
					if(bakerySelect[i].isSelected()) {
						orderOptions += bakerySelect[i].getActionCommand()+" ";
						optionPrices+=Integer.parseInt(bakerySelect[i].getName());
						isChecked=true;
						isChecked2=true;
					}
				}
				break;
			}	
			totalPrices=orderPrices+optionPrices;
			
			// 옵션을 선택 판별조건 (옵션이 없다면 장바구니에 추가 불가능)
			if(!(isChecked&&isChecked2)) {
				JOptionPane.showMessageDialog(null, "옵션을 선택해주세요");
			}else {
				System.out.println(orderName+" "+orderOptions+" "+totalPrices); // 넘길값 확인
				boolean addFlag=true;
				for (Menu menu : cartArray) {
					if(menu.name.equals(orderName)&&menu.options.equals(orderOptions)) {
						menu.productNum++;
						addFlag=false;
					}
				}
				if(addFlag) {					
					cartArray.add(new Menu(orderName,orderOptions,totalPrices));
				}
				String result="";
				for (Menu menu : cartArray) {
					result+="* "+menu.name+" "+menu.options+" "+menu.totalPrice+"원 \n수량 : "+menu.productNum+"\n";
				}
				cartText.setText(result); 
			}						
		}
		
		// 비우기 버튼 클릭
		if(e.getActionCommand().equals("비우기")) {
			cartArray.clear();
			cartText.setText("");
			
			emptyBtn.setEnabled(false);
			buyBtn.setEnabled(false);
		}
		
		// 주문하기 버튼 클릭
		// 여기서 cartArray에 담긴 주문 내역을 매출관리 / 재고관리로 넘겨주기
		String printOrder="";
		if(e.getActionCommand().equals("주문하기")) {

			// cartArray 넘겨주기
			// 매출관리로 cartArray 넘겨주기
//			sales.order(cartArray);
			
			boolean is_buy=true;
			// 주문시 받은 재고 줄어들게...하고 다시 넘기면 될 것 같은데 일단 여기서만 구현을 좀 해보고시픈데오또카지
			for (int i = 0; i < cartArray.size(); i++) {
				if(cartArray.get(i).name.equals("아메리카노")||(cartArray.get(i).name.equals("카페라떼")||(cartArray.get(i).name.equals("카라멜 마끼야또")))) {
					int coffeeN=PrMain.storage.get("원두");
					coffeeN-=cartArray.get(i).productNum;
					PrMain.storage.put("원두",coffeeN);
					if(coffeeN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "재고가 부족합니다. 직원에게 문의해주세요.");
					}
				}
				if(cartArray.get(i).name.equals("밀크셰이크")) {
					int milkN = PrMain.storage.get("우유");
					milkN -= cartArray.get(i).productNum;
					PrMain.storage.put("우유",milkN);
					if(milkN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "재고가 부족합니다. 직원에게 문의해주세요.");
					}
				}
				if(cartArray.get(i).name.equals("과일에이드(ice)")||cartArray.get(i).name.equals("과일차(hot)")) {
					int fruitN = PrMain.storage.get("과일청");
					fruitN-=cartArray.get(i).productNum;
					PrMain.storage.put("과일청",fruitN);
					if(fruitN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "재고가 부족합니다. 직원에게 문의해주세요.");
					}
				}
				if(cartArray.get(i).name.equals("베이글")) {
					int bagleN = PrMain.storage.get("베이글");
					bagleN -= cartArray.get(i).productNum;
					PrMain.storage.put("베이글",bagleN);
					if(bagleN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "재고가 부족합니다. 직원에게 문의해주세요.");
					}
				}
				if(cartArray.get(i).name.equals("머핀")) {
					int muffinN = PrMain.storage.get("머핀");
					muffinN -= cartArray.get(i).productNum;
					PrMain.storage.put("머핀",muffinN);
					if(muffinN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "재고가 부족합니다. 직원에게 문의해주세요.");
					}
				}
				if(cartArray.get(i).name.equals("치즈스틱케이크")) {
					int cakeN = PrMain.storage.get("치즈스틱케이크");
					cakeN -= cartArray.get(i).productNum;
					PrMain.storage.put("치즈스틱케이크",cakeN);
					if(cakeN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "재고가 부족합니다. 직원에게 문의해주세요.");
					}
				}
			}

			
			// message 창으로 주문 내역 보여주기
			if(is_buy) {
				int payPrice=0;
				for (int i = 0; i < cartArray.size(); i++) {
					printOrder+="* "+cartArray.get(i).name+"\n"
							+"옵션 : "+cartArray.get(i).options+"   수량 : "+cartArray.get(i).productNum
							+"\n"+"가격 : "+cartArray.get(i).totalPrice+"원\n";
					payPrice+=cartArray.get(i).totalPrice*cartArray.get(i).productNum;
				}			
				orderNum++;
				JOptionPane.showMessageDialog(null,
						printOrder+"-----------------------------------------------------------------\n"
								+"주문이 완료되었습니다.\n 대기번호 : "+orderNum+"\n결제 금액 : "+payPrice+"원","주문 내역",JOptionPane.PLAIN_MESSAGE);
				
			}
			// 설정 초기화
			Test.setMenus(cartArray);
			cartArray.clear();
			cartText.setText("");
			addBtn.setEnabled(false);
			emptyBtn.setEnabled(false);
			buyBtn.setEnabled(false);
		}	
	}
	public ArrayList<Menu> getCartArray() {
		return cartArray;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==1) {
			Object o = e.getSource();
			JRadioButton rb = (JRadioButton)o;
		}
	}
	
	public static void main(String[] args) {
		new BuyPanel();
	}
}
