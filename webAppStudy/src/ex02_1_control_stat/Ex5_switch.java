package ex02_1_control_stat;

import java.util.Scanner;

public class Ex5_switch {
	public static void main(String[] args) {
		// 정수 ex) 4월 한 달은 00 일 입니다.
		Scanner sc = new Scanner(System.in);
//		int monthType = 0;
//
//		int month = sc.nextInt();
//		
//		if(month==2) {
//			monthType=3;
//		}else if(month<8 && month%2==1) {
//			monthType=1;
//		}else if(month>=8 && month%2==0) {
//			monthType=1;
//		}else if(month<8 && month%2==0) {
//			monthType=0;
//		}else if(month>=8 && month%2==1) {
//			monthType=0;
//		}		
//		switch(monthType) {
//		case 1:
//			System.out.println(month+"월 한 달은 31일 입니다.");
//			break;
//		case 2:
//			System.out.println(month+"월 한 달은 30일 입니다.");
//			break;
//		case 3:
//			System.out.println(month+"월 한 달은 28일 입니다.");
//			break;
//		default:
//			System.out.println("해당하는 달이 없습니다.");
//			break;
//		}
		
		//답
		int month=4;
		
		switch(month) { //비교값
		case 1:
			System.out.println("1월은 31일 까지 있습니다.");
			break;
		
		case 2:
			System.out.println("2월은 28일 까지 있습니다.");
			break;
		
		case 3:
			System.out.println("3월은 31일 까지 있습니다.");
			break;
		}// .... 이렇게 12개로 한번에 쭉 작성하기 ---- 첫번째 방법
		
		// 하나의 결과값에 여러개의 case를 넣을 수 있다!
		int month2 = sc.nextInt();
		switch(month2) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month2+"월은 31일까지 있습니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month2+"월은 30일까지 있습니다.");
			break;
		case 2:
			System.out.println(month2+"월은 28일까지 있습니다.");
			break;
		default:
			System.out.println("1~12 까지의 숫자를 입력해주세요.");
		}// ....이렇게 케이스를 묶어주기 ----두번째 방법
		

		
		
	}//main

}
