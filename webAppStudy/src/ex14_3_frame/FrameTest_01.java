package ex14_3_frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest_01 {
	public static void main(String[] args) {
		//UI (User Interface) : ���� �������� �͵��� �������ϴ� �۾�
		// �ڹٴ� UI�� ���ؼ� awt,swing�̶�� �ϴ� ��Ű���� �����ϰ�����
		
		Frame f = new Frame("ù ������");
		
		f.setSize(400, 300); // �������� ũ��
		f.setLocation(500, 200);//������ ���� ��ġ
		f.setBackground(Color.cyan); // ������ ��׶��� �÷� ����
		
//		Frame f2 = new Frame("�ι�° ������");
//		f2.setSize(400, 300);
//		f2.setLocation(500, 200);
		
		
		f.setVisible(true); // ������ ���̵��� �ϴ� ��ɾ�
//		f2.setVisible(true); 
		// �ݺ��Ǵ� �޼��尡 ����>> Ŭ������ ����
	}

}
