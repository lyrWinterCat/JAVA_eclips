package ex15_2_listener;

import java.awt.event.WindowEvent;

public class MyClosing extends MyListener{
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("frame �ּ�ȭ �Ǿ���");
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("frame �ּ�ȭ ���");
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

}
