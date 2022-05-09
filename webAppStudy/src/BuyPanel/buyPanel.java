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
	JButton [] cafeMenu = new JButton[9]; //카페메뉴 사진이 들어갈 버튼
	JButton addBtn = new JButton("장바구니 추가"); //화면에 장바구니 추가 버튼
	JPanel menuPanel = new JPanel(new GridLayout(3,3)); //카페메뉴 사진 그리드레이아웃 생성
	String [] menuName = {"아메리카노","카페라떼","카라멜 마끼야또","밀크셰이크","과일에이드",
			"과일차","베이글","머핀","치즈스틱케이크"}; 
	Image [] cafeImg = new Image[9];
	
	static buyPanel window;
	
	public buyPanel() {
		setTitle("구매 화면");
		setBounds(350, 25, 850, 800);
		for (int i = 0; i < cafeImg.length; i++) {
			String filename=String.format("./src/img/%02d.png", i+1);
			cafeImg[i]=Toolkit.getDefaultToolkit().getImage(filename);
		}		
		viewCafeMenu();	
		
		addBtn.setPreferredSize(new Dimension(400,100)); //장바구니 버튼 만들기
		addBtn.setFont(new Font("D2Coding",Font.BOLD,50));
		addBtn.addActionListener(this);
		add(addBtn,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //나가기버튼
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
