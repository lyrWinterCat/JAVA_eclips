package ex15_4_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {
		Frame f = new Frame("버튼생성 프레임");
		f.setBounds(500, 200, 300, 300);
		
		
		// frame은 기본적으로 add되는 객체를 화면 가득 채우도록 설계가 되어있음
		// 해당 설계를 무시하고 add되는 객체의 위치나 크기값을 지정할 수 있도록 설정하는 코드가
		//setLayout(null)
		// >> 프레임의 자동배치 끄기 
		f.setLayout(null);
		
		//버튼생성
		Button btnOK = new Button("확인");
		Button btnClose = new Button("닫기");
		
		// 자동배체가 꺼져있는 frame에 추가될 버튼들의 크기와 위치값을 지정
		// setBounds
		btnOK.setBounds(30,90,100,50);
		btnClose.setBounds(170, 90, 100, 50);

		
		// 생성된 버튼 frame에 추가
		f.add(btnOK);
		f.add(btnClose);
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				System.out.println("frame 최소화됨");
//			}
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				System.out.println("frame 최소화 취소");
//			}						
		});
		
	
		f.setVisible(true);
		
		
	}

}
