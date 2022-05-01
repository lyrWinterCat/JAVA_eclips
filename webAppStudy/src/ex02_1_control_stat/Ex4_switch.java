package ex02_1_control_stat;

public class Ex4_switch {
	public static void main(String[] args) {
		// switch에서 비교값으로 활용이 가능한 자료형
		// 1) 정수형 (byte, short, int)
		// 2) 문자형(char)
		// 3) 문자열 (String)
		
		String name="홍";
		
		switch(name) { //비교값
		case "김": // 비교를 할 조건값
			System.out.println("김길동");
			break;
		case "이":
			System.out.println("이길동");
			break;
		case "독고":
			System.out.println("독고길동");
			break;
		case "홍":
			System.out.println("홍길동");
			break;
		default :
			System.out.println("없는 성씨입니다.");
			break;
		
			
		}// switch
		
	}//main

}
