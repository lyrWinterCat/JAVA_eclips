package EdiyaMain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Account.Sales;
import BuyPanel.BuyPanel;
import Storage.PrMain;

public class EdiyaMain extends JFrame implements ActionListener{
	BuyPanel buy;
	Sales sales = new Sales();
	PrMain prMain = new PrMain();
	private String password = "1234";
	
	public EdiyaMain() {}
	
	public void startEdiyaMain() {
		Dimension mainSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		setTitle("�̵�߿� ���� ���� ȯ���մϴ�!"); 
		setSize(mainSize.width/4,mainSize.height/5*2);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new FlowLayout());
		
		Image ediyaImg = new ImageIcon(EdiyaMain.class.getResource("../mainImage/EdiyaLogo.png")).getImage();
		JLabel imgLabel = new JLabel(new ImageIcon(ediyaImg));
		add(imgLabel);
		
		JButton buyBtn = new JButton("��ǰ����");
		JButton adminBtn = new JButton("������");	
		
		buyBtn.addActionListener(this);
		adminBtn.addActionListener(this);
		add(buyBtn);
		add(adminBtn);		
		
		setVisible(true);
	}	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
//	JTextField pwText;
	JPasswordField pwText;
	JButton salesBtn;
	JButton storageBtn;
	JButton login;
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame adminFrame = new JFrame();
		JLabel pwArea = new JLabel("��й�ȣ �Է�");
		
		if(e.getActionCommand().equals("��ǰ����")) {
			buy = new BuyPanel();
			buy.startBuyPanel();
		}
		if(e.getActionCommand().equals("������")) {

			salesBtn = new JButton("�������");
			storageBtn = new JButton("������");
			login = new JButton("Ȯ��");
			pwText = new JPasswordField();
			adminFrame.setTitle("������ ���");
			adminFrame.setSize(300,150);
			adminFrame.setResizable(false);
			adminFrame.setLocationRelativeTo(null);
			adminFrame.setLayout(new FlowLayout());
			
			pwArea.setSize(100, 25);
			pwArea.setBackground(Color.white);
			pwText.setPreferredSize(new Dimension(100, 25));			
			login.setPreferredSize(new Dimension(80,30));
			storageBtn.setPreferredSize(new Dimension(100,30));
			salesBtn.setPreferredSize(new Dimension(100,30));
			login.addActionListener(this);
			storageBtn.addActionListener(this);
			salesBtn.addActionListener(this);
			
			storageBtn.setEnabled(false);
			salesBtn.setEnabled(false);
			
			adminFrame.add(pwArea);
			adminFrame.add(pwText);
			adminFrame.add(login);
			adminFrame.add(salesBtn);
			adminFrame.add(storageBtn);			
			
			adminFrame.setVisible(true);
		}
		if(e.getActionCommand().equals("������")) {
			prMain.startPrMain();
			storageBtn.setEnabled(false);
			salesBtn.setEnabled(false);
		}
		if(e.getActionCommand().equals("�������")) {
			sales.startSales();		
			storageBtn.setEnabled(false);
			salesBtn.setEnabled(false);
		}
		if(e.getActionCommand().equals("Ȯ��")) {
			boolean flag=true;
			if(getPassword().length()!=pwText.getPassword().length) {
				System.out.println("����");
				System.out.println(pwText.getPassword().length);
				System.out.println("������ ��й�ȣ"+getPassword().length());
				flag=false;
			}
			if(flag) {
				for (int i = 0; i < pwText.getPassword().length; i++) {
					if(pwText.getPassword()[i]!=getPassword().charAt(i)) {
						System.out.println("����22");
						flag=false;
					}
				}				
			}
			if(flag) {
				storageBtn.setEnabled(true);
				salesBtn.setEnabled(true);
				pwText.setText("");

			}else {
				JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�.\n�ٽ� �Է� ���ּ���.");
			}
		}
	}
	public static void main(String[] args) {
		EdiyaMain mainPage = new EdiyaMain();
//		mainPage.sales = new Sales();
//		mainPage.prMain = new PrMain();	
	}
}
