package backjoon2941;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		String [] croA = {"c=","c-","dz=","d-","nj","lj","s=","z="};
		int cnt=0;
		for (int i = 0; i < croA.length; i++) {
			if(words.contains(croA[i])) {
				words=words.replace(croA[i], "");
				cnt++;
				System.out.println(words);
			}
		}//for
		cnt+=words.length();
		System.out.println(cnt);
		
	}//main
	
}
