package ex15_2_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame("������");
		f.setBounds(500, 200, 300, 300);
		
		// �������̽��� ������ �߻�޼���� -> MyListener Ŭ�������� ����
		// ������ MyListenerŬ������  MyClosing���� ����� ���� >> ���
		// >> ���� ������ �ذ��� �ִ� ���� WindowAdapterŬ����! 
//		MyClosing mc = new MyClosing();
//		f.addWindowListener(mc);
		
		// �͸�Ŭ���� : �̸��� ���� Ŭ���� 
		// new�� ������ �������� �޸𸮸� ��� �Ҵ�޾Ҵٰ�
		// ����� ������ �ڵ����� ���ŵ�
		f.addWindowListener(new MyClosing()); //�͸�Ŭ���� ��� (���� ������� �ʴ� ��ɿ� ���� ����ϸ� �޸� ���࿡ ����)
		
		f.setVisible(true);
	}

}
