package ex02_1_control_stat;

public class Ex_homework {
	public static void main(String[] args) {
		// 1부터 20까지 홀수를 차례대로 출력하는 프로그램을 for와  if문을 사용하여 만들어보세요
		for (int i = 1; i <=20; i+=2) {
			System.out.println(i);
		}
		
		for (int i = 0; i <=20; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}

}
