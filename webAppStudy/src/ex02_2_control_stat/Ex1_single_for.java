package ex02_2_control_stat;

import java.util.Scanner;

public class Ex1_single_for {
	public static void main(String[] args) {
		// 반복문 : 특정 수행문을 원하는만큼 반복하여 실행하는 제어문
		// for(초기식; 조건식; 증감식){
		//
		// }
		
		for(int i = 0; i<3; i++) {
			System.out.println(i);
		}//for
		for (int i = 1; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------");
		
		// 10부터 1까지 거꾸로 출력을 하는 반복문을 작성하시오
		for (int i = 10; i >0; i--) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------");
		
		// 정수 n을 받고 1부터 n까지 정수의 합을 더하는 반복문을 작성하시오
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for (int i = 0; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("-------------------------------------");
		// 정수 n을 받고 구구단 n단을 출력하세요
		int dan = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * "+i+" = "+dan*i);
		}
		
	}//main

}
