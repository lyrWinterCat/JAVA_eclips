package ex11_1_TryCatch;

import java.util.Scanner;

public class Ex5_TryCatch {
	public static void main(String[] args) {
		// 정수 : 100
		// 결과 : 100
		
		// 정수 : aab
		// 결과 : aab은(는) 정수가 아닙니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String num=sc.next();
		try {
			System.out.println("입력받은 수 : "+Integer.parseInt(num));
		} catch (Exception e) {
			System.out.println(num+"은(는) 정수가 아닙니다.");
		}
		
		// 강사 풀이
		String str = "";
		try {
			int num2=sc.nextInt();
			System.out.println("결과 : "+num2);
		} catch (Exception e) {
			String sNum=sc.next();
			System.out.println(sNum+"은(는) 정수가 아닙니다.");
			// 자바 에러. try에서 받은 sc값을 그대로 sNum에 넣는다
		}
		
		
		
		
		
	}//main

}
