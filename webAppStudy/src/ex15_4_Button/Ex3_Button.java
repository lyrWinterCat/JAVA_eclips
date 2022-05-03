package ex15_4_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex3_Button {
	public static void main(String[] args) {
		Frame f = new Frame("버튼생성 프레임");
		f.setBounds(500, 200, 300, 300);
		

		f.setLayout(null);
		

		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		

		btn1.setBounds(30,90,100,50);
		btn2.setBounds(170, 90, 100, 50);		

		f.add(btn1);
		f.add(btn2);
		
		//버튼들이 참조할 이벤트 감지자(인터페이스)생성
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(e.getActionCommand());
				// getActionCommand() : 버튼에 쓰여진 내용을 출력해주는 메서드
				
				switch(e.getActionCommand()) {
				case "1":
					System.out.println("1번 버튼 클릭됨");
					break;
				case "2":
					System.out.println("2번 버튼 클릭됨");
					break;
				}
				
			}
		};

		
		// button 이벤트 감지자
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
						
		});
		
	
		f.setVisible(true);
		
		
	}

}
