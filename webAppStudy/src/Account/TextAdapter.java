package Account;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextAdapter implements TextListener{

	TextField tf;
	Button btn_input;
	
	
	public TextAdapter(TextField tf, Button btn_input) {
		this.tf = tf;
		this.btn_input = btn_input;
	}
	
	@Override
	public void textValueChanged(TextEvent e) {
		if(tf.getText().equals("")) {
			//tf�� �ƹ��͵� �������� �ʴٸ� ��Ȱ��ȭ
			btn_input.setEnabled(false);
		}else {
			//tf�� ���� ���������� Ȱ��ȭ
			btn_input.setEnabled(true);
		}
		
	}

}
