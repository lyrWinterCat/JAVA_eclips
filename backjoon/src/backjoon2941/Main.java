package backjoon2941;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		String [] croA = {"c=","c-","dz=","d-","nj","lj","s=","z="};
		int cnt=0;
		
		// ���� �ߺ� ���ڿ� �����ϱ�
//		String cWords="";
//		int cCnt=0;
//		for (int i = 0; i < words.length(); i++) {
//			if(!cWords.contains(String.valueOf(words.charAt(i)))) {
//				cWords += String.valueOf(words.charAt(i));
//				cCnt++;
//			}
//		}
//		System.out.println(cCnt);
		
		//���ڿ��� craA ���� Ȯ��
		for (int i = 0; i < croA.length; i++) {
			if(words.contains(croA[i])) {
				words=words.replace(croA[i], "");
				cnt++;
			}
		}//for

		cnt+=words.length();
		System.out.println(cnt);
		
	}//main
	
}
