package ex14_3_frame;

import java.awt.Color;

public class FrameMain {
	//220502 Frame commit
	public static void main(String[] args) {
		
		// 상속을 이용해서 같은 조건의 프레임 여러개 생성하기
		// >> 공통된 코드 줄이기
		MyFrame mf1 = new MyFrame();
		MyFrame mf2 = new MyFrame();
		
		new MyFrame(); // 익명클래스로도 생성 가능. >> 차후 수정이 불가능 >>왠만하면 사용하지 않음
		
		mf1.setTitle("제목달기");
		mf2.setTitle("내용 달기"); // 프레임 객체 제목 달기
		mf2.setBackground(Color.yellow); //특정개체만 배경색 바꾸기
	}

}
