package ex16_1_Choice;

import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

public class ChoiceAdapter implements ItemListener{
	Frame f; // itemStateChanged���� �ν��� frame f
	
	public ChoiceAdapter(Frame f) { //main���� �ּҰ��� �޾ƿ� frame
		this.f=f;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		ChoiceTest.dayStr = e.getItem().toString();
		JOptionPane.showMessageDialog(f,"���� : "+ChoiceTest.dayStr);
		
	}

}
