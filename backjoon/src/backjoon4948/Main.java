package backjoon4948;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isZero=false;
		while(!isZero) {
			int n = sc.nextInt();
			
			if(n==0) {
				isZero=true;
			}
			else if(n==1) {
				System.out.println(1);
			}else {
				int cnt=0;	
				// 범위 : n+1부터 2*n 까지의 소수 구하기
				int [] arrInt=new int[2*n+1];
				int i,j;
				
				for (i=0; i<=2*n; i++) arrInt[i]=0; arrInt[1]=1;
				
				for (i=2; i<=2*n; i++) {
					for (j=2; i*j<=2*n; j++) {
						arrInt[i*j]=1;
					}
				}
				
				for (i=n+1; i<=2*n; i++) {
					if(arrInt[i]!=1) cnt++;
				}
				
				System.out.println(cnt);
				
//				//  시간초과
//				for (int i = n+1; i <= 2*n; i++) {
//					boolean isCheck=false;
//					for (int j = 2; j < i; j++) {
//						if(i%j==0) {
//							isCheck=true;
//							break;
//						}
//					}//forJ
//					if(!isCheck && i!=1) {
//						cnt++;
//					}
//				}//forI
//				
//				System.out.println(cnt);				
			}
			
		}//while
			
	}//main

}
