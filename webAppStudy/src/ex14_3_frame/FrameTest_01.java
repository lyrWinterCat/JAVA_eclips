package ex14_3_frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest_01 {
	public static void main(String[] args) {
		//UI (User Interface) : 눈에 보여지는 것들을 디자인하는 작업
		// 자바는 UI를 위해서 awt,swing이라고 하는 패키지를 제공하고있음
		
		Frame f = new Frame("첫 프레임");
		
		f.setSize(400, 300); // 프레임의 크기
		f.setLocation(500, 200);//프레임 생성 위치
		f.setBackground(Color.cyan); // 프레임 백그라운드 컬러 지정
		
//		Frame f2 = new Frame("두번째 프레임");
//		f2.setSize(400, 300);
//		f2.setLocation(500, 200);
		
		
		f.setVisible(true); // 프레임 보이도록 하는 명령어
//		f2.setVisible(true); 
		// 반복되는 메서드가 많음>> 클래스로 정의
	}

}
