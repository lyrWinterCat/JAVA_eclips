package Account;

import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;



public class ChoiceAdapter implements ItemListener{

	Frame f;
	
	public ChoiceAdapter(Frame f) {
		this.f = f;
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		Sales.c = arg0.getItem().toString();
		
		
	}
}
