package ex15_5_event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
// ctrl shift O >> import �ѹ��� �ϱ�
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Ex1_Event {
	
	// �̺�Ʈ �����ڿ��� ���� �����Ͽ� ����� ����(static���� ������ �ص־� �����ڿ��� ����� ����)
	static String radioStr="";
	
	
	public static void main(String[] args) {
		
		Frame f = new Frame("���� ������Ʈ");
		
		f.setBounds(500, 100, 800, 300);
		f.setLayout(null); //�ڵ���ġ ���� >> ������� �⺻ ����
		
		// ���ڿ� ���õ� Ŭ����
		// ��Ʈ Ŭ���� new Font("��Ʈ�̸�",style,size);
		Font font = new Font("�ü�ü",Font.BOLD,30);
		
		// ȭ�鿡 �ؽ�Ʈ�� ����ϴ� Ŭ����
		Label q1 = new Label("���� �оߴ� �����Դϱ�?");
		q1.setFont(font);
		q1.setBounds(10, 30, 400, 50);
		q1.setBackground(Color.yellow);
		
		f.add(q1);
		
		// ���߼����� ������ CheckBox ���� (�ߺ�üũ ����)
		Checkbox movie = new Checkbox("��ȭ");
		Checkbox music = new Checkbox("����");
		
		movie.setBounds(10, 90, 50, 30);
		music.setBounds(60, 90, 70, 30);
		
		f.add(movie);
		f.add(music);
		
		//üũ�ڽ��� ���� �̺�Ʈ ������
		ItemListener checkListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				//e.getItem() : üũ�ڽ��� ������ �ؽ�Ʈ�� �����´�.
//				System.out.println(e.getItem());
				String res="";
				switch(e.getItem().toString()) {
				case "��ȭ" :
					res=e.getStateChange()==1? "��ȭ����" : "��ȭ���"; //Ŭ���� ���������� üũ���� �������� �˷��ִ� �޼���
					break;
				case "����" :
					res=e.getStateChange()==1? "���Ǽ���" : "�������";
					break;
				
				}//switch
				System.out.println(res);
			}
		};
		
		// üũ�ڽ��� ������ �߰�
		movie.addItemListener(checkListener);
		music.addItemListener(checkListener);
		
		// ������ư ����� (�ߺ�üũ �Ұ���)
		CheckboxGroup group = new CheckboxGroup();
		//			= new Checkbox(�̸�, �׷�, üũ����(üũx=false));
		Checkbox c1 = new Checkbox("�̰�",group, false);
		Checkbox c2 = new Checkbox("����",group, false);
		
		c1.setBounds(10, 190, 50, 30);
		c2.setBounds(60, 190, 50, 30);
		
		f.add(c1);
		f.add(c2);
		
		// ������ư �̺�Ʈ ó���� ���� ������ ����
		ItemListener radioListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//				System.out.println(e.getItem());
				radioStr=e.getItem().toString();
				System.out.println(radioStr);
				JOptionPane.showMessageDialog(f, radioStr+"������");
				
			}
		};
		
		c1.addItemListener(radioListener);
		c2.addItemListener(radioListener);
		
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
		f.setVisible(true);		
	}//main

}
