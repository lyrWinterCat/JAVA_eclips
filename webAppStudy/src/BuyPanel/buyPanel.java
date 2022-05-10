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
	
	JPanel mainPanel = new JPanel(); //ī�� �̹��� ����
	JPanel subPanel = new JPanel(); // �ɼǼ���+��ٱ��� ����
	JPanel optionPanel = new JPanel(); //�ɼǿ���
	JPanel cartPanel = new JPanel(); // ��ٱ��� ����
	
	String [] menuName = {"�Ƹ޸�ī��","ī���","ī��� �����߶�","��ũ����ũ","���Ͽ��̵� (ice)",
			"������ (hot)","���̱�","����","ġ�ƽ����ũ"}; 
	int [] menuPrice = {3200,3700,3900,4300,3800,3800,1900,2000,1800};
	JButton [] cafeMenu = new JButton[9];
	Image [] cafeImg = new Image[9];
	
	// ��ٱ��� ��ǰ �� ����
	int cartProduct;
	// ��ٱ��� �� ����
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
	
	//�̹��� ��ư Ŭ���� JLabel�� �ѱ� ī�� �޴�, ����
	String orderName = "";
	int orderPrices=0;
	String options="";
	
	//optionPanel�� �� ����
	JLabel orderMenu = new JLabel(orderName);
	JLabel orderPrice = new JLabel(""+orderPrices+"��");
	JRadioButton small = new JRadioButton("small");
	JRadioButton medium = new JRadioButton("medium (+500)");
	JRadioButton large = new JRadioButton("Large (+800)");
	JRadioButton hot = new JRadioButton("hot");
	JRadioButton ice = new JRadioButton("ice (+500)");
	JRadioButton addMore = new JRadioButton("�÷�/�����߰� (+500)");
	JRadioButton lemon = new JRadioButton("����");
	JRadioButton peach = new JRadioButton("������");
	JRadioButton grapefruit = new JRadioButton("�ڸ�");
	JRadioButton addCreamCheese = new JRadioButton("ũ��ġ�� �߰� (+500)");
	JRadioButton plainMuffin = new JRadioButton("�÷��� ����");
	JRadioButton bluberryMuffin = new JRadioButton("��纣�� ����");
	
	// �޴��� �°� ��ư ��Ȱ��ȭ �� �� ����ϴ� �迭
	JRadioButton [] drinkSelect = {small , medium, large};
	JRadioButton [] coffeeSelect = {hot,ice,addMore};
	JRadioButton [] adeTeaSelect = {lemon, peach, grapefruit};
	JRadioButton [] bakerySelect = {addCreamCheese, plainMuffin, bluberryMuffin};
	GridBagLayout gbLayout;
	GridBagConstraints gbc;
	// ������ư �ߺ�üũ Ȯ�� ��� ��� ��ư�׷�
	ButtonGroup drink = new ButtonGroup();
	ButtonGroup coffee = new ButtonGroup();
	ButtonGroup adeTea = new ButtonGroup();
	ButtonGroup bakery = new ButtonGroup();
	
	
	public buyPanel() {
		Dimension menuSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize()); //��ǻ�� ȭ�� ������ �޾ƿ���
		
		gbLayout = new GridBagLayout(); // �׸���� ���̾ƿ� ����
		gbc = new GridBagConstraints(); //�׸��� �� ���̾ƿ� ������ ���� ��� ����.
		
		setTitle("�̵�� �޴� �ֹ� ���α׷�"); 
		setBounds(400,5, menuSize.width/2, menuSize.height-50);
		setResizable(false);
		
		
		mainPanel.setBackground(Color.BLUE);
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
		
		JLabel optionLabel = new JLabel("�ɼ� ����"); 
		JLabel orderLabel = new JLabel("������ �޴� : "); 
		
		
		JLabel drinkLabel = new JLabel("����",JLabel.LEFT);
		JLabel coffeeLabel = new JLabel("Ŀ��",JLabel.LEFT);
		JLabel adeTeaLabel = new JLabel("���̵�/��",JLabel.LEFT);
		JLabel bakeryLabel = new JLabel("����Ŀ��",JLabel.LEFT);
		
//		JLabel [] labels = new JLabel[8]; 
//		String [] labelNames = {"�ɼ� ����", "������ �޴� : ",orderName,""+orderPrices+"��",
//				"����","Ŀ��","���̵�/��","����Ŀ��"};
//		for (int i = 0; i < labelNames.length; i++) {
//			labels[i]=new JLabel(labelNames[i],JLabel.LEFT);
//		}
		

		// �ɼ� �гο� �����ڽ�, �ؽ�Ʈ�ڽ�, �����۸����� �ֱ�
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
		
		// ��ٱ��� ������ �ؽ�Ʈ�ڽ� �ֱ�
		JLabel cartLabel = new JLabel("��ٱ���",JLabel.CENTER); 
		
		// ��ٱ��� ������ Label �ֱ�
		cartPanel.setBackground(Color.white);
		setLayout(gbLayout);
		cartPanel.add(cartLabel,BorderLayout.NORTH);

		// ��ư���� �ɼ�,��ٱ��� ���� ��ġ �����غ���		
		JButton addBtn = new JButton("��ٱ��� ���");
		JButton emptyBtn = new JButton("����");
		JButton buyBtn = new JButton("�ֹ��ϱ�");
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
		
		if(e.getActionCommand().equals("��ٱ��� ���")) {
//			orderName ���� ���� ��ǰ �̸�
//			orderPrice ���� ���� ��ǰ ����

		}

		if(button.getName()==null) {			
//			System.out.println(e.getActionCommand());		
			
		}else {
			// �̹��� ��ư Ŭ���� �ش� �޴� �̸��� ������ �ҷ������� �̺�Ʈ ����
			options="";
			System.out.println(button.getName()); //��ư Ŭ���� �޴� �̸� ��� Ȯ��
			orderName=button.getName();
			
			int index=0;
			for (int i = 0; i < menuPrice.length; i++) {
				for (int j = 0; j < menuName.length; j++) {
					if(button.getName().equals(menuName[i])) {
						index=i;
					}
				}
			}
			System.out.println(menuPrice[index]); //��ư Ŭ���� �޴��� �´� ���� ��� Ȯ��
			orderPrices=menuPrice[index];
			orderMenu.setText(orderName);
			orderPrice.setText(""+menuPrice[index]+"��");
			
			// �޴� �̹��� Ŭ���� �´� �ɼ� �����ڽ��� Ȱ��ȭ
			switch(button.getName()) {
			case "�Ƹ޸�ī��": case "ī���": case "ī��� �����߶�":
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(true);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(false);
				}

				break;
			case "��ũ����ũ":
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(false);
					bakerySelect[i].setEnabled(false);
				}

				break;
			case "���Ͽ��̵� (ice)": case "������ (hot)":
				for (int i = 0; i < drinkSelect.length; i++) {
					drinkSelect[i].setEnabled(true);
					coffeeSelect[i].setEnabled(false);
					adeTeaSelect[i].setEnabled(true);
					bakerySelect[i].setEnabled(false);
				}

				break;
			case "���̱�": case "����": case "ġ�ƽ����ũ":
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
