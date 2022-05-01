package ex05_3_random;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Random {
	public static void main(String[] args) {
		// Random : 난수 생성을 위한 클래스
		
		// 1~5 사이의 난수를 생성                (0~4) + 1
		int rnd = new Random().nextInt(5)+1;
		// 		 new Random().nextInt(발생시킬 난수의 범위)+시작하는 수;
		// 31289~72345
		//		 new Random().nextInt(72345-31289+1)+31289
		System.out.printf("난수 : %d",rnd);
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작하는 수를 입력하세요");
		int su1 = sc.nextInt();
		System.out.println("끝나는 수를 입력하세요");
		int su2 = sc.nextInt();
		
		// su1과 su2 사이의 난수를 구해보세요
		
		int rnd2 = new Random().nextInt(su2-su1+1)+su1;
		System.out.printf("난수 : %d",rnd2);
	}

}
