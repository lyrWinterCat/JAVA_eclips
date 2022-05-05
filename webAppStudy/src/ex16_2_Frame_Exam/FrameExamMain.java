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
		// 엔터를 눌렀을 때 확인 버튼이 눌리도록 만들어보고싶당 (KeyCode 13)
		
		Frame frame = new Frame("메모장");
		frame.setBounds(700, 200, 250, 400);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setLayout(null); // 자동배치 끄기
		frame.setResizable(false); // 생성된 프레임의 사이즈 변경 막기
		
		Font font = new Font("",Font.PLAIN,20);
		// 키보드에서 넘어온 값을 입력하기 위한 객체
		TextField tf = new TextField(); //(실무에서 Scanner를 잘 안쓰는 이유)
		tf.setBounds(10, 35, 175, 30);
		tf.setFont(font);
		
		// textField에 적힌 값을 넘기는 "확인"버튼 생성
		Button btnInput = new Button("확인");
		btnInput.setBounds(191, 36, 45, 30);
		btnInput.setEnabled(false);//버튼클릭 비활성화	

		
		//키보드에서 여러줄을 동시에 입력받을 수 있도록 하는 클래스
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(9, 70, 230, 280);
		ta.setEditable(false); // 텍스트 영역에 임의로 값을 추가할 수 없도록 하는 기능
		
		// 저장과 종료버튼
		Button btnSave = new Button("저장");
		Button btnClose = new Button("종료");
		
		btnSave.setBounds(11, 356, 112, 30);
		btnClose.setBounds(129, 356, 112, 30);
		
		
		// 기능구현	
		
		// textField에 값이 들어가있는지 확인하여 확인버튼 활성화/비활성화
		tf.addTextListener(new TextAdapter(tf,btnInput));
		
		// 확인버튼 클릭시 tf에 있는 값을 ta로 복사해서 넣어주는 부분
		btnInput.addActionListener(new InputButtonAdapter(tf,ta));
		
		// textField 에서 엔터 눌렀을 때 입력 되는 기능(self)
		// 엔터값이 중복처리되어 textField로 들어가는것 처리...		
		tf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
					tf.addActionListener(new InputButtonAdapter(tf,ta));
				}
			}
		});
		
		//해결^^
//		tf.addKeyListener(new KeyAdapter() {
//			public void keyTyped(KeyEvent e) {
//				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
//					ta.append(tf.getText()+"\n");
//					tf.setText("");
//					tf.requestFocus();
//				}
//			}
//		});
		
		// 종료버튼을 눌렀을 때 작동하는 이벤트 감지자 등록
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.exit(0); // 현재 실행중인 모든 프레임 종료
				frame.dispose(); // 현재 프레임만 종료
				
			}
		});		
		
		// 저장 버튼을 눌렀을 때 ta의 값을 저장하는 이벤트 감지자 등록
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ta에 쓰여진 내용을 가져와보자
				String message = ta.getText();
				
				// 경로를 설정하는 FileDialog
				FileDialog fd = new FileDialog(frame,"저장",FileDialog.SAVE);				
				//FileDialog.SAVE는 오른쪽 아래 버튼이 "저장"으로 변경
				
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
		
		frame.add(tf); // frame에 TextField 추가 (이런 add는 한 곳에 모아놓으면 좋음)
		frame.add(btnInput); //frame에 확인버튼 추가
		frame.add(ta); // frame에 TextArea 추가
		frame.add(btnSave); //frame에 저장버튼 추가
		frame.add(btnClose); // frame에 닫힘버튼 추가
		
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main

}
