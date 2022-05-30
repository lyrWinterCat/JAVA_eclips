package backjoon2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		1 >1 : 1
		1 > 2-7 : 2 (2,3,4,5,6,7 : 6��
		1 > 8-19 : 3 (12��
		1 > 20 - 37 : 4 (18��
		1> 38 - 61: 5(24��
 
		2-7 6������ �� 2��
		8-19 12������ ��3��
		20-37 ���� 18������ ��4��
		
		�� ��� n���϶� ���� ����....
		n=1 >> b=1
		n=2~7 >> b=2
		n=8~19 >> b=3
		b�� n�� 1�� ��츦 �����ϰ� 1�� ����
		n���ǿ� ���� b�� �ֱ�....		
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=1;
		int range=2; //����
		
		if(n==1) {
			System.out.println(1);
		} else {
			while(range<=n) {
				range=range+(6*cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
		
	}
}
