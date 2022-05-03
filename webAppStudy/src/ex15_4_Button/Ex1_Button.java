package ex15_4_Button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {
		Frame f = new Frame("��ư���� ������");
		f.setBounds(500, 200, 300, 300);
		
		
		// frame�� �⺻������ add�Ǵ� ��ü�� ȭ�� ���� ä�쵵�� ���谡 �Ǿ�����
		// �ش� ���踦 �����ϰ� add�Ǵ� ��ü�� ��ġ�� ũ�Ⱚ�� ������ �� �ֵ��� �����ϴ� �ڵ尡
		//setLayout(null)
		// >> �������� �ڵ���ġ ���� 
		f.setLayout(null);
		
		//��ư����
		Button btnOK = new Button("Ȯ��");
		Button btnClose = new Button("�ݱ�");
		
		// �ڵ���ü�� �����ִ� frame�� �߰��� ��ư���� ũ��� ��ġ���� ����
		// setBounds
		btnOK.setBounds(30,90,100,50);
		btnClose.setBounds(170, 90, 100, 50);

		
		// ������ ��ư frame�� �߰�
		f.add(btnOK);
		f.add(btnClose);
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				System.out.println("frame �ּ�ȭ��");
//			}
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				System.out.println("frame �ּ�ȭ ���");
//			}						
		});
		
	
		f.setVisible(true);
		
		
	}

}
