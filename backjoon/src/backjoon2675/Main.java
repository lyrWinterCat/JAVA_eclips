package backjoon2675;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//2675 ���ڿ� �ݺ�
		Scanner sc = new Scanner(System.in);
		int sNum = sc.nextInt();
		for (int i = 0; i < sNum; i++) {
			int num=sc.nextInt();
			String word=sc.next();
			String result="";
			
			for (int j = 0; j < word.length(); j++) {
				for (int k = 0; k < num; k++) {
					result+=word.charAt(j);
				}
			}
			System.out.println(result);			
		}
	}

}
