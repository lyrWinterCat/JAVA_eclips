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
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class buyPanel extends JFrame implements ActionListener , ItemListener{
	
	JPanel mainPanel = new JPanel(); //카페 이미지 영역
	JPanel subPanel = new JPanel(); // 옵션선택+장바구니 영역
	JPanel optionPanel = new JPanel(); //옵션영역
	JPanel cartPanel = new JPanel(); // 장바구니 영역
	
	String [] menuName = {"아메리카노","카페라떼","카라멜 마끼야또","밀크셰이크","과일에이드 (ice)",
			"과일차 (hot)","베이글","머핀","치즈스틱케이크"}; 
	int [] menuPrice = {3200,3700,3900,4300,3800,3800,1900,2000,1800};
	JButton [] cafeMenu = new JButton[9];
	Image [] cafeImg = new Image[9];
	
	// 장바구니 상품 총 개수
	int cartProduct;
	// 장바구니 총 가격
	int cartPrice;
	
	class Menu {
		String name;
		String option;
		int price;
		int optionP;
		int productNum;

		public Menu(String name, String option, int price, int optionP) {
			this.name = name;
			this.option = option;
			this.price = price;
			this.optionP = optionP;
			productNum++;
		}
	}
	ArrayList<Menu> cartArray = new ArrayList<Menu>();
	
	//이미지 버튼 클릭시 JLabel에 넘길 카페 메뉴, 가격
	String orderName = "";
	int orderPrices=0;
	String options="";
	
	//optionPanel에 들어갈 값들
	JLabel orderMenu = new JLabel(orderName);
	JLabel orderPrice = new JLabel(""+orderPrices+"원");
	JRadioButton small = new JRadioButton("small");
	JRadioButton medium = new JRadioButton("medium (+500)");
	JRadioButton large = new JRadioButton("Large (+800)");
	JRadioButton hot = new JRadioButton("hot");
	JRadioButton ice = new JRadioButton("ice (+500)");
	JRadioButton addMore = new JRadioButton("시럽/휘핑추가 (+500)");
	JRadioButton lemon = new JRadioButton("레몬");
	JRadioButton peach = new JRadioButton("복숭아");
	JRadioButton grapefruit = new JRadioButton("자몽");
	JRadioButton addCreamCheese = new JRadioButton("크림치즈 추가 (+500)");
	JRadioButton plainMuffin = new JRadioButton("플레인 머핀");
	JRadioButton bluberryMuffin = new JRadioButton("블루베리 머핀");
	
	// 메뉴에 맞게 버튼 비활성화 할 때 사용하는 배열
	JRadioButton [] drinkSelect = {small , medium, large};
	JRadioButton [] coffeeSelect = {hot,ice,addMore};
	JRadioButton [] adeTeaSelect = {lemon, peach, grapefruit};
	JRadioButton [] bakerySelect = {addCreamCheese, plainMuffin, bluberryMuffin};
	GridBagLayout gbLayout;
	GridBagConstraints gbc;
	// 라디오버튼 중복체크 확인 기능 담당 버튼그룹
	ButtonGroup drink = new ButtonGroup();
	ButtonGroup coffee = new ButtonGroup();
	ButtonGroup adeTea = new ButtonGroup();
	ButtonGroup bakery = new ButtonGroup();
	
	
	public buyPanel() {
		Dimension menuSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize()); //컴퓨터 화면 사이즈 받아오기
		
		gbLayout = new GridBagLayout(); // 그리드백 레이아웃 선언
		gbc = new GridBagConstraints(); //그리드 백 레이아웃 구현을 위한 요소 선언.
		
		setTitle("이디야 메뉴 주문 프로그램"); 
		setBounds(400,5, menuSize.width/2, menuSize.height-50);
		setResizable(false);
		
		
		mainPanel.setBackground(Color.BLUE);
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
		
		JLabel optionLabel = new JLabel("옵션 선택"); 
		JLabel orderLabel = new JLabel("선택한 메뉴 : "); 
		
		
		JLabel drinkLabel = new JLabel("음료",JLabel.LEFT);
		JLabel coffeeLabel = new JLabel("커피",JLabel.LEFT);
		JLabel adeTeaLabel = new JLabel("에이드/차",JLabel.LEFT);
		JLabel bakeryLabel = new JLabel("베이커리",JLabel.LEFT);
		
//		JLabel [] labels = new JLabel[8]; 
//		String [] labelNames = {"옵션 선택", "선택한 메뉴 : ",orderName,""+orderPrices+"원",
//				"음료","커피","에이드/차","베이커리"};
//		for (int i = 0; i < labelNames.length; i++) {
//			labels[i]=new JLabel(labelNames[i],JLabel.LEFT);
//		}
		

		// 옵션 패널에 라디오박스, 텍스트박스, 아이템리스너 넣기
		optionPanel.add(optionLabel);
		optionPanel.add(orderLabel);
		optionPanel.add(orderMenu);
		optionPanel.add(orderPrice);

		optionPanel.add(drinkLabel);
		optionPanel.add(small);
		optionPanel.add(medium);
		optionPanel.add(large);
		
		optionPanel.add(coffeeLabel);
		optionPanel.add(hot);
		optionPanel.add(ice);
		optionPanel.add(addMore);
		
		optionPanel.add(adeTeaLabel);
		optionPanel.add(lemon);
		optionPanel.add(peach);
		optionPanel.add(grapefruit);
		
		optionPanel.add(bakeryLabel);
		optionPanel.add(addCreamCheese);
		optionPanel.add(plainMuffin);
		optionPanel.add(bluberryMuffin);
		
		
		drink.add(small);
		drink.add(medium);
		drink.add(large);
		
		coffee.add(hot);
		coffee.add(ice);
		coffee.add(addMore);
		
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
		
		// 장바구니 영역에 텍스트박스 넣기
		JLabel cartLabel = new JLabel("장바구니",JLabel.CENTER); 
		
		// 장바구니 영역에 Label 넣기
		cartPanel.setBackground(Color.white);
		setLayout(gbLayout);
		cartPanel.add(cartLabel,BorderLayout.NORTH);

		// 버튼으로 옵션,장바구니 영역 위치 구현해보기		
		JButton addBtn = new JButton("장바구니 담기");
		JButton emptyBtn = new JButton("비우기");
		JButton buyBtn = new JButton("주문하기");
		addBtn.addActionListener(this);
		emptyBtn.addActionListener(this);
		buyBtn.addActionListener(this);

		
		//optionPanel.setPreferredSize(new Dimension(getWidth()/5*4,getHeight()/14));
		gbc.insets=new Insets(1, 1, 1, 1);
		gbc.gridwidth=2;
		//addGrid(gbc,optionBtn,0,0,1,3);
		addGrid(gbc,optionPanel,0,0,1,3);
		//addGrid(gbc,purchaseBtn,2,0,1,3);
		addGrid(gbc,cartPanel,2,0,1,3);
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
		
		if(e.getActionCommand().equals("장바구니 담기")) {
//			orderName 지금 누른 상품 이름
//			orderPrice 지금 누른 상품 가격

		}

		if(button.getName()==null) {			
//			System.out.println(e.getActionCommand());		
			
		}else {
			// 이미지 버튼 클릭시 해당 메뉴 이름과 가격을 불러오도록 이벤트 설정
			options="";
			System.out.println(button.getName()); //버튼 클릭시 메뉴 이름 출력 확인
			orderName=button.getName();
			
			int index=0;
			for (int i = 0; i < menuPrice.length; i++) {
				for (int j = 0; j < menuName.length; j++) {
					if(button.getName().equals(menuName[i])) {
						index=i;
					}
				}
			}
			System.out.println(menuPrice[index]); //버튼 클릭시 메뉴에 맞는 가격 출력 확인
			orderPrices=menuPrice[index];
			orderMenu.setText(orderName);
			orderPrice.setText(""+menuPrice[index]+"원");
			
			// 메뉴 이미지 클릭시 맞는 옵션 라디오박스만 활성화
			switch(button.getName()) {
			case "아메리카노": case "카페라떼": case "카라멜 마끼야또":
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(true);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(false);
				}

				break;
			case "밀크셰이크":
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(false);
				}

				break;
			case "과일에이드 (ice)": case "과일차 (hot)":
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(true);
					bakerySelect[i].setEnabled(false);
				}

				break;
			case "베이글": case "머핀": case "치즈스틱케이크":
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(false);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(true);
				}

				break;
			}			
		}		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==1) {
			Object o = e.getSource();
			JRadioButton rb = (JRadioButton)o;
			System.out.println(rb.getActionCommand());
			rb.isSelected();
		}
	}
	
	public static void main(String[] args) {
		new buyPanel();
	}




}
