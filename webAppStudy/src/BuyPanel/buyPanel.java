package BuyPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class buyPanel extends JFrame implements ActionListener, Runnable{
	JButton [] cafeMenu = new JButton[9]; //ī��޴� ������ �� ��ư
	JButton addBtn = new JButton("��ٱ��� �߰�"); //ȭ�鿡 ��ٱ��� �߰� ��ư
	JPanel menuPanel = new JPanel(new GridLayout(3,3)); //ī��޴� ���� �׸��巹�̾ƿ� ����
	String [] menuName = {"�Ƹ޸�ī��","ī���","ī��� �����߶�","��ũ����ũ","���Ͽ��̵�",
			"������","���̱�","����","ġ�ƽ����ũ"}; 
	Image [] cafeImg = new Image[9];
	
	static buyPanel window;
	
	public buyPanel() {
		setTitle("���� ȭ��");
		setBounds(350, 25, 850, 800);
		for (int i = 0; i < cafeImg.length; i++) {
			String filename=String.format("./src/img/%02d.png", i+1);
			cafeImg[i]=Toolkit.getDefaultToolkit().getImage(filename);
		}		
		viewCafeMenu();	
		
		addBtn.setPreferredSize(new Dimension(400,100)); //��ٱ��� ��ư �����
		addBtn.setFont(new Font("D2Coding",Font.BOLD,50));
		addBtn.addActionListener(this);
		add(addBtn,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�������ư
		setVisible(true);
	}
	
	private void viewCafeMenu() {
//		menuPanel.setBounds(350, 25, 600, 600);
//		menuPanel.setBackground(Color.white);
		for (int j = 0; j < cafeMenu.length; j++) {
			cafeMenu[j]=new JButton(new ImageIcon(cafeImg[j]));
			cafeMenu[j].addActionListener(this);
			menuPanel.add(cafeMenu[j]);
			cafeMenu[j].setName(menuName[j]);
		}
		add(menuPanel);
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		window=new buyPanel();
	}//main



}
