package ex15_3_WindowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Frame {
	public static void main(String[] args) {
		
		Frame f = new Frame("어댑터 활용하기");
		f.setBounds(500, 200, 300, 300);
		// 프레임 우상단에 버튼 클릭 이벤트 감지자ㅣ 등록
		
		// 메서드의 파라미터 내부에 생성되는 이름없는 클래스
		// >> 익명 내부 클래스 대부분 이벤트 처리를 할 때 사용됨
		
		// WindowListener 인터페이스에 생성된 추상메서드들 -> MyListener클래스에서 구현 -> MyClosing클래스에서 상속
		// 위의 단계를 생략해 줄 수 있도록 해주는 것이 어댑터 클래스! 
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("frame 최소화됨");
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("frame 최소화 취소");
			}
						
		});
		
		
		f.setVisible(true);
		
	}

}
