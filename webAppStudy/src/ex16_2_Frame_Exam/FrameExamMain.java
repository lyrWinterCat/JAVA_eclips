package ex16_2_Frame_Exam;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

public class FrameExamMain {
	public static void main(String[] args) {
		// ���͸� ������ �� Ȯ�� ��ư�� �������� ������ʹ� (KeyCode 13)
		
		Frame frame = new Frame("�޸���");
		frame.setBounds(700, 200, 250, 400);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setLayout(null); // �ڵ���ġ ����
		frame.setResizable(false); // ������ �������� ������ ���� ����
		
		Font font = new Font("",Font.PLAIN,20);
		// Ű���忡�� �Ѿ�� ���� �Է��ϱ� ���� ��ü
		TextField tf = new TextField(); //(�ǹ����� Scanner�� �� �Ⱦ��� ����)
		tf.setBounds(10, 35, 175, 30);
		tf.setFont(font);
		
		// textField�� ���� ���� �ѱ�� "Ȯ��"��ư ����
		Button btnInput = new Button("Ȯ��");
		btnInput.setBounds(191, 36, 45, 30);
		btnInput.setEnabled(false);//��ưŬ�� ��Ȱ��ȭ	

		
		//Ű���忡�� �������� ���ÿ� �Է¹��� �� �ֵ��� �ϴ� Ŭ����
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(9, 70, 230, 280);
		ta.setEditable(false); // �ؽ�Ʈ ������ ���Ƿ� ���� �߰��� �� ������ �ϴ� ���
		
		// ����� �����ư
		Button btnSave = new Button("����");
		Button btnClose = new Button("����");
		
		btnSave.setBounds(11, 356, 112, 30);
		btnClose.setBounds(129, 356, 112, 30);
		
		
		// ��ɱ���	
		
		// textField�� ���� ���ִ��� Ȯ���Ͽ� Ȯ�ι�ư Ȱ��ȭ/��Ȱ��ȭ
		tf.addTextListener(new TextAdapter(tf,btnInput));
		
		// Ȯ�ι�ư Ŭ���� tf�� �ִ� ���� ta�� �����ؼ� �־��ִ� �κ�
		btnInput.addActionListener(new InputButtonAdapter(tf,ta));
		
		// textField ���� ���� ������ �� �Է� �Ǵ� ���(self)
		// ���Ͱ��� �ߺ�ó���Ǿ� textField�� ���°� ó��...		
		tf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
					tf.addActionListener(new InputButtonAdapter(tf,ta));
				}
			}
		});
		
		//�ذ�^^
//		tf.addKeyListener(new KeyAdapter() {
//			public void keyTyped(KeyEvent e) {
//				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
//					ta.append(tf.getText()+"\n");
//					tf.setText("");
//					tf.requestFocus();
//				}
//			}
//		});
		
		// �����ư�� ������ �� �۵��ϴ� �̺�Ʈ ������ ���
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.exit(0); // ���� �������� ��� ������ ����
				frame.dispose(); // ���� �����Ӹ� ����
				
			}
		});		
		
		// ���� ��ư�� ������ �� ta�� ���� �����ϴ� �̺�Ʈ ������ ���
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ta�� ������ ������ �����ͺ���
				String message = ta.getText();
				
				// ��θ� �����ϴ� FileDialog
				FileDialog fd = new FileDialog(frame,"����",FileDialog.SAVE);				
				//FileDialog.SAVE�� ������ �Ʒ� ��ư�� "����"���� ����
				
				fd.setVisible(true);
				
				String path = fd.getDirectory() + fd.getFile();
				System.out.println(path);
				
				try {
					FileWriter fw = new FileWriter(path);
					fw.write(message);
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});		
		
		frame.add(tf); // frame�� TextField �߰� (�̷� add�� �� ���� ��Ƴ����� ����)
		frame.add(btnInput); //frame�� Ȯ�ι�ư �߰�
		frame.add(ta); // frame�� TextArea �߰�
		frame.add(btnSave); //frame�� �����ư �߰�
		frame.add(btnClose); // frame�� ������ư �߰�
		
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main

}
