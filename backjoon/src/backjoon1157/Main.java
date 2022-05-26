package backjoon1157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		words=words.toUpperCase();
		
		int abcN [] = new int[26];
		char abc [] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		// for�� ������. chartAt���� A���� Z����.
		// int 26ĭ¥�� �迭�� ���� A�� �ִٸ� 0��° �ε����� 1 �ö󰡵���
		// 0=A, 25=Z
		// �迭 ������ ���� ū ���� ���ĺ� ����
		
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
