package backjoon1978;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		int cnt=0;
		
		for (int i = 0; i < num; i++) {
			boolean isCheck=false;
			int n=sc.nextInt();
			if(n==1) {
				
			}else {
				for (int j = 2; j < n; j++) {
					if(n%j==0) {
						isCheck=true;
						break;
					}
				}
				
				if(!isCheck) {
					cnt++;
				}
			}			
		}
		System.out.println(cnt);
		
		
	}//main
}
