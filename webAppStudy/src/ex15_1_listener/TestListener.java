package ex15_1_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// �������� frame ���� x��ư�� Ŭ���ϸ� ȣ��Ǵ� �޼���
		System.out.println("���� X��ư ������");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// �������� frame ���� �ּ�ȭ��ư (-)�� �������� ȣ��Ǵ� �޼���
		System.out.println("�ּ�ȭ �Ǿ���");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// �ּ�ȭ ������ Frame�� ���� ũ��� ���ƿ� �� ȣ��Ǵ� �޼���
		System.out.println("�ּ�ȭ ���");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
