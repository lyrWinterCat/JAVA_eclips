package ex15_4_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Button {
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
		
		// 버튼에 이벤트 감지자 등록
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼 눌렀음");
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("2번 버튼 눌렀음");
				
			}
		});
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
						
		});
		
	
		f.setVisible(true);
		
		
	}

}
