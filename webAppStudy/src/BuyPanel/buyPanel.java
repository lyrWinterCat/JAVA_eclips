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
	
	JPanel mainPanel = new JPanel(); //ī�� �̹��� ����
	JPanel subPanel = new JPanel(); // �ɼǼ���+��ٱ��� ����
	JPanel optionPanel = new JPanel(); //�ɼǿ���
	JPanel cartPanel = new JPanel(); // ��ٱ��� ����
	
	JLabel cartLabel;
	JTextArea cartText;
	JScrollPane cartScroll;
	
	String [] menuName = {"�Ƹ޸�ī��","ī���","ī��� �����߶�","��ũ����ũ","���Ͽ��̵�(ice)",
			"������(hot)","���̱�","����","ġ�ƽ����ũ"}; 
	int [] menuPrice = {3200,3700,3900,4300,3800,3800,1900,2000,1800};
	JButton [] cafeMenu = new JButton[9];
	Image [] cafeImg = new Image[9];
	
	// ��ٱ��� ��ǰ �� ����
	int cartProduct;
	// ��ٱ��� �� ����
	int cartPrice;
	
	// ������,��������� ���� �Ѱ��� ArrayList
	ArrayList<Menu> cartArray = new ArrayList<Menu>(); //�������
	
	//�̹��� ��ư Ŭ���� JLabel�� �ѱ� ī�� �޴�, ����
	String orderName = "";
	int orderPrices=0;
	int totalPrices=0;
	
	// �ֹ��ϱ� ��ư�� �� �ֹ��� (����ȣ) Ȯ�κ���
	int orderNum=0;
	// �ɼ� üũ�� �ش��ϴ� �ɼ��� �����ϴ� String
	String orderOptions="";
	
	//optionPanel�� �� ����
	JLabel orderMenu = new JLabel(orderName);
	JLabel orderPrice = new JLabel(""+orderPrices+"��");
	JRadioButton small = new JRadioButton("small");
	JRadioButton medium = new JRadioButton("medium(+500)");
	JRadioButton large = new JRadioButton("Large(+800)");
	JRadioButton hot = new JRadioButton("hot");
	JRadioButton ice = new JRadioButton("ice(+500)");
	JRadioButton addMore = new JRadioButton("�÷�/�����߰�(+500)");
	JRadioButton lemon = new JRadioButton("����");
	JRadioButton peach = new JRadioButton("������");
	JRadioButton grapefruit = new JRadioButton("�ڸ�");
	JRadioButton addCreamCheese = new JRadioButton("ũ��ġ�� �߰�(+500)");
	JRadioButton plainMuffin = new JRadioButton("�÷���");
	JRadioButton bluberryMuffin = new JRadioButton("��纣��");
	
	// �޴��� �°� ��ư ��Ȱ��ȭ �� �� ����ϴ� �迭
	JRadioButton [] drinkSelect = {small , medium, large};
	JRadioButton [] coffeeSelect = {hot,ice,addMore};
	JRadioButton [] adeTeaSelect = {lemon, peach, grapefruit};
	JRadioButton [] bakerySelect = {addCreamCheese, plainMuffin, bluberryMuffin};
	GridBagLayout gbLayout;
	GridBagConstraints gbc;
	// ������ư �ߺ�üũ �Ұ��� ��� ��ư�׷�
	ButtonGroup drink = new ButtonGroup();
	ButtonGroup coffee = new ButtonGroup();
	ButtonGroup adeTea = new ButtonGroup();
	ButtonGroup bakery = new ButtonGroup();
	
	//subPanel�� �� ��ư��
	JButton addBtn = new JButton("��ٱ��� ���");
	JButton emptyBtn = new JButton("����");
	protected JButton buyBtn = new JButton("�ֹ��ϱ�");
	
	public BuyPanel() {}
	
	public void startBuyPanel() {
		Dimension menuSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize()); //��ǻ�� ȭ�� ������ �޾ƿ���
		
		gbLayout = new GridBagLayout(); // �׸���� ���̾ƿ� ����
		gbc = new GridBagConstraints(); //�׸��� �� ���̾ƿ� ������ ���� ��� ����.
		
		setTitle("EDIYA COFFEE ORDER"); 
		setBounds(400,5, menuSize.width/2, menuSize.height-50);
		setResizable(false);		
		
		mainPanel.setBackground(Color.BLUE);
		mainPanel.setPreferredSize(new Dimension(getWidth(),getHeight()/5*3));
		GridLayout mainGrid = new GridLayout(3,3);
		mainPanel.setLayout(mainGrid); // �̹��� ������ �׸��� ���̾ƿ� �־��ֱ�
		
		for (int i = 0; i < cafeImg.length; i++) { // �̹��� �迭�� ���� �־��ֱ�
			String filename = String.format("./src/img/%02d.png", i+1);
			cafeImg[i]=Toolkit.getDefaultToolkit().getImage(filename);
		}		
		
		for (int i = 0; i < cafeMenu.length; i++) { // ī��޴� �������� �̹��� ���������� �־��ֱ�
			cafeMenu[i] = new JButton(new ImageIcon(cafeImg[i]));
			cafeMenu[i].setName(menuName[i]);
//			System.out.println(cafeMenu[i].getName());
			cafeMenu[i].addActionListener(this); // Ŭ���� �̺�Ʈ �߻���� �߰�
			cafeMenu[i].setBackground(Color.WHITE);
			cafeMenu[i].setPreferredSize(new Dimension(mainPanel.getHeight()/3,mainPanel.getWidth()/3)); // �̹�����ư ũ������
			mainPanel.add(cafeMenu[i]); // �̹��������� �̹�����ư �߰�
		}		
		
		// ���⼭���� �ɼ�,��ٱ��� ���� ����
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
		
		// �ɼ� ������ Label �ֱ�
		optionPanel.setBackground(Color.white);
		setLayout(gbLayout);
		
		// �ɼ� ������ �׸���� ���� ��Ƽ� �ֱ�
		GridLayout optionGrid = new GridLayout(5,4);
		optionPanel.setLayout(optionGrid);
		optionPanel.setBorder(new LineBorder(Color.black, 2));
		
		JLabel optionLabel = new JLabel("�ɼ� ����",JLabel.CENTER); 
		JLabel orderLabel = new JLabel("������ �޴� : "); 		
		JLabel drinkLabel = new JLabel("����",JLabel.CENTER);
		JLabel coffeeLabel = new JLabel("Ŀ��",JLabel.CENTER);
		JLabel adeTeaLabel = new JLabel("���̵�/��",JLabel.CENTER);
		JLabel bakeryLabel = new JLabel("����Ŀ��",JLabel.CENTER);
		
		// �ɼ� �гο� �����ڽ�, �ؽ�Ʈ�ڽ�, �����۸����� �ֱ�
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
		
		// ��ٱ��� ���� �����ϱ�
		cartLabel = new JLabel("��ٱ���"); 
		cartText= new JTextArea("",1,1);
		
		cartText.setEditable(false);
		cartPanel.setBackground(Color.white);
		setLayout(gbLayout);
		cartPanel.setLayout(new BorderLayout());
		cartPanel.add(cartLabel,BorderLayout.NORTH);

		cartLabel.setBounds(0, 0, 0, 0);
		cartPanel.add(cartText);

		// ��ٱ��� �߰�, ����, �ֹ��ϱ� ��ư ����		
		addBtn.addActionListener(this);
		emptyBtn.addActionListener(this);
		buyBtn.addActionListener(this);

		addBtn.setEnabled(false);
		emptyBtn.setEnabled(false);
		buyBtn.setEnabled(false);


		// �ֹ� ��ư��� option Panel ��ġ��� >> GridBagLayout
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
	
	// ��׸���� ������ �ֱ� ���� �޼���
	private void addGrid(GridBagConstraints gbc,JComponent c , int x , int y , double w , double h){
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.weightx=w;
		gbc.weighty=h;
		
		subPanel.add(c,gbc);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //��ư Ŭ���� �̺�Ʈ �޼���
		Object o = e.getSource();
		JButton button = (JButton)o;
		
		// ��ư���� setName�� �����־ ����� ���� �����ֱ�
		if(button.getName()==null) {			

		}else {
			// �̹��� ��ư Ŭ���� �Ͼ�� �̺�Ʈ ����
			// �̹��� ��ư Ŭ���� �޴��̸��� ���� ��������
			orderOptions="";
//			System.out.println(button.getName()); //��ư Ŭ���� �޴� �̸� ��� Ȯ��
			orderName=button.getName();
			
			// �̹��� ��ư Ŭ���� ��ٱ��Ϲ�ư�� Ȱ��ȭ
			addBtn.setEnabled(true);
			
			int index=0;
			for (int i = 0; i < menuPrice.length; i++) {
				for (int j = 0; j < menuName.length; j++) {
					if(button.getName().equals(menuName[i])) {
						index=i;
					}
				}
			}
//			System.out.println(menuPrice[index]); //��ư Ŭ���� �޴��� �´� ���� ��� Ȯ��
			orderPrices=menuPrice[index];
			orderMenu.setText(orderName);
			orderPrice.setText(""+menuPrice[index]+"��");			

			// ���� ��� ���� �ֹ� ����/�Ұ� ����			
			 //PrMain�� ����� �����̱� ������ ������ ���� Pr ������ �� �Ŀ��� ��
			if(PrMain.storage.get("����")<=0 && (button.getName().equals("�Ƹ޸�ī��") || button.getName().equals("ī���") || button.getName().equals("ī��� �����߶�"))) {
				JOptionPane.showMessageDialog(null, "ǰ���Դϴ�. �������� �������ּ���.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("����")<=0 && (button.getName().equals("��ũ����ũ"))) {
				JOptionPane.showMessageDialog(null, "ǰ���Դϴ�. �������� �������ּ���.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("����û")<=0 && (button.getName().equals("���Ͽ��̵�(ice)") || button.getName().equals("������(hot)"))) {
				JOptionPane.showMessageDialog(null, "ǰ���Դϴ�. �������� �������ּ���.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("����")<=0 && (button.getName().equals("����"))) {
				JOptionPane.showMessageDialog(null, "ǰ���Դϴ�. �������� �������ּ���.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("���̱�")<=0 && (button.getName().equals("���̱�"))) {
				JOptionPane.showMessageDialog(null, "ǰ���Դϴ�. �������� �������ּ���.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			if(PrMain.storage.get("ġ�ƽ����ũ")<=0 && (button.getName().equals("ġ�ƽ����ũ"))) {
				JOptionPane.showMessageDialog(null, "ǰ���Դϴ�. �������� �������ּ���.");
				addBtn.setEnabled(false);
				emptyBtn.setEnabled(false);
				buyBtn.setEnabled(false);
			}
			
			// �޴� �̹��� Ŭ���� �´� �ɼ� �����ڽ��� Ȱ��ȭ
			switch(button.getName()) {
			case "�Ƹ޸�ī��": case "ī���": case "ī��� �����߶�":
				System.out.println(PrMain.storage.get("����"));
				
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(true);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(false);
				}
				break;
			case "��ũ����ũ":
				System.out.println(PrMain.storage.get("����"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(false);
				}
				break;
			case "���Ͽ��̵�(ice)": case "������(hot)":
				System.out.println(PrMain.storage.get("����û"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(true);
					bakerySelect[i].setEnabled(false);
				}
				break;
				
			case "���̱�": 
				System.out.println(PrMain.storage.get("���̱�"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(false);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(true);
				}
				break;
			case "����": 
				System.out.println(PrMain.storage.get("����"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(false);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(true);
				}
				break;
			case "ġ�ƽ����ũ":
				System.out.println(PrMain.storage.get("ġ�ƽ����ũ"));
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(false);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(true);
				}
				break;
			}			
		}
		
		
		// ��ٱ��� ��� ��ư Ŭ��
		if(e.getActionCommand().equals("��ٱ��� ���")) {
			emptyBtn.setEnabled(true);
			buyBtn.setEnabled(true);
//			orderName ���� ���� ��ǰ �̸�
//			orderPrices ���� ���� ��ǰ ����
//			orderOptions ���� ���� ��ǰ �ɼ�
			int optionPrices=0;
			orderOptions="";
			// �ɼ��� �����ߴ����� ���� �Ǻ��÷���
			boolean isChecked=false; //�ɼ�1
			boolean isChecked2=false; //�ɼ�2

			switch(orderName) {
			case "�Ƹ޸�ī��": case "ī���": case "ī��� �����߶�":
				for (int i = 0; i < drinkSelect.length; i++) {
					if(drinkSelect[i].isSelected()) {
						orderOptions += drinkSelect[i].getActionCommand()+" ";
						optionPrices+=Integer.parseInt(drinkSelect[i].getName());
						isChecked=true;
					};
					if(coffeeSelect[i].isSelected()) {
						orderOptions += coffeeSelect[i].getActionCommand()+" ";
						optionPrices+=Integer.parseInt(coffeeSelect[i].getName());
						
						// hot�Ǵ� ice�� �ݵ�� �����ؾ߸� �ɼ��� ���õ� ������ �Ǵ�
						if(coffeeSelect[i].getActionCommand().equals("hot")||coffeeSelect[i].getActionCommand().equals("ice(+500)")) {
							isChecked2=true;							
						}
					}
				}
				break;
			case "��ũ����ũ":
				for (int i = 0; i < drinkSelect.length; i++) {
					if(drinkSelect[i].isSelected()){	
						orderOptions += drinkSelect[i].getActionCommand()+" ";
						optionPrices+=Integer.parseInt(drinkSelect[i].getName());
						isChecked=true;
						isChecked2=true;	
					}				
				}
				break;
			case "���Ͽ��̵�(ice)": case "������(hot)":
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
			case "���̱�": case "����" : case "ġ�ƽ����ũ" :
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
			
			// �ɼ��� ���� �Ǻ����� (�ɼ��� ���ٸ� ��ٱ��Ͽ� �߰� �Ұ���)
			if(!(isChecked&&isChecked2)) {
				JOptionPane.showMessageDialog(null, "�ɼ��� �������ּ���");
			}else {
				System.out.println(orderName+" "+orderOptions+" "+totalPrices); // �ѱ氪 Ȯ��
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
					result+="* "+menu.name+" "+menu.options+" "+menu.totalPrice+"�� \n���� : "+menu.productNum+"\n";
				}
				cartText.setText(result); 
			}						
		}
		
		// ���� ��ư Ŭ��
		if(e.getActionCommand().equals("����")) {
			cartArray.clear();
			cartText.setText("");
			
			emptyBtn.setEnabled(false);
			buyBtn.setEnabled(false);
		}
		
		// �ֹ��ϱ� ��ư Ŭ��
		// ���⼭ cartArray�� ��� �ֹ� ������ ������� / �������� �Ѱ��ֱ�
		String printOrder="";
		if(e.getActionCommand().equals("�ֹ��ϱ�")) {

			// cartArray �Ѱ��ֱ�
			// ��������� cartArray �Ѱ��ֱ�
//			sales.order(cartArray);
			
			boolean is_buy=true;
			// �ֹ��� ���� ��� �پ���...�ϰ� �ٽ� �ѱ�� �� �� ������ �ϴ� ���⼭�� ������ �� �غ�����µ�����ī��
			for (int i = 0; i < cartArray.size(); i++) {
				if(cartArray.get(i).name.equals("�Ƹ޸�ī��")||(cartArray.get(i).name.equals("ī���")||(cartArray.get(i).name.equals("ī��� �����߶�")))) {
					int coffeeN=PrMain.storage.get("����");
					coffeeN-=cartArray.get(i).productNum;
					PrMain.storage.put("����",coffeeN);
					if(coffeeN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "��� �����մϴ�. �������� �������ּ���.");
					}
				}
				if(cartArray.get(i).name.equals("��ũ����ũ")) {
					int milkN = PrMain.storage.get("����");
					milkN -= cartArray.get(i).productNum;
					PrMain.storage.put("����",milkN);
					if(milkN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "��� �����մϴ�. �������� �������ּ���.");
					}
				}
				if(cartArray.get(i).name.equals("���Ͽ��̵�(ice)")||cartArray.get(i).name.equals("������(hot)")) {
					int fruitN = PrMain.storage.get("����û");
					fruitN-=cartArray.get(i).productNum;
					PrMain.storage.put("����û",fruitN);
					if(fruitN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "��� �����մϴ�. �������� �������ּ���.");
					}
				}
				if(cartArray.get(i).name.equals("���̱�")) {
					int bagleN = PrMain.storage.get("���̱�");
					bagleN -= cartArray.get(i).productNum;
					PrMain.storage.put("���̱�",bagleN);
					if(bagleN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "��� �����մϴ�. �������� �������ּ���.");
					}
				}
				if(cartArray.get(i).name.equals("����")) {
					int muffinN = PrMain.storage.get("����");
					muffinN -= cartArray.get(i).productNum;
					PrMain.storage.put("����",muffinN);
					if(muffinN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "��� �����մϴ�. �������� �������ּ���.");
					}
				}
				if(cartArray.get(i).name.equals("ġ�ƽ����ũ")) {
					int cakeN = PrMain.storage.get("ġ�ƽ����ũ");
					cakeN -= cartArray.get(i).productNum;
					PrMain.storage.put("ġ�ƽ����ũ",cakeN);
					if(cakeN<cartArray.get(i).productNum) {
						is_buy=false;
						JOptionPane.showMessageDialog(null, "��� �����մϴ�. �������� �������ּ���.");
					}
				}
			}

			
			// message â���� �ֹ� ���� �����ֱ�
			if(is_buy) {
				int payPrice=0;
				for (int i = 0; i < cartArray.size(); i++) {
					printOrder+="* "+cartArray.get(i).name+"\n"
							+"�ɼ� : "+cartArray.get(i).options+"   ���� : "+cartArray.get(i).productNum
							+"\n"+"���� : "+cartArray.get(i).totalPrice+"��\n";
					payPrice+=cartArray.get(i).totalPrice*cartArray.get(i).productNum;
				}			
				orderNum++;
				JOptionPane.showMessageDialog(null,
						printOrder+"-----------------------------------------------------------------\n"
								+"�ֹ��� �Ϸ�Ǿ����ϴ�.\n ����ȣ : "+orderNum+"\n���� �ݾ� : "+payPrice+"��","�ֹ� ����",JOptionPane.PLAIN_MESSAGE);
				
			}
			// ���� �ʱ�ȭ
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
