package ex15_2_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame("프레임");
		f.setBounds(500, 200, 300, 300);
		
		// 인터페이스에 생성된 추상메서드들 -> MyListener 클래스에서 구현
		// 구현한 MyListener클래스를  MyClosing으로 상속을 받음 >> 사용
		// >> 위의 과정을 해결해 주는 것이 WindowAdapter클래스! 
//		MyClosing mc = new MyClosing();
//		f.addWindowListener(mc);
		
		// 익명클래스 : 이름이 없는 클래스 
		// new로 생성된 시점에서 메모리를 잠시 할당받았다가
		// 사용이 끝나면 자동으로 제거됨
		f.addWindowListener(new MyClosing()); //익명클래스 사용 (자주 사용하지 않는 기능에 대해 사용하면 메모리 절약에 좋음)
		
		f.setVisible(true);
	}

}
