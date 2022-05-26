package backjoon1157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		words=words.toUpperCase();
		
		int abcN [] = new int[26];
		char abc [] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		// for문 돌리기. chartAt으로 A부터 Z까지.
		// int 26칸짜리 배열을 만들어서 A가 있다면 0번째 인덱스가 1 올라가도록
		// 0=A, 25=Z
		// 배열 숫자중 가장 큰 값의 알파벳 리턴
		
		for (int i = 0; i < words.length(); i++) {
			for (int j = 0; j < abc.length; j++) {
				if(words.charAt(i)==abc[j]) {
					abcN[j]++;
				}
			}
		}
		
		int max=abcN[0];
		int cnt=0;
		int index=0;
		for (int i = 0; i < abcN.length; i++) {
			if(max<abcN[i]) {
				max=abcN[i];
				index=i;
			}
		}
		for (int i = 0; i < abcN.length; i++) {
			if(max==abcN[i]) {
				cnt++;
			}
		}
		
		if(cnt>1) {
			System.out.println("?");
		}else {
			System.out.println(abc[index]);			
		}
	}

}
