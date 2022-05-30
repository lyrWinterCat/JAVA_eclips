package backjoon4344;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		// 학생 평균 문제
		int num = sc.nextInt();
		sc.nextLine();
		
		String arScores[] = new String[num];		
		
		for (int i = 0; i < arScores.length; i++) {
			arScores[i]=sc.nextLine(); // 한 줄씩 학생수 , 학생 점수 입력
			String[] strScore = arScores[i].split(" "); // 공백 기준으로 잘라서 배열 생성
			int sum=0;
			float avg = 0;
			for (int j = 0; j < strScore.length; j++) {
				if(j>=1) {
					sum+=Integer.parseInt(strScore[j]);
				}
				avg=(float)sum/(Integer.parseInt(strScore[0]));	//학생 점수
			}
			int cnt=0;
			float stuAvg=0;
			for (int j = 0; j < strScore.length; j++) {
				if(j>=1) {
					if(Integer.parseInt(strScore[j])>avg) {
						cnt++;
					}
				}
				stuAvg=(float)cnt/(Integer.parseInt(strScore[0]))*100;
			}
			System.out.printf("%.3f%s\n",stuAvg,'%');
		}
	}

}
