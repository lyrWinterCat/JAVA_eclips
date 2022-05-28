package backjoon1316;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int cnt=num;
		for (int i = 0; i < num; i++) {
			String words = sc.next();
			HashSet<Character> setW = new HashSet<Character>();
			String wordS="";
			
			char standard=' ';
			for (int j = 0; j < words.length(); j++) {
				setW.add(words.charAt(j));
				if(words.charAt(j) != standard) {
					wordS+=words.charAt(j);
					standard= words.charAt(j);
				}
			}			
			if(wordS.length()!=setW.size()) {
				cnt--;
			}			
		}
		
		System.out.println(cnt);
	}
}
