package ex16_1_Choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {
	
	static String dayStr = "일요일";
	
	public static void main(String[] args) {
		Frame f = new Frame("질문");
		
		// 프레임 자동배치 해제
		f.setLayout(null);
		
		// 항목선택 상자(choice)
		Choice day = new Choice();
		day.add("일요일");
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		day.add("목요일");
		day.add("금요일");
		day.add("토요일");
		
//		day.setBounds(x, y, width, height); >>이걸로 한번에 설정하지 않음
		
		// choice 객체의 높이는 안에 추가되어있는 내용의 크기에 따라서 달라짐
		// 높이값인 height를 0으로 설정해도 상관이 없음
		day.setSize(150, 0); // choice안에 추가되는 내용에 따라 height가 결정됨
		day.setLocation(50,100);
		
		// 선택상자 이벤트 감지자 등록
		day.addItemListener(new ChoiceAdapter(f));
		
		
		
		// 만들어진 선택상자 객체 (day)를 frame에 추가
		f.add(day);
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setBounds(400, 100, 500, 250);
		f.setVisible(true);
	}

}
