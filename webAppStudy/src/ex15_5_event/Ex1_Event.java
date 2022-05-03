package ex15_5_event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
// ctrl shift O >> import 한번에 하기
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Ex1_Event {
	
	// 이벤트 감지자에서 값을 변경하여 사용할 변수(static으로 선언을 해둬야 감지자에서 사용이 가능)
	static String radioStr="";
	
	
	public static void main(String[] args) {
		
		Frame f = new Frame("각종 컴포넌트");
		
		f.setBounds(500, 100, 800, 300);
		f.setLayout(null); //자동배치 끄기 >> 여기까지 기본 세팅
		
		// 글자와 관련된 클래스
		// 폰트 클래스 new Font("폰트이름",style,size);
		Font font = new Font("궁서체",Font.BOLD,30);
		
		// 화면에 텍스트를 출력하는 클래스
		Label q1 = new Label("관심 분야는 무엇입니까?");
		q1.setFont(font);
		q1.setBounds(10, 30, 400, 50);
		q1.setBackground(Color.yellow);
		
		f.add(q1);
		
		// 다중선택이 가능한 CheckBox 생성 (중복체크 가능)
		Checkbox movie = new Checkbox("영화");
		Checkbox music = new Checkbox("음악");
		
		movie.setBounds(10, 90, 50, 30);
		music.setBounds(60, 90, 70, 30);
		
		f.add(movie);
		f.add(music);
		
		//체크박스에 대한 이벤트 감지자
		ItemListener checkListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				//e.getItem() : 체크박스에 쓰여진 텍스트를 가져온다.
//				System.out.println(e.getItem());
				String res="";
				switch(e.getItem().toString()) {
				case "영화" :
					res=e.getStateChange()==1? "영화선택" : "영화취소"; //클릭을 했을때마다 체크인지 해제인지 알려주는 메서드
					break;
				case "음악" :
					res=e.getStateChange()==1? "음악선택" : "음악취소";
					break;
				
				}//switch
				System.out.println(res);
			}
		};
		
		// 체크박스에 감지자 추가
		movie.addItemListener(checkListener);
		music.addItemListener(checkListener);
		
		// 라디오버튼 만들기 (중복체크 불가능)
		CheckboxGroup group = new CheckboxGroup();
		//			= new Checkbox(이름, 그룹, 체크상태(체크x=false));
		Checkbox c1 = new Checkbox("이과",group, false);
		Checkbox c2 = new Checkbox("문과",group, false);
		
		c1.setBounds(10, 190, 50, 30);
		c2.setBounds(60, 190, 50, 30);
		
		f.add(c1);
		f.add(c2);
		
		// 라디오버튼 이벤트 처리를 위한 감지자 생성
		ItemListener radioListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//				System.out.println(e.getItem());
				radioStr=e.getItem().toString();
				System.out.println(radioStr);
				JOptionPane.showMessageDialog(f, radioStr+"선택함");
				
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
