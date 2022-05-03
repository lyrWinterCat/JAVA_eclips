package ex15_2_listener;

import java.awt.event.WindowEvent;

public class MyClosing extends MyListener{
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("frame 최소화 되었음");
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("frame 최소화 취소");
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

}
