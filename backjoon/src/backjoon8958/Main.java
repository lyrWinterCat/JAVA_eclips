package backjoon8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		// OXÄûÁî
		int num = sc.nextInt();
		String arQuiz[]= new String [num];	

		for (int i = 0; i < arQuiz.length; i++) {
			arQuiz[i]=sc.next();
			int score=0;
			int cnt=0;
			for (int j = 0; j < arQuiz[i].length(); j++) {
				if(arQuiz[i].charAt(j)=='O') {
					cnt++;
					score+=cnt;
				}else {
					cnt=0;
				}
			}
			System.out.println(score);			
		}
	}

}
