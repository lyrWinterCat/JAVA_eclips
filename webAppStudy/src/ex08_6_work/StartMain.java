package ex08_6_work;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Start s = new Start();
		while(true) {
			System.out.println("1~50 ������ ���ڸ� �Է����ּ���");
			int num = sc.nextInt();
			s.upDown(num);
			if(s.getRnd()==num) {
				break;
			}
		}		
	}

}
