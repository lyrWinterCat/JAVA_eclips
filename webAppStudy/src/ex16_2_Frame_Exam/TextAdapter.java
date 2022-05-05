package ex16_2_Frame_Exam;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextAdapter implements TextListener{
	TextField tf;
	Button btnInput;

	public TextAdapter(TextField tf,Button btnInput) {
		this.tf=tf;
		this.btnInput=btnInput;
	}
	@Override
	public void textValueChanged(TextEvent e) {
		if(tf.getText().equals("")) {//tf�� �ƹ��͵� �������� �ʴٸ� ��Ȱ��ȭ
			btnInput.setEnabled(false);
		}else {// tf�� ������ �ִٸ� Ȱ��ȭ
			btnInput.setEnabled(true);
		}
		
	}

}
