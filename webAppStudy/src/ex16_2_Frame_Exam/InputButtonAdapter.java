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
		// ta 내부의 모든 값을 변경하는 메서드 
//		ta.setText(tf.getText());	
		System.out.println("호출됨");
		
		ta.append(tf.getText()+"\n");
		
		tf.setText(""); // 넘기고 난 후 입력칸 공백으로 되돌리기 
		tf.requestFocus(); // tf로 커서가 이동을 함 >> textField에 커서가 남아있음
		
	}

}
