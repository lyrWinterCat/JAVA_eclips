package backjoon3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		// ������ ����
		int num[] = new int[10];
		int numDiv[] = new int[10];
		int result[] = new int[42];
		int cnt=0;
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) { // numDiv�� num%42 ���� 
			numDiv[i]=num[i]%42;
			result[numDiv[i]]++;
		}
		
		// �ߺ��� ã�ƺ���...^^...
		// result[] �ȿ� 0�� �ƴѰ��� ���� ���ϱ�.... >> result �� �迭 ���� - 0�� ����
		// �ƴϸ� ����for������ ������ �ߺ����� ������ cnt++ �ϰ� result�迭���� - �ߺ�����...........
				
		for (int i = 0; i < result.length; i++) {
			if(result[i]>=1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
