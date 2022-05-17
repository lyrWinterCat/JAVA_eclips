package Storage;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PrMain extends JFrame implements ActionListener , ItemListener{
	public static  HashMap<String,Integer> storage;
	
	String radioStr = "";//이벤트 감지자에서 값을 변경하여 사용할 변수

	protected Object frame;
	
	JButton bt1;
	JButton bt2;
	JButton c1;
	JButton c2;
	JButton c3;
	JButton c4;
	JButton c5;
	JButton c6;
	JButton c7;
	
	JCheckBox cr1 = new JCheckBox("자몽");
	JCheckBox cr2 = new JCheckBox("레몬");
	JCheckBox cr3 = new JCheckBox("복숭아");
	JCheckBox cb1 = new JCheckBox("크림치즈");
	JCheckBox cb2 = new JCheckBox("베이글");
	JCheckBox cb3 = new JCheckBox("치즈케이크");
	JCheckBox m1 = new JCheckBox("플레인");
	JCheckBox m2 = new JCheckBox("블루베리");

	
	
	//상품버튼 클릭시 활성화/비활성화 할 배열
	JCheckBox[] crSelect = {cr1,cr2,cr3};
	JCheckBox[] cbSelect = {cb1,cb2,cb3};
	JCheckBox[] mSelect = {m1,m2};
	
	TextArea ta;
	
//	JCheckBox[] crSelect = {cr1, cr2, cr3};
//	JCheckBox[] cbSelect = {cb1, cb2, cb3};
//	JCheckBox[] mSelect = {m1, m2};
	
	public PrMain() {		
		// 재고 값 주고받을 hashMap설정
		storage = new HashMap<String, Integer>();
		storage = new HashMap<String, Integer>();
		storage.put("원두",5);
		storage.put("우유",5);
		storage.put("시럽",5);
		storage.put("휘핑크림",5);
		storage.put("머핀",5);
		storage.put("베이글",5);
		storage.put("베이커리",5);
		storage.put("과일청",5);
		storage.put("치즈스틱케이크",5);
	
	};
	
	public void startPrMain() {			

		
		//프레임 설정
		JFrame f = new JFrame("재고 관리창");
		f.setBackground(Color.white);
		f.setSize(900, 1050);
		f.setLocationRelativeTo(null);
		f.setResizable(false);//임의 크기조절 불가
		f.setLayout(null); //자동배치 끄기
		
		Font font1 = new Font("돋음", Font.BOLD, 25);
		Font font2 = new Font("돋음", Font.BOLD, 18);
		
		JLabel l = new JLabel("재고 수량을 확인해주세요");
		l.setFont(font1);
		l.setBounds(300, 40, 450, 30);
//		l.setHorizontalAlignment(l.CENTER);//중앙배열
		
		
		// 재고 상품 목록
		String[] name = {"원두","우유","시럽","과일청","크림치즈","휘핑크림","베이커리"};  //상품명	
		int[] coinPrice = {100,200,300,200,100,400,500};  //단가
		JButton[] storabtn = new JButton[9];
		
		//메인상품 버튼
		c1 = new JButton("원두");
		c2 = new JButton("우유");
		c3 = new JButton("시럽");
		c4 = new JButton("휘핑크림");
		c5 = new JButton("과일청");
		c6 = new JButton("베이커리");
		c7 = new JButton("머핀");

		
		
		c1.setBounds(60, 280, 180, 50);
		c1.setFont(font2);
		c1.setName("100");
		c1.addActionListener(this); 
				

		c2.setBounds(250, 280, 180, 50);
		c2.setFont(font2);
		c2.setName("200");
		c2.addActionListener(this);
		
		c3.setBounds(440, 280, 180, 50);
		c3.setFont(font2);
		c3.setName("300");
		c3.addActionListener(this);
				

		c4.setBounds(630, 280, 180, 50);
		c4.setFont(font2);
		c4.setName("200");
		c4.addActionListener(this);
		

		c5.setBounds(140, 350, 180, 50);
		c5.setFont(font2);
		c5.setName("100");
		c5.addActionListener(this);
			

		c6.setBounds(350, 350, 180, 50);
		c6.setFont(font2);
		c6.setName("400");
		c6.addActionListener(this);
				
		c7.setBounds(560, 350, 180, 50);
		c7.setFont(font2);
		c7.setName("500");
		c7.addActionListener(this);
				
				
				//추가 상품목록(과일청에 포함)
		cr1.setBounds(100, 450, 90, 30);
		cr1.setFont(font2);
		cr1.setName("100");
		cr1.setEnabled(false);
				
		cr2.setBounds(300, 450, 90, 30);
		cr2.setFont(font2);	
		cr2.setName("100");
		cr2.setEnabled(false);
				
		cr3.setBounds(500, 450, 90, 30);
		cr3.setFont(font2);
		cr3.setName("100");
		cr3.setEnabled(false);
				
					
				

		//추가 상품목록(베이커리에 포함)
		cb1.setBounds(100, 540, 150, 30);
		cb1.setFont(font2);	
		cb1.setEnabled(false);
				
		cb2.setBounds(300, 540, 90, 30);
		cb2.setFont(font2);
		cb2.setEnabled(false);
		
		cb3.setBounds(500, 540, 150, 30);
		cb3.setFont(font2);
		cb3.setEnabled(false);
						
				
				//추가 상품목록(머핀에 포함)
		m1.setBounds(100, 630, 90, 30);
		m1.setFont(font2);
		m1.setBackground(null);
		m1.setEnabled(false);
			
		m2.setBounds(300, 630, 150, 30);
		m2.setFont(font2);
		m2.setBackground(null);
		m2.setEnabled(false);
		
		
		JCheckBox[] crSelect = {cr1,cr2,cr3};
		JCheckBox[] cbSelect ={cb1,cb2,cb3};
		JCheckBox[] mSelect ={m1,m2};
						
		
		//버튼만들기(구매, 취소)
		bt1 = new JButton("구매");
		bt1.setBounds(100, 820, 300, 130);
		bt1.setFont(font1);
		f.add(bt1);
		bt1.addActionListener(this);						
		bt2 = new JButton("취소");
		bt2.setBounds(500, 820, 300, 130);
		bt2.setFont(font1);
		f.add(bt2);
		bt2.addActionListener(this);
				
		//현재 재고수량 가져오기		
		ta = new TextArea("",0,0,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		ta.setBounds(80, 100, 700, 120);
		ta.setBackground(Color.white);
		ta.setEditable(false);//ta에 임의로 값을 추가할 수 없도록.
						
		f.add(ta);
		
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(c5);
		f.add(c6);
		f.add(c7);
		//추가옵션(과일청)
		f.add(cr1);
		f.add(cr2);
		f.add(cr3);
		//추가옵션(베이커리)
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		//추가옵션(머핀)
		f.add(m1);
		f.add(m2);
				
		f.add(l);		
		
		
		//창닫기
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				}
			});		

		
	}//main

	@Override
	public void actionPerformed(ActionEvent e) { //메뉴 버튼 클릭시 발생하는 이벤트
		Object ob = e.getSource();
		JButton button = (JButton) ob;
		ta.setText("");
		int buyN = 10;
		
		if(button.getName()==null) {
			
		}else {	
			int index=0;
//			System.out.println(e.getActionCommand());
//			System.out.println(c1.getName());
			
		}
		if(e.getActionCommand().equals("구매")) {
			System.out.println("구매버튼 클릭됨");
			for (int i = 0; i < cbSelect.length; i++) {
				if(crSelect[i].isSelected()) { //과일청
					storage.put("과일청", storage.get("과일청")+buyN);
				}
				if(cbSelect[i].isSelected()) { // 베이커리 (크림치즈 베이글 치즈케이크
					storage.put("베이커리",storage.get("베이커리")+buyN);
				}				
			}
			for (int i = 0; i < mSelect.length; i++) {
				if(mSelect[i].isSelected()) { // 머핀 (플레인 블베)
					storage.put("머핀",storage.get("머핀")+buyN);
				}
			}
		}
		
		
		//상품메뉴 클릭시 이벤트 발생
		switch(e.getActionCommand()) {
		case "원두": 
			ta.setText("원두 수량 : "+storage.get("원두")); //텍스트 에어리얼에 값 출력
		for(int i = 0; i < crSelect.length; i++) { //값이 3개
			crSelect[i].setEnabled(false);
			cbSelect[i].setEnabled(false);
		}
		for(int i = 0; i < mSelect.length; i++) { //값이 2개
			mSelect[i].setEnabled(false);
		}
		storage.put("원두",storage.get("원두")+buyN);
		break;	
		case "우유": 
			ta.setText("우유 수량 : "+storage.get("우유"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			storage.put("우유",storage.get("우유")+buyN);
			break;	
		case "시럽":
			ta.setText("시럽 수량 : "+storage.get("시럽"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			storage.put("시럽",storage.get("시럽")+buyN);
			break;	
		
		case "휘핑크림":
			ta.setText("휘핑크림 수량 : "+storage.get("휘핑크림"));
			for (int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			storage.put("휘핑크림",storage.get("휘핑크림")+buyN);
			break;
			
		case "과일청": 
			ta.setText("과일청 수량 : "+storage.get("과일청"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(true);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			break;
			
		case "베이커리": 
			ta.setText("베이커리 수량 : "+storage.get("베이커리"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(true);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			break;
			
		case "머핀":
			ta.setText("머핀 수량 : "+storage.get("머핀"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(true);
			}
			break;
		case "구매":
			System.out.println("구매버튼 클릭됨");
			break;
		case "취소":
			System.out.println("취소버튼 클릭됨");
		
			}
		}
		
	@Override
	public void itemStateChanged(ItemEvent e) {//PrMain 아이템이벤트
		// TODO Auto-generated method stub
//		c4.addItemListener(null);
//		if(e.getStateChange()==ItemEvent.SELECTED);
//		cb1.setEnabled(true);
//		cb2.setEnabled(true);
//		cb3.setEnabled(true);
	}
	
	
}
