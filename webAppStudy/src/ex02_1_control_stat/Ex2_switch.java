package ex02_1_control_stat;

public class Ex2_switch {
	public static void main(String[] args) {
		// switch : 비교값과 조건값을 통해 결과를 출력하는 제어문
		// switch(비교값){
		// case 조건값:
		// 		비교값과 조건값이 일치할 때 실행되는 영역
		// break;
		// }
		
		
		int n =3;
		// 1) 비교값과 조건값의 데이터타입은 항상 일치해야 한다.
		// 2) 조건값 (case)이 중복되면  에러가 난다.
		
		
		switch(n) {
		case 1:
			System.out.println("게임시작");
			break;
		case 2:
			System.out.println("게임 소개");
			break;
		case 3:
			System.out.println("게임 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다.\n 1~3번 까지만 눌러주세요");
			break;
		}//switch
		
		
		// if문 >> 조건에 범위를 설정할 수 있다.
		int sc = 50;
		if(sc>=90) {
			System.out.println("A");
		}else if(sc>=80) {
			System.out.println("B");
		}else if(sc>=70) {
			System.out.println("C");
		}else if(sc>=60) {
			System.out.println("D");
		}else if(sc>=50) {
			System.out.println("F");
		}else {
			System.out.println("성적을 매길 수 없습니다");
		}
		
		
	}//main

}
