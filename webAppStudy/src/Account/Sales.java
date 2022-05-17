package Account;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import BuyPanel.BuyPanel;
import BuyPanel.Test;

public class Sales extends BuyPanel {

	static String c = "월요일";
	int sum = 0;
	String printOrder = "";
	int ame_count = 0;
	int la_count = 0;
	int mi_count = 0;
	int car_count = 0;
	int ade_count = 0;
	int t_count = 0;
	int mu_count = 0;
	int ba_count = 0;
	int ch_count = 0;
	int ame = 0;
	int la = 0;
	int mi = 0;
	int car = 0;
	int a = 0;
	int ade = 0;
	int t = 0;
	int ba = 0;
	int mu = 0;
	int ch = 0;
	int n = 0;
	int s6_1 = 0, s6_2 = 0, s6_3 = 0, s6_4 = 0, s6_5 = 0, s6_6 = 0;
	int all = s6_1 + s6_2 + s6_3 + s6_4 + s6_5 + s6_6;
	int count = 0;
	int d13_ = 0;
	int Today_int =0;
	int d2_ = 0;
	int d_ = 0;
	int d3_ = 0;
	int d4_ = 0;
	int d5_ = 0;
	int d6_ = 0;
	int d7_ = 0;

	

	public void startSales() {
		Date date = new Date();
		
		SimpleDateFormat sdate = new SimpleDateFormat("dd");

		String Today = sdate.format(date);
		Today_int = Integer.parseInt(Today);
		
		Frame f = new Frame("매출 관리");
		Button btn = new Button("오늘 매출");
		Frame f2 = new Frame("오늘 매출");
		Calendar2 ca = new Calendar2();
		Label c1 = new Label("아메리카노 : " + ame + "원");
		Label L = new Label("매출 관리");
		Frame f3 = new Frame("한달 판매액");
		Frame f4 = new Frame("한달 지출액");
		Frame f5 = new Frame("그래프");
		Frame f6 = new Frame("추가");
		f.setBounds(550, 230, 500, 308);
		f2.setBounds(550, 230, 500, 390);
		ca.setBounds(550, 230, 1000, 508);
		f4.setBounds(550, 230, 310, 308);
		f5.setBounds(300, 230, 970, 559);
		f6.setBounds(800, 230, 460, 75);
		f.setLayout(null);
		f2.setLayout(null);
		f4.setLayout(null);
		f5.setLayout(null);
		f6.setLayout(null);
		f.setBackground(Color.white);
		f.setResizable(false);
		f2.setResizable(false);
		f3.setResizable(false);
		f4.setResizable(false);
		f5.setResizable(false);
		f6.setResizable(false);
		L.setBounds(190, 20, 110, 70);
		f.add(L);
		LineBorder bb = new LineBorder(Color.black, 1, true);
		LineBorder bg = new LineBorder(Color.GRAY, 1, true);
		LineBorder blg = new LineBorder(Color.LIGHT_GRAY, 1, true);
		Font font = new Font("", Font.BOLD, 25);

		// 한달지출액.순수익
		Label s6 = new Label("순수익 : " + sum);
		s6.setBounds(0, 230, 1000, 50);
		s6.setFont(font);
		f4.add(s6);

		// 매출관리창
		Button btn2 = new Button("한달 판매액");
		Button btn3 = new Button("한달 지출액");
		btn.setBounds(0, 90, 500, 70);
		btn2.setBounds(0, 160, 500, 70);
		btn3.setBounds(0, 230, 500, 70);
		btn.setBackground(Color.lightGray);
		btn2.setBackground(Color.lightGray);
		btn3.setBackground(Color.lightGray);
		f.add(btn);
		f.add(btn2);
		f.add(btn3);

		// 오늘 매출.커피 종류
		Label all_ = new Label("오늘 수입 : " + n + "원");
		c1.setBounds(10, 125, 220, 20);
		f2.add(c1);
		Label c2 = new Label("카페라떼 : " + la + "원");
		c2.setBounds(10, 155, 220, 20);
		f2.add(c2);
		Label c3 = new Label("밀크셰이크 : " + mi + "원");
		c3.setBounds(230, 125, 220, 20);
		f2.add(c3);
		Label c4 = new Label("카라멜마끼야또 : " + car + "원");
		c4.setBounds(230, 155, 220, 20);
		f2.add(c4);

		// 오늘 매출.에이드
		Label a1 = new Label("에이드 : " + ade + "원");
		a1.setBounds(10, 225, 220, 20);
		f2.add(a1);
		
		// 오늘 매출.차 
		Label t1 = new Label("차 : " + t + "원");
		t1.setBounds(10, 255, 220, 20);
		f2.add(t1);
		
		// 오늘 매출.베이커리
		Label b1 = new Label("베이글 : " + ba + "원");
		b1.setBounds(10, 325, 220, 20);
		f2.add(b1);
		Label b2 = new Label("머핀 : " + mu + "원");
		b2.setBounds(10, 355, 220, 20);
		f2.add(b2);
		Label b3 = new Label("치즈스틱케이크 : " + ch + "원");
		b3.setBounds(230, 325, 220, 20);
		f2.add(b3);

		// 오늘 매출.메뉴
		JLabel h1 = new JLabel(" 커피 " + (ame + la + mi + car) + "원");
		JLabel h2 = new JLabel(" 에이드,차 " + (ade + t) + "원");
		JLabel h4 = new JLabel(" 브레드 " + (ba + mu + ch) + "원");
		h1.setBounds(5, 80, 1000, 40);
		h2.setBounds(5, 180, 1000, 40);
		h4.setBounds(5, 280, 1000, 40);
		h1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		h2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		h4.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		h1.setBorder(bb);
		h2.setBorder(bb);
		h4.setBorder(bb);
		f2.add(h1);
		f2.add(h2);
		f2.add(h4);
		L.setFont(font);
		
		
		
		

		// 그래프
		JButton gra = new JButton("그래프");
		gra.setBounds(400, 30, 92, 50);
		f2.add(gra);

		// 그래프.가로
		JLabel Graph_x1 = new JLabel("아메리카노");
		Graph_x1.setBounds(67, 531, 100, 20);
		f5.add(Graph_x1);
		Graph_x1.setHorizontalAlignment(JLabel.CENTER);
		Graph_x1.setBorder(bb);
		Label Graph_ame = new Label("");
		Graph_ame.setBounds(107, 531 - (ame_count * 20), 20, 1000);
		Graph_ame.setAlignment(Label.CENTER);
		Graph_ame.setBackground(Color.BLUE);
		f5.add(Graph_ame);
		JLabel Graph_x2 = new JLabel("카페라떼");
		Graph_x2.setBounds(167, 531, 100, 20);
		f5.add(Graph_x2);
		Graph_x2.setHorizontalAlignment(JLabel.CENTER);
		Graph_x2.setBorder(bb);
		Label Graph_la = new Label("");
		Graph_la.setBounds(207, 531 - (la_count * 20), 20, 1000);
		Graph_la.setAlignment(Label.CENTER);
		Graph_la.setBackground(Color.BLUE);
		f5.add(Graph_la);
		JLabel Graph_x3 = new JLabel("밀크셰이크");
		Graph_x3.setBounds(267, 531, 100, 20);
		f5.add(Graph_x3);
		Graph_x3.setHorizontalAlignment(JLabel.CENTER);
		Graph_x3.setBorder(bb);
		Label Graph_mi = new Label("");
		Graph_mi.setBounds(307, 531 - (mi_count * 20), 20, 1000);
		Graph_mi.setAlignment(Label.CENTER);
		Graph_mi.setBackground(Color.BLUE);
		f5.add(Graph_mi);
		JLabel Graph_x4 = new JLabel("카라멜마끼야또");
		Graph_x4.setBounds(367, 531, 100, 20);
		f5.add(Graph_x4);
		Graph_x4.setHorizontalAlignment(JLabel.CENTER);
		Graph_x4.setBorder(bb);
		Label Graph_car = new Label("");
		Graph_car.setBounds(407, 531 - (car_count * 20), 20, 1000);
		Graph_car.setAlignment(Label.CENTER);
		Graph_car.setBackground(Color.BLUE);
		f5.add(Graph_car);
		JLabel Graph_x5 = new JLabel("에이드");
		Graph_x5.setBounds(467, 531, 100, 20);
		f5.add(Graph_x5);
		Graph_x5.setHorizontalAlignment(JLabel.CENTER);
		Graph_x5.setBorder(bb);
		Label Graph_ade = new Label("");
		Graph_ade.setBounds(507, 531 - (ade_count * 20), 20, 1000);
		Graph_ade.setAlignment(Label.CENTER);
		Graph_ade.setBackground(Color.BLUE);
		f5.add(Graph_ade);
		JLabel Graph_x8 = new JLabel("차");
		Graph_x8.setBounds(567, 531, 100, 20);
		f5.add(Graph_x8);
		Graph_x8.setHorizontalAlignment(JLabel.CENTER);
		Graph_x8.setBorder(bb);
		Label Graph_t = new Label("");
		Graph_t.setBounds(607, 531 - (t_count * 20), 20, 1000);
		Graph_t.setAlignment(Label.CENTER);
		Graph_t.setBackground(Color.BLUE);
		f5.add(Graph_t);
		JLabel Graph_x11 = new JLabel("베이글");
		Graph_x11.setBounds(667, 531, 100, 20);
		f5.add(Graph_x11);
		Graph_x11.setHorizontalAlignment(JLabel.CENTER);
		Graph_x11.setBorder(bb);
		Label Graph_ba = new Label("");
		Graph_ba.setBounds(707, 531 - (ba_count * 20), 20, 1000);
		Graph_ba.setAlignment(Label.CENTER);
		Graph_ba.setBackground(Color.BLUE);
		f5.add(Graph_ba);
		JLabel Graph_x12 = new JLabel("머핀");
		Graph_x12.setBounds(767, 531, 100, 20);
		f5.add(Graph_x12);
		Graph_x12.setHorizontalAlignment(JLabel.CENTER);
		Graph_x12.setBorder(bb);
		Label Graph_mu = new Label("");
		Graph_mu.setBounds(807, 531 - (mu_count * 20), 20, 1000);
		Graph_mu.setAlignment(Label.CENTER);
		Graph_mu.setBackground(Color.BLUE);
		f5.add(Graph_mu);
		JLabel Graph_x13 = new JLabel("치즈스틱케이크");
		Graph_x13.setBounds(867, 531, 100, 20);
		f5.add(Graph_x13);
		Graph_x13.setHorizontalAlignment(JLabel.CENTER);
		Graph_x13.setBorder(bb);
		Label Graph_ch = new Label("");
		Graph_ch.setBounds(907, 531 - (ch_count * 20), 20, 1000);
		Graph_ch.setAlignment(Label.CENTER);
		Graph_ch.setBackground(Color.BLUE);
		f5.add(Graph_ch);

		// 그래프.세로
		JLabel Graph_y1 = new JLabel("1");
		Graph_y1.setBounds(2, 511, 65, 20);
		f5.add(Graph_y1);
		Graph_y1.setHorizontalAlignment(JLabel.CENTER);
		Graph_y1.setBorder(bg);
		JLabel Graph_y1_ = new JLabel("");
		Graph_y1_.setBounds(2, 511, 1505, 20);
		f5.add(Graph_y1_);
		Graph_y1_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y1_.setBorder(blg);
		JLabel Graph_y2 = new JLabel("2");
		Graph_y2.setBounds(2, 491, 65, 20);
		f5.add(Graph_y2);
		Graph_y2.setHorizontalAlignment(JLabel.CENTER);
		Graph_y2.setBorder(bg);
		JLabel Graph_y3 = new JLabel("3");
		Graph_y3.setBounds(2, 471, 65, 20);
		f5.add(Graph_y3);
		Graph_y3.setHorizontalAlignment(JLabel.CENTER);
		Graph_y3.setBorder(bg);
		JLabel Graph_y3_ = new JLabel("");
		Graph_y3_.setBounds(2, 471, 1505, 20);
		f5.add(Graph_y3_);
		Graph_y3_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y3_.setBorder(blg);
		JLabel Graph_y4 = new JLabel("4");
		Graph_y4.setBounds(2, 451, 65, 20);
		f5.add(Graph_y4);
		Graph_y4.setHorizontalAlignment(JLabel.CENTER);
		Graph_y4.setBorder(bg);
		JLabel Graph_y5 = new JLabel("5");
		Graph_y5.setBounds(2, 431, 65, 20);
		f5.add(Graph_y5);
		Graph_y5.setHorizontalAlignment(JLabel.CENTER);
		Graph_y5.setBorder(bg);
		JLabel Graph_y5_ = new JLabel("");
		Graph_y5_.setBounds(2, 431, 1505, 20);
		f5.add(Graph_y5_);
		Graph_y5_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y5_.setBorder(blg);
		JLabel Graph_y6 = new JLabel("6");
		Graph_y6.setBounds(2, 411, 65, 20);
		f5.add(Graph_y6);
		Graph_y6.setHorizontalAlignment(JLabel.CENTER);
		Graph_y6.setBorder(bg);
		JLabel Graph_y7 = new JLabel("7");
		Graph_y7.setBounds(2, 391, 65, 20);
		f5.add(Graph_y7);
		Graph_y7.setHorizontalAlignment(JLabel.CENTER);
		Graph_y7.setBorder(bg);
		JLabel Graph_y7_ = new JLabel("");
		Graph_y7_.setBounds(2, 391, 1505, 20);
		f5.add(Graph_y7_);
		Graph_y7_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y7_.setBorder(blg);
		JLabel Graph_y8 = new JLabel("8");
		Graph_y8.setBounds(2, 371, 65, 20);
		f5.add(Graph_y8);
		Graph_y8.setHorizontalAlignment(JLabel.CENTER);
		Graph_y8.setBorder(bg);
		JLabel Graph_y9 = new JLabel("9");
		Graph_y9.setBounds(2, 351, 65, 20);
		f5.add(Graph_y9);
		Graph_y9.setHorizontalAlignment(JLabel.CENTER);
		Graph_y9.setBorder(bg);
		JLabel Graph_y9_ = new JLabel("");
		Graph_y9_.setBounds(2, 351, 1505, 20);
		f5.add(Graph_y9_);
		Graph_y9_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y9_.setBorder(blg);
		JLabel Graph_y10 = new JLabel("10");
		Graph_y10.setBounds(2, 331, 65, 20);
		f5.add(Graph_y10);
		Graph_y10.setHorizontalAlignment(JLabel.CENTER);
		Graph_y10.setBorder(bg);
		JLabel Graph_y11 = new JLabel("11");
		Graph_y11.setBounds(2, 311, 65, 20);
		f5.add(Graph_y11);
		Graph_y11.setHorizontalAlignment(JLabel.CENTER);
		Graph_y11.setBorder(bg);
		JLabel Graph_y11_ = new JLabel("");
		Graph_y11_.setBounds(2, 311, 1505, 20);
		f5.add(Graph_y11_);
		Graph_y11_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y11_.setBorder(blg);
		JLabel Graph_y12 = new JLabel("12");
		Graph_y12.setBounds(2, 291, 65, 20);
		f5.add(Graph_y12);
		Graph_y12.setHorizontalAlignment(JLabel.CENTER);
		Graph_y12.setBorder(bg);
		JLabel Graph_y13 = new JLabel("13");
		Graph_y13.setBounds(2, 271, 65, 20);
		f5.add(Graph_y13);
		Graph_y13.setHorizontalAlignment(JLabel.CENTER);
		Graph_y13.setBorder(bg);
		JLabel Graph_y13_ = new JLabel("");
		Graph_y13_.setBounds(2, 271, 1505, 20);
		f5.add(Graph_y13_);
		Graph_y13_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y13_.setBorder(blg);
		JLabel Graph_y14 = new JLabel("14");
		Graph_y14.setBounds(2, 251, 65, 20);
		f5.add(Graph_y14);
		Graph_y14.setHorizontalAlignment(JLabel.CENTER);
		Graph_y14.setBorder(bg);
		JLabel Graph_y15 = new JLabel("15");
		Graph_y15.setBounds(2, 231, 65, 20);
		f5.add(Graph_y15);
		Graph_y15.setHorizontalAlignment(JLabel.CENTER);
		Graph_y15.setBorder(bg);
		JLabel Graph_y15_ = new JLabel("");
		Graph_y15_.setBounds(2, 231, 1505, 20);
		f5.add(Graph_y15_);
		Graph_y15_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y15_.setBorder(blg);
		JLabel Graph_y16 = new JLabel("16");
		Graph_y16.setBounds(2, 211, 65, 20);
		f5.add(Graph_y16);
		Graph_y16.setHorizontalAlignment(JLabel.CENTER);
		Graph_y16.setBorder(bg);
		JLabel Graph_y17 = new JLabel("17");
		Graph_y17.setBounds(2, 191, 65, 20);
		f5.add(Graph_y17);
		Graph_y17.setHorizontalAlignment(JLabel.CENTER);
		Graph_y17.setBorder(bg);
		JLabel Graph_y17_ = new JLabel("");
		Graph_y17_.setBounds(2, 191, 1505, 20);
		f5.add(Graph_y17_);
		Graph_y17_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y17_.setBorder(blg);
		JLabel Graph_y18 = new JLabel("18");
		Graph_y18.setBounds(2, 171, 65, 20);
		f5.add(Graph_y18);
		Graph_y18.setHorizontalAlignment(JLabel.CENTER);
		Graph_y18.setBorder(bg);
		JLabel Graph_y19 = new JLabel("19");
		Graph_y19.setBounds(2, 151, 65, 20);
		f5.add(Graph_y19);
		Graph_y19.setHorizontalAlignment(JLabel.CENTER);
		Graph_y19.setBorder(bg);
		JLabel Graph_y19_ = new JLabel("");
		Graph_y19_.setBounds(2, 151, 1505, 20);
		f5.add(Graph_y19_);
		Graph_y19_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y19_.setBorder(blg);
		JLabel Graph_y20 = new JLabel("20");
		Graph_y20.setBounds(2, 131, 65, 20);
		f5.add(Graph_y20);
		Graph_y20.setHorizontalAlignment(JLabel.CENTER);
		Graph_y20.setBorder(bg);
		JLabel Graph_y21 = new JLabel("21");
		Graph_y21.setBounds(2, 111, 65, 20);
		f5.add(Graph_y21);
		Graph_y21.setHorizontalAlignment(JLabel.CENTER);
		Graph_y21.setBorder(bg);
		JLabel Graph_y21_ = new JLabel("");
		Graph_y21_.setBounds(2, 111, 1505, 20);
		f5.add(Graph_y21_);
		Graph_y21_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y21_.setBorder(blg);
		JLabel Graph_y22 = new JLabel("22");
		Graph_y22.setBounds(2, 91, 65, 20);
		f5.add(Graph_y22);
		Graph_y22.setHorizontalAlignment(JLabel.CENTER);
		Graph_y22.setBorder(bg);
		JLabel Graph_y23 = new JLabel("23");
		Graph_y23.setBounds(2, 71, 65, 20);
		f5.add(Graph_y23);
		Graph_y23.setHorizontalAlignment(JLabel.CENTER);
		Graph_y23.setBorder(bg);
		JLabel Graph_y23_ = new JLabel("");
		Graph_y23_.setBounds(2, 71, 1505, 20);
		f5.add(Graph_y23_);
		Graph_y23_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y23_.setBorder(blg);
		JLabel Graph_y24 = new JLabel("24");
		Graph_y24.setBounds(2, 51, 65, 20);
		f5.add(Graph_y24);
		Graph_y24.setHorizontalAlignment(JLabel.CENTER);
		Graph_y24.setBorder(bg);
		JLabel Graph_y25 = new JLabel("25");
		Graph_y25.setBounds(2, 31, 65, 20);
		f5.add(Graph_y25);
		Graph_y25.setHorizontalAlignment(JLabel.CENTER);
		Graph_y25.setBorder(bg);
		JLabel Graph_y25_ = new JLabel("");
		Graph_y25_.setBounds(2, 31, 1505, 20);
		f5.add(Graph_y25_);
		Graph_y25_.setHorizontalAlignment(JLabel.CENTER);
		Graph_y25_.setBorder(blg);
	
		
	
		
//		//주문창.주문하기 클릭 이벤트
		for(int i =count; i<Test.menus.size(); i++) {
			if (Test.menus.get(i).name.equals("아메리카노")) {
				ame += Test.menus.get(i).totalPrice*Test.menus.get(i).productNum;
				
				count++;
				ame_count += Test.menus.get(i).productNum;
				c1.setText("아메리카노 : " + ame + "원");
				h1.setText(" 커피 " + (ame + la + mi + car) + "원");
				all_.setText("오늘 수입 : " + (ame+la+mi+car+ade+t+ba+mu+ch) + "원");
				Graph_ame.setBounds(107, 531 - (ame_count * 20), 20, 1000);
				Graph_ame.setAlignment(Label.CENTER);
				Graph_ame.setBackground(Color.BLUE);
				Graph_ame.setText("");
				
			} else if (Test.menus.get(i).name.equals("카페라떼")) {
				la += Test.menus.get(i).totalPrice*Test.menus.get(i).productNum;
				
				count++;
				la_count += Test.menus.get(i).productNum;
				c2.setText("카페라떼 : " + la + "원");
				h1.setText(" 커피 " + (ame + la + mi + car) + "원");
				all_.setText("오늘 수입 : " + (ame+la+mi+car+ade+t+ba+mu+ch) + "원");
				Graph_la.setBounds(207, 531 - (la_count * 20), 20, 1000);
				Graph_la.setAlignment(Label.CENTER);
				Graph_la.setBackground(Color.BLUE);
				Graph_la.setText("");
				
			} else if (Test.menus.get(i).name.equals("밀크셰이크")) {
			
				mi +=Test.menus.get(i).totalPrice*Test.menus.get(i).productNum;
				count++;
				mi_count += Test.menus.get(i).productNum;
				c3.setText("밀크셰이크 : " + mi + "원");
				h1.setText(" 커피 " + (ame + la + mi + car) + "원");
				all_.setText("오늘 수입 : " +(ame+la+mi+car+ade+t+ba+mu+ch)+ "원");
				Graph_mi.setBounds(307, 531 - (mi_count * 20), 20, 1000);
				Graph_mi.setAlignment(Label.CENTER);
				Graph_mi.setBackground(Color.BLUE);
				Graph_mi.setText("");
			
			} else if (Test.menus.get(i).name.equals("카라멜 마끼야또")) {
				
				car += Test.menus.get(i).totalPrice*Test.menus.get(i).productNum;
				count++;
				car_count += Test.menus.get(i).productNum;
				c4.setText("카라멜 마끼야또 : " + car + "원");
				h1.setText(" 커피 " + (ame + la + mi + car) + "원");
				all_.setText("오늘 수입 : " +(ame+la+mi+car+ade+t+ba+mu+ch)+ "원");
				Graph_car.setBounds(407, 531 - (car_count * 20), 20, 1000);
				Graph_car.setAlignment(Label.CENTER);
				Graph_car.setBackground(Color.BLUE);
				Graph_car.setText("");
				
			} else if (Test.menus.get(i).name.equals("과일에이드(ice)")) {
				
				ade += Test.menus.get(i).totalPrice*Test.menus.get(i).productNum;
				count++;
				ade_count += Test.menus.get(i).productNum;
				a1.setText("에이드: " + ade + "원");
				h2.setText(" 에이드,차 " + (ade + t) + "원");
				all_.setText("오늘 수입 : " + (ame+la+mi+car+ade+t+ba+mu+ch)+ "원");
				Graph_ade.setBounds(507, 531 - (ade_count * 20), 20, 1000);
				Graph_ade.setAlignment(Label.CENTER);
				Graph_ade.setBackground(Color.BLUE);
				Graph_ade.setText("");
			
			} else if (Test.menus.get(i).name.equals("과일차(hot)")) {
				t += Test.menus.get(i).totalPrice*Test.menus.get(i).productNum;
		
				count++;
				t_count += Test.menus.get(i).productNum;
				t1.setText("차: " + t + "원");
				h2.setText(" 에이드,차 " + (ade + t) + "원");
				all_.setText("오늘 수입 : " +(ame+la+mi+car+ade+t+ba+mu+ch)+ "원");
				Graph_t.setBounds(607, 531 - (t_count * 20), 20, 1000);
				Graph_t.setAlignment(Label.CENTER);
				Graph_t.setBackground(Color.BLUE);
				Graph_t.setText("");
			
			} else if (Test.menus.get(i).name.equals("베이글")) {
				
				ba += Test.menus.get(i).totalPrice*Test.menus.get(i).productNum;
				count++;
				ba_count += Test.menus.get(i).productNum;
				b1.setText("베이글: " + ba + "원");
				h4.setText(" 브레드 " + (ba + mu + ch) + "원");
				all_.setText("오늘 수입 : " + (ame+la+mi+car+ade+t+ba+mu+ch) + "원");
				Graph_ba.setBounds(707, 531 - (ba_count * 20), 20, 1000);
				Graph_ba.setAlignment(Label.CENTER);
				Graph_ba.setBackground(Color.BLUE);
				Graph_ba.setText("");
			
			} else if (Test.menus.get(i).name.equals("머핀")) {
				mu += Test.menus.get(i).totalPrice*Test.menus.get(i).productNum;
				count++;
				mu_count += Test.menus.get(i).productNum;
				b2.setText("머핀: " + mu + "원");
				h4.setText(" 브레드 " + (ba + mu + ch) + "원");
				all_.setText("오늘 수입 : " + (ame+la+mi+car+ade+t+ba+mu+ch)+ "원");
			
				Graph_mu.setBounds(807, 531 - (mu_count * 20), 20, 1000);
				Graph_mu.setAlignment(Label.CENTER);
				Graph_mu.setBackground(Color.BLUE);
				Graph_mu.setText("");
			} else if (Test.menus.get(i).name.equals("치즈스틱케이크")) {
				
				ch += Test.menus.get(i).totalPrice*Test.menus.get(i).productNum;
				count++;
				ch_count += Test.menus.get(i).productNum;
				b3.setText("치즈스틱케이크: " + ch + "원");
				h4.setText(" 브레드 " + (ba + mu + ch) + "원");
				
				Graph_ch.setBounds(907, 531 - (ch_count * 20), 20, 1000);
				Graph_ch.setAlignment(Label.CENTER);
				Graph_ch.setBackground(Color.BLUE);
				Graph_ch.setText("");
			

			}else if(Test.menus.get(i).name.equals("")){
				all_.setText("오늘 수입 : " + (ame+la+mi+car+ade+t+ba+mu+ch) + "원");
			}
			}
		
		// 오늘 매출.오늘 수입
		Font font1 = new Font("", Font.BOLD, 30);
		all_.setBounds(10, 30, 500, 50);
		f2.add(all_);
		all_.setFont(font1);

		// 한달 판매액.수입입력
		JTextField tf = new JTextField();
		JTextField tf_ = new JTextField();
		JTextField tf2 = new JTextField();
		JTextField tf3 = new JTextField();
		JTextField tf4 = new JTextField();
		JTextField tf5 = new JTextField();
		JTextField tf6 = new JTextField();
		JTextField tf7 = new JTextField();
		JTextField tf13 = new JTextField();
		tf.setBounds(10, 35, 180, 30);
		tf_.setBounds(120, 35, 180, 30);
		tf2.setBounds(10, 35, 180, 30);
		tf3.setBounds(10, 35, 180, 30);
		tf4.setBounds(10, 35, 180, 30);
		tf5.setBounds(10, 35, 180, 30);
		tf6.setBounds(10, 35, 180, 30);
		tf7.setBounds(10, 35, 180, 30);
		tf13.setBounds(10, 35, 180, 30);
		tf.setFont(font);
		tf_.setFont(font);
		tf2.setFont(font);
		tf3.setFont(font);
		tf4.setFont(font);
		tf5.setFont(font);
		tf6.setFont(font);
		tf7.setFont(font);
		tf13.setFont(font);

		


		
		//달력
		Frame d = new Frame("1일");
		ca.dayButton[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setBounds(800, 230, 350, 75);
				d.setLayout(null);
				JButton btn_input = new JButton("추가");
				btn_input.setBounds(190, 35, 70, 30);
				JButton btn_input_ = new JButton("재입력");
				btn_input_.setBounds(260, 35, 80, 30);
				d.add(btn_input_);
				d.add(tf);
				d.add(tf2);
				d.add(tf3);
				d.add(tf4);
				d.add(tf5);
				d.add(tf6);
				d.add(tf7);
				d.add(btn_input);
				d.setVisible(true);
				
				
				
				
				//달력.날짜클릭 이벤트(일주일)
				d.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						d.dispose();
					}
				});
				btn_input_.setEnabled(false);
				btn_input.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						d_ = 0;
						ca.dayButton[0].setLabel(1 + "일 : " + tf.getText() + "원");
						String d = tf.getText();
						d_ += Integer.parseInt(d);
						sum += d_;
						ca.q1.setText("이번달 매출 : " + sum);
						btn_input.setEnabled(false);
						btn_input_.setEnabled(true);
						s6.setText("순수익 : " + (sum - all));
						tf.setEnabled(false);
					}
				});
				btn_input_.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String d = tf.getText();
						
						sum -= d_;
						;
						btn_input.setEnabled(true);
						btn_input_.setEnabled(false);
						tf.setText("");
						ca.q1.setText("이번달 매출 : " + sum);
						ca.dayButton[0].setLabel(1 + "일 : " + 0 + "원");
						s6.setText("순수익 : " + (sum - all));
						tf.setEnabled(true);
					}
				});
			}
		});

		Frame d2 = new Frame("2일");
		ca.dayButton[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				d2.setBounds(800, 230, 350, 75);
				d2.setLayout(null);
				JButton btn_input2 = new JButton("추가");
				btn_input2.setBounds(190, 35, 70, 30);
				JButton btn_input2_ = new JButton("재입력");
				btn_input2_.setBounds(260, 35, 80, 30);
				d2.add(btn_input2_);
				d2.add(tf2);
				d2.add(btn_input2);
				d2.setVisible(true);
				d2.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						d2.dispose();
					}
				});
				btn_input2_.setEnabled(false);
				btn_input2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						d2_ = 0;
						ca.dayButton[1].setLabel(2 + "일 : " + tf2.getText() + "원");
						String d2 = tf2.getText();
						d2_ += Integer.parseInt(d2);
						sum += d2_;
						ca.q1.setText("이번달 매출 : " + sum);
						btn_input2.setEnabled(false);
						btn_input2_.setEnabled(true);
						s6.setText("순수익 : " + (sum - all));
						tf2.setEnabled(false);
					}
				});
				btn_input2_.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String d2 = tf2.getText();
						
						sum -= d2_;
						;
						btn_input2.setEnabled(true);
						btn_input2_.setEnabled(false);
						tf2.setText("");
						ca.q1.setText("이번달 매출 : " + sum);
						ca.dayButton[1].setLabel(2 + "일 : " + 0 + "원");
						s6.setText("순수익 : " + (sum - all));
						tf2.setEnabled(true);

					}
				});
			}
		});
		Frame d3 = new Frame("3일");
		ca.dayButton[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				d3.setBounds(800, 230, 350, 75);
				d3.setLayout(null);
				JButton btn_input3 = new JButton("추가");
				btn_input3.setBounds(190, 35, 70, 30);
				JButton btn_input3_ = new JButton("재입력");
				btn_input3_.setBounds(260, 35, 80, 30);
				d3.add(btn_input3_);
				d3.add(tf3);
				d3.add(btn_input3);
				d3.setVisible(true);
				d3.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						d3.dispose();
					}
				});
				btn_input3_.setEnabled(false);
				btn_input3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						d3_ = 0;
						ca.dayButton[2].setLabel(3 + "일 : " + tf3.getText() + "원");
						String d3 = tf3.getText();
						d3_ += Integer.parseInt(d3);
						sum += d3_;
						ca.q1.setText("이번달 매출 : " + sum);
						btn_input3.setEnabled(false);
						btn_input3_.setEnabled(true);
						s6.setText("순수익 : " + (sum - all));
						tf3.setEnabled(false);
					}
				});
				btn_input3_.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String d3 = tf3.getText();
						
						sum -= d3_;
						;
						btn_input3.setEnabled(true);
						btn_input3_.setEnabled(false);
						tf3.setText("");
						ca.q1.setText("이번달 매출 : " + sum);
						ca.dayButton[2].setLabel(3 + "일 : " + 0 + "원");
						s6.setText("순수익 : " + (sum - all));
						tf3.setEnabled(true);

					}
				});
			}
		});
		Frame d4 = new Frame("4일");
		ca.dayButton[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				d4.setBounds(800, 230, 350, 75);
				d4.setLayout(null);
				JButton btn_input4 = new JButton("추가");
				btn_input4.setBounds(190, 35, 70, 30);
				JButton btn_input4_ = new JButton("재입력");
				btn_input4_.setBounds(260, 35, 80, 30);
				d4.add(btn_input4_);
				d4.add(tf4);
				d4.add(btn_input4);
				d4.setVisible(true);
				d4.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						d4.dispose();
					}
				});
				btn_input4_.setEnabled(false);
				btn_input4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						d4_ = 0;
						ca.dayButton[3].setLabel(4 + "일 : " + tf4.getText() + "원");
						String d4 = tf4.getText();
						d4_ += Integer.parseInt(d4);
						sum += d4_;
						ca.q1.setText("이번달 매출 : " + sum);
						btn_input4.setEnabled(false);
						btn_input4_.setEnabled(true);
						s6.setText("순수익 : " + (sum - all));
						tf4.setEnabled(false);
					}
				});
				btn_input4_.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String d4 = tf4.getText();
					
						sum -= d4_;
						;
						btn_input4.setEnabled(true);
						btn_input4_.setEnabled(false);
						tf4.setText("");
						ca.q1.setText("이번달 매출 : " + sum);
						ca.dayButton[3].setLabel(4 + "일 : " + 0 + "원");
						s6.setText("순수익 : " + (sum - all));
						tf4.setEnabled(true);
					}
				});
			}
		});
		Frame d5 = new Frame("5일");
		ca.dayButton[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				d5.setBounds(800, 230, 350, 75);
				d5.setLayout(null);
				JButton btn_input5 = new JButton("추가");
				btn_input5.setBounds(190, 35, 70, 30);
				JButton btn_input5_ = new JButton("재입력");
				btn_input5_.setBounds(260, 35, 80, 30);
				d5.add(btn_input5_);
				d5.add(tf5);
				d5.add(btn_input5);
				d5.setVisible(true);
				d5.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						d5.dispose();

					}
				});
				btn_input5_.setEnabled(false);
				btn_input5.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						d5_ = 0;
						ca.dayButton[4].setLabel(5 + "일 : " + tf5.getText() + "원");
						String d5 = tf5.getText();
						d5_ += Integer.parseInt(d5);
						sum += d5_;
						ca.q1.setText("이번달 매출 : " + sum);
						btn_input5.setEnabled(false);
						btn_input5_.setEnabled(true);
						s6.setText("순수익 : " + (sum - all));
						tf5.setEnabled(false);
					}
				});
				btn_input5_.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String d5 = tf5.getText();
						
						sum -= d5_;
						;
						btn_input5.setEnabled(true);
						btn_input5_.setEnabled(false);
						tf5.setText("");
						ca.q1.setText("이번달 매출 : " + sum);
						ca.dayButton[4].setLabel(5 + "일 : " + 0 + "원");
						s6.setText("순수익 : " + (sum - all));
						tf5.setEnabled(true);
					}
				});
			}
		});
		Frame d6 = new Frame("6일");
		ca.dayButton[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				d6.setBounds(800, 230, 350, 75);
				d6.setLayout(null);
				JButton btn_input6 = new JButton("추가");
				btn_input6.setBounds(190, 35, 70, 30);
				JButton btn_input6_ = new JButton("재입력");
				btn_input6_.setBounds(260, 35, 80, 30);
				d6.add(btn_input6_);
				d6.add(tf6);
				d6.add(btn_input6);
				d6.setVisible(true);
				d6.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						d6.dispose();
					}
				});
				btn_input6_.setEnabled(false);
				btn_input6.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						d6_=0;
						ca.dayButton[5].setLabel(6 + "일 : " + tf6.getText() + "원");
						String d6 = tf6.getText();
						d6_ += Integer.parseInt(d6);
						sum += d6_;
						ca.q1.setText("이번달 매출 : " + sum);
						btn_input6.setEnabled(false);
						btn_input6_.setEnabled(true);
						s6.setText("순수익 : " + (sum - all));
						tf6.setEnabled(false);
					}
				});
				btn_input6_.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String d6 = tf6.getText();
						
						sum -= d6_;
						;
						btn_input6.setEnabled(true);
						btn_input6_.setEnabled(false);
						tf6.setText("");
						ca.q1.setText("이번달 매출 : " + sum);
						ca.dayButton[5].setLabel(6 + "일 : " + 0 + "원");
						s6.setText("순수익 : " + (sum - all));
						tf6.setEnabled(true);
					}
				});
			}
		});
		Frame d7 = new Frame("7일");
		ca.dayButton[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				d7.setBounds(800, 230, 350, 75);
				d7.setLayout(null);
				JButton btn_input7 = new JButton("추가");
				btn_input7.setBounds(190, 35, 70, 30);
				JButton btn_input7_ = new JButton("재입력");
				btn_input7_.setBounds(260, 35, 80, 30);
				d7.add(btn_input7_);
				d7.add(tf7);
				d7.add(btn_input7);
				d7.setVisible(true);
				d7.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						d7.dispose();
					}
				});
				btn_input7_.setEnabled(false);
				btn_input7.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						d7_ =0;
						ca.dayButton[6].setLabel(7 + "일 : " + tf7.getText() + "원");
						String d7 = tf7.getText();
						d7_ += Integer.parseInt(d7);
						sum += d7_;
						ca.q1.setText("이번달 매출 : " + sum);
						btn_input7.setEnabled(false);
						btn_input7_.setEnabled(true);
						s6.setText("순수익 : " + (sum - all));
						tf7.setEnabled(false);
					}
				});
				btn_input7_.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String d7 = tf7.getText();
						
						sum -= d7_;
						;
						btn_input7.setEnabled(true);
						btn_input7_.setEnabled(false);
						tf7.setText("");
						ca.q1.setText("이번달 매출 : " + sum);
						ca.dayButton[6].setLabel(7 + "일 : " + 0 + "원");
						s6.setText("순수익 : " + (sum - all));
						tf7.setEnabled(true);
					}
				});
			}
		});
		Frame d13 = new Frame("13일");
		ca.dayButton[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				d13.setBounds(800, 230, 350, 75);
				d13.setLayout(null);
				JButton btn_input13 = new JButton("추가");
				btn_input13.setBounds(190, 35, 70, 30);
				JButton btn_input13_ = new JButton("재입력");
				btn_input13_.setBounds(260, 35, 80, 30);
				d13.add(btn_input13_);
				d13.add(tf13);
				d13.add(btn_input13);
				d13.setVisible(true);
				d13.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						d13.dispose();
					}
				});
				btn_input13_.setEnabled(false);
				btn_input13.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						d13_=0;
						ca.dayButton[12].setLabel(13 + "일 : " + tf13.getText() + "원");
						String d13 = tf13.getText();
						d13_ += Integer.parseInt(d13);
						sum += d13_;
						ca.q1.setText("이번달 매출 : " + sum);
						btn_input13.setEnabled(false);
						btn_input13_.setEnabled(true);
						s6.setText("순수익 : " + (sum - all));
						tf13.setEnabled(false);
						
					}
				});
				btn_input13_.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String d13 = tf13.getText();
						
						sum -= d13_;
						
						btn_input13.setEnabled(true);
						btn_input13_.setEnabled(false);
						tf13.setText("");
						ca.q1.setText("이번달 매출 : " + sum);
						ca.dayButton[12].setLabel(13 + "일 : " + 0 + "원");
						s6.setText("순수익 : " + (sum - all));
						tf13.setEnabled(true);
						
						
					}
				});
			}
		});

		for(int i =0; i<=31; i++) {
			if(Today_int == i) {
				ca.dayButton[i-1].setLabel(i + "일 : " + (ame+la+mi+car+ade+t+ba+mu+ch) + "원");
				ca.q1.setText("이번달 매출 : " +(ame+la+mi+car+ade+t+ba+mu+ch) + "원");
				
			}
		}
		// 지출액
		Button add = new Button("입력");
		add.setBounds(250, 35, 35, 30);
		f4.add(add);
		int s1_ = 0;
		JLabel s1 = new JLabel("월세 : " + s1_);
		s1.setBounds(7, 30, 300, 40);
		s1.setBorder(bb);
		f4.add(s1);
		int s2_ = 0;
		JLabel s2 = new JLabel("관리비 : " + s2_);
		s2.setBounds(7, 70, 300, 40);
		s2.setBorder(bb);
		f4.add(s2);
		int s3_ = 0;
		JLabel s3 = new JLabel("인건비 : " + s3_);
		s3.setBounds(7, 110, 300, 40);
		s3.setBorder(bb);
		f4.add(s3);
		int s4_ = 0;
		JLabel s4 = new JLabel("재료 : " + s4_);
		s4.setBounds(7, 150, 300, 40);
		s4.setBorder(bb);
		f4.add(s4);
		int s5_ = 0;
		JLabel s5 = new JLabel("기타 : " + s5_);
		s5.setBounds(7, 190, 300, 40);
		s5.setBorder(bb);
		f4.add(s5);
		
		
		
		
		
		
		

		// 지출액.입력창
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f6.setVisible(true);
				
				
				// 지출액.입력.choice
				Choice c = new Choice();
				c.add("월세");
				c.add("관리비");
				c.add("인건비");
				c.add("재료");
				c.add("기타");
				c.setBounds(20, 35, 70, 100);
				f6.add(c);
				JButton btn_input = new JButton("추가");
				JButton btn_input2 = new JButton("초기화");
				btn_input.setBounds(300, 35, 70, 30);
				btn_input2.setBounds(370, 35, 80, 30);
				btn_input.addActionListener(new ActionListener() {

					// 지출액.입력.추가버튼 이벤트
					@Override
					public void actionPerformed(ActionEvent e) {

						if (c.getSelectedIndex() == 0) {
							s1.setText("월세 : " + tf_.getText());

							all += Integer.parseInt(tf_.getText());

							s6.setText("순수익 : " + (sum - all));
						} else if (c.getSelectedIndex() == 1) {
							s2.setText("관리비 : " + tf_.getText());

							all += Integer.parseInt(tf_.getText());

							s6.setText("순수익 : " + (sum - all));
						} else if (c.getSelectedIndex() == 2) {
							s3.setText("인건비 : " + tf_.getText());

							all += Integer.parseInt(tf_.getText());
							s6.setText("순수익 : " + (sum - all));
						} else if (c.getSelectedIndex() == 3) {
							s4.setText("재료 : " + tf_.getText());

							all += Integer.parseInt(tf_.getText());
							s6.setText("순수익 : " + (sum - all));
						} else if (c.getSelectedIndex() == 4) {
							s5.setText("기타 : " + tf_.getText());

							all += Integer.parseInt(tf_.getText());
							s6.setText("순수익 : " + (sum - all));
						}

					}
				});
				// 지출액.입력.재입력버튼 이벤트
				btn_input2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						all = 0;
						s6.setText("순수익 : " + (sum - all));
						s1.setText("월세 : " + s1_);
						s4.setText("재료 : " + s4_);
						s5.setText("기타 : " + s5_);
						s3.setText("인건비 : " + s3_);
						s2.setText("관리비 : " + s2_);

					}
				});
				
				
				f6.add(tf_);
				f6.add(btn_input);
				f6.add(btn_input2);

				// 추가 창 닫기
				f6.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						f6.dispose();
					}
				});

			}
		});
		// 오늘 매출 닫기
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				f2.setVisible(true);
				all_.setText("오늘 수입 : " + (ame+la+mi+car+ade+t+ba+mu+ch) + "원");
				f2.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						f2.dispose();

					}
				});
			}
		});
		//그래프 열기
		gra.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f5.setVisible(true);
				f5.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						f5.dispose();
					}
				});
			}
		});
		// 한달 판매액 닫기
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ca.setVisible(true);
				
				ca.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						ca.dispose();

					}

				});
			}
		});
		// 한달 지출액 닫기
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f4.setVisible(true);
				f4.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						f4.dispose();

					}
				});

			}
		});
		// 프로그램 종료
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		f.setVisible(true);

	}

}
