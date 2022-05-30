package backjoon1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		// 1546 ЦђБе
		int score = sc.nextInt();
		int scores[] = new int[score];		
		float newScores[]= new float [score];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i]=sc.nextInt();

		}
		Arrays.parallelSort(scores);

		float max = scores[scores.length-1];
		float sum=0;
		
		for (int i = 0; i < score; i++) {

			newScores[i]=((scores[i]/max))*100;
			sum+=newScores[i];
		}

		System.out.println(sum/score);
	}

}
