package ex05_3_random;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Random {
	public static void main(String[] args) {
		// Random : ���� ������ ���� Ŭ����
		
		// 1~5 ������ ������ ����                (0~4) + 1
		int rnd = new Random().nextInt(5)+1;
		// 		 new Random().nextInt(�߻���ų ������ ����)+�����ϴ� ��;
		// 31289~72345
		//		 new Random().nextInt(72345-31289+1)+31289
		System.out.printf("���� : %d",rnd);
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϴ� ���� �Է��ϼ���");
		int su1 = sc.nextInt();
		System.out.println("������ ���� �Է��ϼ���");
		int su2 = sc.nextInt();
		
		// su1�� su2 ������ ������ ���غ�����
		
		int rnd2 = new Random().nextInt(su2-su1+1)+su1;
		System.out.printf("���� : %d",rnd2);
	}

}
