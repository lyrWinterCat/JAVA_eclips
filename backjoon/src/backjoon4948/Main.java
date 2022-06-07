package backjoon4948;

import java.util.ArrayList;
import java.util.List;
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
				for (int i = n; i <= 2*n; i++) {
					boolean isCheck=false;
					for (int j = 2; j < i; j++) {
						if(i%j==0) {
							isCheck=true;
							break;
						}
					}//forJ
					if(!isCheck && i!=1) {
						cnt++;
					}
				}//forI
				
				System.out.println(cnt);				
			}
			
		}//while
			
	}//main

}
