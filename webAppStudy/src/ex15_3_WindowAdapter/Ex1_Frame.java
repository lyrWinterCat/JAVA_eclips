package ex15_3_WindowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Frame {
	public static void main(String[] args) {
		
		Frame f = new Frame("����� Ȱ���ϱ�");
		f.setBounds(500, 200, 300, 300);
		// ������ ���ܿ� ��ư Ŭ�� �̺�Ʈ �����ڤ� ���
		
		// �޼����� �Ķ���� ���ο� �����Ǵ� �̸����� Ŭ����
		// >> �͸� ���� Ŭ���� ��κ� �̺�Ʈ ó���� �� �� ����
		
		// WindowListener �������̽��� ������ �߻�޼���� -> MyListenerŬ�������� ���� -> MyClosingŬ�������� ���
		// ���� �ܰ踦 ������ �� �� �ֵ��� ���ִ� ���� ����� Ŭ����! 
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("frame �ּ�ȭ��");
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("frame �ּ�ȭ ���");
			}
						
		});
		
		
		f.setVisible(true);
		
	}

}
