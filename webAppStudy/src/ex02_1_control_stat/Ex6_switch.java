package ex02_1_control_stat;

import java.util.Scanner;

public class Ex6_switch {
	public static void main(String[] args) {
		// 두 개의 정수를 초기화하고
		// 연산자를 하나 받아서(+ - * /) switch문으로 정수를 연산하는 코드를 작성
		// 출력 결과 : 0 + 0 = 0
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		switch(c) {//비교값
		case "+" : //조건값
			System.out.println(a+" + "+b+" = "+(a+b));
			break;
		case "-" :
			System.out.println(a+" - "+b+" = "+(a-b));
			break;
		case "*" :
			System.out.println(a+" * "+b+" = "+(a*b));
			break;
		case "/" :
			System.out.println(a+" / "+b+" = "+(a/b));
			break;
		default:
			System.out.println("+ - / * 중 하나를 입력해주세요.");
		}
		
	}//main

}
