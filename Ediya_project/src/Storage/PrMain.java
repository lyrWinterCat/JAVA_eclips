package Storage;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PrMain extends JFrame implements ActionListener , ItemListener{
	public static  HashMap<String,Integer> storage;
	
	String radioStr = "";//�̺�Ʈ �����ڿ��� ���� �����Ͽ� ����� ����

	protected Object frame;
	
	JButton bt1;
	JButton bt2;
	JButton c1;
	JButton c2;
	JButton c3;
	JButton c4;
	JButton c5;
	JButton c6;
	JButton c7;
	
	JCheckBox cr1 = new JCheckBox("�ڸ�");
	JCheckBox cr2 = new JCheckBox("����");
	JCheckBox cr3 = new JCheckBox("������");
	JCheckBox cb1 = new JCheckBox("ũ��ġ��");
	JCheckBox cb2 = new JCheckBox("���̱�");
	JCheckBox cb3 = new JCheckBox("ġ������ũ");
	JCheckBox m1 = new JCheckBox("�÷���");
	JCheckBox m2 = new JCheckBox("��纣��");

	
	
	//��ǰ��ư Ŭ���� Ȱ��ȭ/��Ȱ��ȭ �� �迭
	JCheckBox[] crSelect = {cr1,cr2,cr3};
	JCheckBox[] cbSelect = {cb1,cb2,cb3};
	JCheckBox[] mSelect = {m1,m2};
	
	TextArea ta;
	
//	JCheckBox[] crSelect = {cr1, cr2, cr3};
//	JCheckBox[] cbSelect = {cb1, cb2, cb3};
//	JCheckBox[] mSelect = {m1, m2};
	
	public PrMain() {		
		// ��� �� �ְ���� hashMap����
		storage = new HashMap<String, Integer>();
		storage = new HashMap<String, Integer>();
		storage.put("����",5);
		storage.put("����",5);
		storage.put("�÷�",5);
		storage.put("����ũ��",5);
		storage.put("����",5);
		storage.put("���̱�",5);
		storage.put("����Ŀ��",5);
		storage.put("����û",5);
		storage.put("ġ�ƽ����ũ",5);
	
	};
	
	public void startPrMain() {			

		
		//������ ����
		JFrame f = new JFrame("��� ����â");
		f.setBackground(Color.white);
		f.setSize(900, 1050);
		f.setLocationRelativeTo(null);
		f.setResizable(false);//���� ũ������ �Ұ�
		f.setLayout(null); //�ڵ���ġ ����
		
		Font font1 = new Font("����", Font.BOLD, 25);
		Font font2 = new Font("����", Font.BOLD, 18);
		
		JLabel l = new JLabel("��� ������ Ȯ�����ּ���");
		l.setFont(font1);
		l.setBounds(300, 40, 450, 30);
//		l.setHorizontalAlignment(l.CENTER);//�߾ӹ迭
		
		
		// ��� ��ǰ ���
		String[] name = {"����","����","�÷�","����û","ũ��ġ��","����ũ��","����Ŀ��"};  //��ǰ��	
		int[] coinPrice = {100,200,300,200,100,400,500};  //�ܰ�
		JButton[] storabtn = new JButton[9];
		
		//���λ�ǰ ��ư
		c1 = new JButton("����");
		c2 = new JButton("����");
		c3 = new JButton("�÷�");
		c4 = new JButton("����ũ��");
		c5 = new JButton("����û");
		c6 = new JButton("����Ŀ��");
		c7 = new JButton("����");

		
		
		c1.setBounds(60, 280, 180, 50);
		c1.setFont(font2);
		c1.setName("100");
		c1.addActionListener(this); 
				

		c2.setBounds(250, 280, 180, 50);
		c2.setFont(font2);
		c2.setName("200");
		c2.addActionListener(this);
		
		c3.setBounds(440, 280, 180, 50);
		c3.setFont(font2);
		c3.setName("300");
		c3.addActionListener(this);
				

		c4.setBounds(630, 280, 180, 50);
		c4.setFont(font2);
		c4.setName("200");
		c4.addActionListener(this);
		

		c5.setBounds(140, 350, 180, 50);
		c5.setFont(font2);
		c5.setName("100");
		c5.addActionListener(this);
			

		c6.setBounds(350, 350, 180, 50);
		c6.setFont(font2);
		c6.setName("400");
		c6.addActionListener(this);
				
		c7.setBounds(560, 350, 180, 50);
		c7.setFont(font2);
		c7.setName("500");
		c7.addActionListener(this);
				
				
				//�߰� ��ǰ���(����û�� ����)
		cr1.setBounds(100, 450, 90, 30);
		cr1.setFont(font2);
		cr1.setName("100");
		cr1.setEnabled(false);
				
		cr2.setBounds(300, 450, 90, 30);
		cr2.setFont(font2);	
		cr2.setName("100");
		cr2.setEnabled(false);
				
		cr3.setBounds(500, 450, 90, 30);
		cr3.setFont(font2);
		cr3.setName("100");
		cr3.setEnabled(false);
				
					
				

		//�߰� ��ǰ���(����Ŀ���� ����)
		cb1.setBounds(100, 540, 150, 30);
		cb1.setFont(font2);	
		cb1.setEnabled(false);
				
		cb2.setBounds(300, 540, 90, 30);
		cb2.setFont(font2);
		cb2.setEnabled(false);
		
		cb3.setBounds(500, 540, 150, 30);
		cb3.setFont(font2);
		cb3.setEnabled(false);
						
				
				//�߰� ��ǰ���(���ɿ� ����)
		m1.setBounds(100, 630, 90, 30);
		m1.setFont(font2);
		m1.setBackground(null);
		m1.setEnabled(false);
			
		m2.setBounds(300, 630, 150, 30);
		m2.setFont(font2);
		m2.setBackground(null);
		m2.setEnabled(false);
		
		
		JCheckBox[] crSelect = {cr1,cr2,cr3};
		JCheckBox[] cbSelect ={cb1,cb2,cb3};
		JCheckBox[] mSelect ={m1,m2};
						
		
		//��ư�����(����, ���)
		bt1 = new JButton("����");
		bt1.setBounds(100, 820, 300, 130);
		bt1.setFont(font1);
		f.add(bt1);
		bt1.addActionListener(this);						
		bt2 = new JButton("���");
		bt2.setBounds(500, 820, 300, 130);
		bt2.setFont(font1);
		f.add(bt2);
		bt2.addActionListener(this);
				
		//���� ������ ��������		
		ta = new TextArea("",0,0,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		ta.setBounds(80, 100, 700, 120);
		ta.setBackground(Color.white);
		ta.setEditable(false);//ta�� ���Ƿ� ���� �߰��� �� ������.
						
		f.add(ta);
		
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(c5);
		f.add(c6);
		f.add(c7);
		//�߰��ɼ�(����û)
		f.add(cr1);
		f.add(cr2);
		f.add(cr3);
		//�߰��ɼ�(����Ŀ��)
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		//�߰��ɼ�(����)
		f.add(m1);
		f.add(m2);
				
		f.add(l);		
		
		
		//â�ݱ�
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				}
			});		

		
	}//main

	@Override
	public void actionPerformed(ActionEvent e) { //�޴� ��ư Ŭ���� �߻��ϴ� �̺�Ʈ
		Object ob = e.getSource();
		JButton button = (JButton) ob;
		ta.setText("");
		int buyN = 10;
		
		if(button.getName()==null) {
			
		}else {	
			int index=0;
//			System.out.println(e.getActionCommand());
//			System.out.println(c1.getName());
			
		}
		if(e.getActionCommand().equals("����")) {
			System.out.println("���Ź�ư Ŭ����");
			for (int i = 0; i < cbSelect.length; i++) {
				if(crSelect[i].isSelected()) { //����û
					storage.put("����û", storage.get("����û")+buyN);
				}
				if(cbSelect[i].isSelected()) { // ����Ŀ�� (ũ��ġ�� ���̱� ġ������ũ
					storage.put("����Ŀ��",storage.get("����Ŀ��")+buyN);
				}				
			}
			for (int i = 0; i < mSelect.length; i++) {
				if(mSelect[i].isSelected()) { // ���� (�÷��� ��)
					storage.put("����",storage.get("����")+buyN);
				}
			}
		}
		
		
		//��ǰ�޴� Ŭ���� �̺�Ʈ �߻�
		switch(e.getActionCommand()) {
		case "����": 
			ta.setText("���� ���� : "+storage.get("����")); //�ؽ�Ʈ ����� �� ���
		for(int i = 0; i < crSelect.length; i++) { //���� 3��
			crSelect[i].setEnabled(false);
			cbSelect[i].setEnabled(false);
		}
		for(int i = 0; i < mSelect.length; i++) { //���� 2��
			mSelect[i].setEnabled(false);
		}
		storage.put("����",storage.get("����")+buyN);
		break;	
		case "����": 
			ta.setText("���� ���� : "+storage.get("����"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			storage.put("����",storage.get("����")+buyN);
			break;	
		case "�÷�":
			ta.setText("�÷� ���� : "+storage.get("�÷�"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			storage.put("�÷�",storage.get("�÷�")+buyN);
			break;	
		
		case "����ũ��":
			ta.setText("����ũ�� ���� : "+storage.get("����ũ��"));
			for (int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			storage.put("����ũ��",storage.get("����ũ��")+buyN);
			break;
			
		case "����û": 
			ta.setText("����û ���� : "+storage.get("����û"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(true);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			break;
			
		case "����Ŀ��": 
			ta.setText("����Ŀ�� ���� : "+storage.get("����Ŀ��"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(true);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(false);
			}
			break;
			
		case "����":
			ta.setText("���� ���� : "+storage.get("����"));
			for(int i = 0; i < crSelect.length; i++) {
				crSelect[i].setEnabled(false);
				cbSelect[i].setEnabled(false);
			}
			for(int i = 0; i < mSelect.length; i++) {
				mSelect[i].setEnabled(true);
			}
			break;
		case "����":
			System.out.println("���Ź�ư Ŭ����");
			break;
		case "���":
			System.out.println("��ҹ�ư Ŭ����");
		
			}
		}
		
	@Override
	public void itemStateChanged(ItemEvent e) {//PrMain �������̺�Ʈ
		// TODO Auto-generated method stub
//		c4.addItemListener(null);
//		if(e.getStateChange()==ItemEvent.SELECTED);
//		cb1.setEnabled(true);
//		cb2.setEnabled(true);
//		cb3.setEnabled(true);
	}
	
	
}
