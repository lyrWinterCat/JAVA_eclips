package ex04_3_scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에서 값을 직접 입력받아 변수에 저장할 수 있도록 해 주는 클래스
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int num = sc.nextInt();
		System.out.printf("제 나이는 %d 살 입니다.\n",num);
		// 키보드에서 int 타입의 값을 받고 엔터를 치는 순간
		// num 변수에 사용자가 입력받은 값을 대입해준다.
		
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("내 이름은 "+name+" 입니다.");
		System.out.printf("제 이름은 %s 입니다.\n",name);
		String s1 = sc.next();
		System.out.println("받은 문장 : "+s1);
		
		System.out.println("------------------------------------");
		
		// 실습 : 키보드에서 값을 입력받고 해당하는 구구단 출력
		int dan = sc.nextInt();
		if(!(dan>=2 && dan<=9)){
			System.out.println("2와 9 사이의 숫자만 입력해주세요");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d \n",dan,i,(dan*i));
			}			
		}
		
		// 강사 풀이
		System.out.println("구구단의 단 입력 : ");
		dan = sc.nextInt();
		
		if(dan<=1 || dan >=10) {
			System.out.println("2~9 사이의 숫자를 입력하세요");
		}else {
			for (int i = 1; i <=9; i++) {
				System.out.printf("%d * %d = %d \n", dan, i , (dan*i));
			}
		}
		
	}//main

}
