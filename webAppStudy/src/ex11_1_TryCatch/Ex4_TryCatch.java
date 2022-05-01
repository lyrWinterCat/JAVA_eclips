package ex11_1_TryCatch;

import java.util.Scanner;

public class Ex4_TryCatch {
	public static void main(String[] args) {
		// 키보드에서 정수를 입력받고 정수 이외의 값이 입력되었다면
		// '정수만 입력가능' 이라는 메세지를 출력해보도록 하자
		// 결과
		// 정수 : 100
		// 입력받은 수 : 100
		// 정수 : aaa
		// 정수만 입력 가능
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		try {
			int num=sc.nextInt();
			System.out.println("입력받은 수 : "+num);
		} catch (Exception e) {
			System.out.println("정수만 입력 가능");
		}
		
		
	}//main

}
