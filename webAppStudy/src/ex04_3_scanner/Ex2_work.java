package ex04_3_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ctrl shift o 누르면 한번에 import됨! 
		
		// 키보드에서 정수를 입력받은 후 , 그 숫자가 소수인지 아닌지를 판단하는
		// 코드를 작성
		
		// 정수 11 :
		// 11은(는) 소수입니다.
		
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int flag = 0;
		for(int i = 2; i<num; i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+"은(는) 소수입니다.");
		}else {
			System.out.println(num+"은(는) 소수가 아닙니다.");
		}
		
		// 강사 풀이
		num = sc.nextInt();
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.printf("%d은(는) 소수입니다.",num);
		}else {
			System.out.printf("%d은(는) 소수가 아닙니다.",num);			
		}

		
		
	}//main

}
