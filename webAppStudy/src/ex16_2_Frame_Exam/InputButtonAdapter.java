package ex16_2_Frame_Exam;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputButtonAdapter implements ActionListener {
	TextField tf;
	TextArea ta;

	public InputButtonAdapter(TextField tf, TextArea ta) {
		this.tf=tf;
		this.ta=ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ta ������ ��� ���� �����ϴ� �޼��� 
//		ta.setText(tf.getText());	
		System.out.println("ȣ���");
		
		ta.append(tf.getText()+"\n");
		
		tf.setText(""); // �ѱ�� �� �� �Է�ĭ �������� �ǵ����� 
		tf.requestFocus(); // tf�� Ŀ���� �̵��� �� >> textField�� Ŀ���� ��������
		
	}

}
