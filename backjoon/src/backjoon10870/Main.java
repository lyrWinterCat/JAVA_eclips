package backjoon10870;

import java.util.Scanner;

public class Main {
	
	public static int fivo(int n) {
		int sum=0;
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		
		sum+=fivo(n-1)+fivo(n-2);
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt());
	}

}
