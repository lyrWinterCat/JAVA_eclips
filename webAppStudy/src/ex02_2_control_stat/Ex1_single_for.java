package ex02_2_control_stat;

import java.util.Scanner;

public class Ex1_single_for {
	public static void main(String[] args) {
		// �ݺ��� : Ư�� ���๮�� ���ϴ¸�ŭ �ݺ��Ͽ� �����ϴ� ���
		// for(�ʱ��; ���ǽ�; ������){
		//
		// }
		
		for(int i = 0; i<3; i++) {
			System.out.println(i);
		}//for
		for (int i = 1; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------");
		
		// 10���� 1���� �Ųٷ� ����� �ϴ� �ݺ����� �ۼ��Ͻÿ�
		for (int i = 10; i >0; i--) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------");
		
		// ���� n�� �ް� 1���� n���� ������ ���� ���ϴ� �ݺ����� �ۼ��Ͻÿ�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for (int i = 0; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("-------------------------------------");
		// ���� n�� �ް� ������ n���� ����ϼ���
		int dan = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * "+i+" = "+dan*i);
		}
		
	}//main

}
