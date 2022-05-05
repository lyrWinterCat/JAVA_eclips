package ex16_1_Choice;

import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

public class ChoiceAdapter implements ItemListener{
	Frame f; // itemStateChanged에서 인식할 frame f
	
	public ChoiceAdapter(Frame f) { //main에서 주소값을 받아올 frame
		this.f=f;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		ChoiceTest.dayStr = e.getItem().toString();
		JOptionPane.showMessageDialog(f,"오늘 : "+ChoiceTest.dayStr);
		
	}

}
