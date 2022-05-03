package ex15_1_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame("이벤트 감지자");
		
//		f.setSize(300, 300); // 너비 300,높이300px
//		f.setLocation(500, 300); // 위치 : x좌표 500,y좌표 300 떨어진 곳에 생성
		
		// setBounds : setLocation + setSize 메서드
		f.setBounds(500, 300, 300, 300); //(x좌표,y좌표, 너비,높이)
		
		// frame에 클릭을 감지하는 이벤트 감지자 등록
		// 메인에서 직접 WindowListener를 재정의하고 호출하면 코드가 복잡해짐
		// 아까 windowListener를 implement받은 클래스를 호출하는게 더 좋음
		TestListener tl = new TestListener();
		
		// 프레임의 우상단 버튼들에 대한 이벤트를 감지하는 감지자
		f.addWindowListener(tl);
		
		
		
		f.setVisible(true); //가능하다면 맨 밑에 호출
		
	}//main

}
