package ex02_1_control_stat;

public class Ex3_switch {
	public static void main(String[] args) {
		
		char c = 'A';
		
		switch(c) {
			case 'A':
				System.out.println("당신의 점수는 90점 이상입니다.");
				break; //break가 없는 경우 다음 break를 만날때까지 내려가게됨!
			case 'B':
				System.out.println("당신의 점수는 80점 이상입니다.");
				break;
			case 'C':
				System.out.println("당신의 점수는 70점 이상입니다.");
				break;
			case 'D':
				System.out.println("당신의 점수는 60점 이상입니다.");
				break;
			case 'F':
				System.out.println("당신의 점수는 59점 이하입니다.");
				break;
			default :
				System.out.println("A~F까지의 알파벳만 입력해주세요");
				break;
		}
		
	}//main

}
