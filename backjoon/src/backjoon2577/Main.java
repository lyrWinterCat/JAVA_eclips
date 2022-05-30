package backjoon2577;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자의 개수 
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int mul = a*b*c;
		
		String Smul = ""+mul;
		
		int res [] = new int[10];
		for (int i = 0; i < Smul.length(); i++) {
			res[Integer.parseInt(String.valueOf(Smul.charAt(i)))]++;
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
