package ex02_1_control_stat;

public class Ex1_if {
	public static void main(String[] args) {
		// 제어문 : 프로그램을 제어하는 문장
		// 1) 분기문 : if, switch
		// 2) 반복문 : for, while
		
		// if문
		// if(조건식) {
		// 조건식이 참이 됐을 때 실행하는 문장
		// }
		
		int i = 50;
		String str = null;
//		if(i<100) {
//			System.out.println("i는 100보다 작습니다.");
//		}
//		if(i<100) {
//			str = "i는 100보다 작습니다";
//			System.out.println("i는 100보다 작습니다");
//		}
//		System.out.println(str);
		
		// if-else
		// if(조건식){
		// 조건식이 참일떄 실행하는 문장
		// } else {
		// 조건식이 참이 아닐 때 실행하는 문장
		// }
		if(i>100) {
			str = "i는 100보다 큽니다.";
		}else {
			str = "i는 100보다 작습니다.";
		}
		System.out.println(str);
		
		// 4/14 위 코드 삼항 연산자로 바꾸기 
		String res = i>100? "i는 100보다 큽니다" : "i는 100보다 작습니다";
		System.out.println(res);
		
		
		if(++i>=50) {
			str = "i는 50이상의 수";
		}else {
			str = "i는 50 미만의 수";
		}
		System.out.println(str);
		
		/*
		 * age라는 변수를 만들고 30이라는 값 넣기
		 * 만약 age가 30 이상이라면 30세 이상입니다를 출력
		 * 그렇지 않으면 "30세 미만입니다" 라고 출력
		 * 마지막에 "감사합니다" 출력
		 */
		int age=30;
		String end = "감사합니다!";
		if(age>=30) {
			str = "30세 이상입니다.";
			System.out.println(str+"\n"+end);			
		}else {
			str = "30세 미만입니다.";
			System.out.println(str+"\n"+end);
		}
		
		// if, else - if, else
		// if(조건식) {
		// 조건식이 참일때 실행하는 문장
		// } else if(조건식){
		// 		if에서는 거짓이고  else-if일때는 참일때 실행하는 문장
		// } else {
		// 		if나 else-if에 모두 거짓일 때 실행하는 문장
		// }
		
		int sc = 80;
		if(sc>=90) {
			str="A";
		}else if(sc>=80) {
			str="B";
		}else if(sc>=70) {
			str="C";
		}else if(sc>=60) {
			str="D";
		}else {
			str="F";
		}
		System.out.println(str);
		
		
	}//main
}
