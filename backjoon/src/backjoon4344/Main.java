package backjoon4344;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		// �л� ��� ����
		int num = sc.nextInt();
		sc.nextLine();
		
		String arScores[] = new String[num];		
		
		for (int i = 0; i < arScores.length; i++) {
			arScores[i]=sc.nextLine(); // �� �پ� �л��� , �л� ���� �Է�
			String[] strScore = arScores[i].split(" "); // ���� �������� �߶� �迭 ����
			int sum=0;
			float avg = 0;
			for (int j = 0; j < strScore.length; j++) {
				if(j>=1) {
					sum+=Integer.parseInt(strScore[j]);
				}
				avg=(float)sum/(Integer.parseInt(strScore[0]));	//�л� ����
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
