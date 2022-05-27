package backjoon2908;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		
		String cNum1="";
		String cNum2="";
		
		for (int i = 2; i>=0; i--) {
			cNum1+=num1.charAt(i);
			cNum2+=num2.charAt(i);
		}
		
		int iNum1 = Integer.parseInt(cNum1);
		int iNum2 = Integer.parseInt(cNum2);
		
		if(iNum1>iNum2) {
			System.out.println(iNum1);
		}else {
			System.out.println(iNum2);
		}
	}
}
