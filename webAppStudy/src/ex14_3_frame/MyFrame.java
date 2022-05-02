package ex14_3_frame;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame{
	// 상속 사용해서 프레임 정의하기
	public MyFrame() {
		setSize(400,300);
		setLocation(600, 300);
		setBackground(Color.CYAN);
		setVisible(true);
	}

}
