package ex14_3_frame;

import java.awt.Color;

public class FrameMain {
	//220502 Frame commit
	public static void main(String[] args) {
		
		// ����� �̿��ؼ� ���� ������ ������ ������ �����ϱ�
		// >> ����� �ڵ� ���̱�
		MyFrame mf1 = new MyFrame();
		MyFrame mf2 = new MyFrame();
		
		new MyFrame(); // �͸�Ŭ�����ε� ���� ����. >> ���� ������ �Ұ��� >>�ظ��ϸ� ������� ����
		
		mf1.setTitle("����ޱ�");
		mf2.setTitle("���� �ޱ�"); // ������ ��ü ���� �ޱ�
		mf2.setBackground(Color.yellow); //Ư����ü�� ���� �ٲٱ�
	}

}
