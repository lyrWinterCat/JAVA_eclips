package ex15_1_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame("�̺�Ʈ ������");
		
//		f.setSize(300, 300); // �ʺ� 300,����300px
//		f.setLocation(500, 300); // ��ġ : x��ǥ 500,y��ǥ 300 ������ ���� ����
		
		// setBounds : setLocation + setSize �޼���
		f.setBounds(500, 300, 300, 300); //(x��ǥ,y��ǥ, �ʺ�,����)
		
		// frame�� Ŭ���� �����ϴ� �̺�Ʈ ������ ���
		// ���ο��� ���� WindowListener�� �������ϰ� ȣ���ϸ� �ڵ尡 ��������
		// �Ʊ� windowListener�� implement���� Ŭ������ ȣ���ϴ°� �� ����
		TestListener tl = new TestListener();
		
		// �������� ���� ��ư�鿡 ���� �̺�Ʈ�� �����ϴ� ������
		f.addWindowListener(tl);
		
		
		
		f.setVisible(true); //�����ϴٸ� �� �ؿ� ȣ��
		
	}//main

}
