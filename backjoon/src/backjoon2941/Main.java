package backjoon2941;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		String [] croA = {"c=","c-","dz=","d-","nj","lj","s=","z="};
		
		//���ڿ��� craA ���� Ȯ��
		for (int i = 0; i < croA.length; i++) {
			if(words.contains(croA[i])) {
				words=words.replace(croA[i], "0");
			}
		}//for
		System.out.println(words.length());
		
	}//main
	
}
