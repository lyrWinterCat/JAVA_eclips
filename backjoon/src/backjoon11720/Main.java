package backjoon11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 11720 숫자의 합
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String sNum=sc.next();
		
		int sum=0;
		for (int i = 0; i < num; i++) {
			sum+=Integer.parseInt(""+sNum.charAt(i));
		}
		System.out.println(sum);
	}

}
