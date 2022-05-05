package ex16_1_Choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {
	
	static String dayStr = "�Ͽ���";
	
	public static void main(String[] args) {
		Frame f = new Frame("����");
		
		// ������ �ڵ���ġ ����
		f.setLayout(null);
		
		// �׸��� ����(choice)
		Choice day = new Choice();
		day.add("�Ͽ���");
		day.add("������");
		day.add("ȭ����");
		day.add("������");
		day.add("�����");
		day.add("�ݿ���");
		day.add("�����");
		
//		day.setBounds(x, y, width, height); >>�̰ɷ� �ѹ��� �������� ����
		
		// choice ��ü�� ���̴� �ȿ� �߰��Ǿ��ִ� ������ ũ�⿡ ���� �޶���
		// ���̰��� height�� 0���� �����ص� ����� ����
		day.setSize(150, 0); // choice�ȿ� �߰��Ǵ� ���뿡 ���� height�� ������
		day.setLocation(50,100);
		
		// ���û��� �̺�Ʈ ������ ���
		day.addItemListener(new ChoiceAdapter(f));
		
		
		
		// ������� ���û��� ��ü (day)�� frame�� �߰�
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
