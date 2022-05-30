package backjoon2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		1 >1 : 1
		1 > 2-7 : 2 (2,3,4,5,6,7 : 6개
		1 > 8-19 : 3 (12개
		1 > 20 - 37 : 4 (18개
		1> 38 - 61: 5(24개
 
		2-7 6개까지 방 2개
		8-19 12개까지 방3개
		20-37 포함 18개까지 방4개
		
		일 경우 n번일때 방의 개수....
		n=1 >> b=1
		n=2~7 >> b=2
		n=8~19 >> b=3
		b는 n이 1일 경우를 제외하고 1씩 증가
		n조건에 따라서 b값 주기....		
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=1;
		int range=2; //범위
		
		if(n==1) {
			System.out.println(1);
		} else {
			while(range<=n) {
				range=range+(6*cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
		
	}
}
