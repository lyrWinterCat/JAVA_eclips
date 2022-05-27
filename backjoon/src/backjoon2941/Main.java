package backjoon2941;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		String [] croA = {"c=","c-","dz=","d-","nj","lj","s=","z="};
		int cnt=0;
		
		// 먼저 중복 문자열 제거하기
		String cWords="";
		int cCnt=0;
		for (int i = 0; i < words.length(); i++) {
			if(!cWords.contains(String.valueOf(words.charAt(i)))) {
				cWords += String.valueOf(words.charAt(i));
				cCnt++;
			}
		}
		System.out.println(cCnt);
		
		//문자열에 craA 포함 확인
		for (int i = 0; i < croA.length; i++) {
			if(cWords.contains(croA[i])) {
				cWords=cWords.replace(croA[i], "");
				cnt++;
				System.out.println(cWords);
			}
		}//for
		
		System.out.println(cnt);
		cnt+=cWords.length();
		System.out.println(cnt);
		
	}//main
	
}
