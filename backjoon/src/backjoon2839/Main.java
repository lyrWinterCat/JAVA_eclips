package backjoon2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar=sc.nextInt();
		int cnt=0;
		
		/*
		 * 설탕이 5의 배수일때 / 3의 배수일때 / 15의 배수일때 >> 배달가능. 조건으로 구하기
		 * 5의 배수 + 3의 배수로 이루어져 있을때 >> 배달 가능
		 * ** 11의 경우 5로 1, 3으로 2 배달해야 가능....
		 * 이렇게 접근하면 안댈거같아!
		 */
//		if(sugar%5==0 || sugar%15==0) {
//			cnt+=sugar/5;
//			System.out.println(cnt);
//		}else if((sugar%5)%3==0) {
//			cnt+=sugar/5;
//			cnt+=(sugar%5)/3;
//			System.out.println(cnt);
//		}else if(sugar%3==0){
//			cnt+=sugar/3;
//			System.out.println(cnt);
//		} else {
//			System.out.println(-1);
//		}
		
		if(sugar==4||sugar==7) {
			System.out.println(-1);
		}
		else if(sugar%5==0) {
			System.out.println(sugar/5);
		}else if(sugar%5==1 || sugar%5==3) {
			System.out.println((sugar/5)+1);
		} else if(sugar%5==2||sugar%5==4) {
			System.out.println((sugar/5)+2);
		}
		
		
		
		
		
		
	}

}
