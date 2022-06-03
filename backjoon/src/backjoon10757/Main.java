package backjoon10757;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		BigInteger big1=new BigInteger(a);
		BigInteger big2=new BigInteger(b);
		System.out.println(big1.add(big2));		
	}
}
