package ex04_3_scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		// Scanner Ŭ���� : Ű���忡�� ���� ���� �Է¹޾� ������ ������ �� �ֵ��� �� �ִ� Ŭ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int num = sc.nextInt();
		System.out.printf("�� ���̴� %d �� �Դϴ�.\n",num);
		// Ű���忡�� int Ÿ���� ���� �ް� ���͸� ġ�� ����
		// num ������ ����ڰ� �Է¹��� ���� �������ش�.
		
		System.out.println("�̸� : ");
		String name = sc.next();
		System.out.println("�� �̸��� "+name+" �Դϴ�.");
		System.out.printf("�� �̸��� %s �Դϴ�.\n",name);
		String s1 = sc.next();
		System.out.println("���� ���� : "+s1);
		
		System.out.println("------------------------------------");
		
		// �ǽ� : Ű���忡�� ���� �Է¹ް� �ش��ϴ� ������ ���
		int dan = sc.nextInt();
		if(!(dan>=2 && dan<=9)){
			System.out.println("2�� 9 ������ ���ڸ� �Է����ּ���");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d \n",dan,i,(dan*i));
			}			
		}
		
		// ���� Ǯ��
		System.out.println("�������� �� �Է� : ");
		dan = sc.nextInt();
		
		if(dan<=1 || dan >=10) {
			System.out.println("2~9 ������ ���ڸ� �Է��ϼ���");
		}else {
			for (int i = 1; i <=9; i++) {
				System.out.printf("%d * %d = %d \n", dan, i , (dan*i));
			}
		}
		
	}//main

}
