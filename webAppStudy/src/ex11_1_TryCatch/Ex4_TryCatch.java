package ex11_1_TryCatch;

import java.util.Scanner;

public class Ex4_TryCatch {
	public static void main(String[] args) {
		// Ű���忡�� ������ �Է¹ް� ���� �̿��� ���� �ԷµǾ��ٸ�
		// '������ �Է°���' �̶�� �޼����� ����غ����� ����
		// ���
		// ���� : 100
		// �Է¹��� �� : 100
		// ���� : aaa
		// ������ �Է� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		try {
			int num=sc.nextInt();
			System.out.println("�Է¹��� �� : "+num);
		} catch (Exception e) {
			System.out.println("������ �Է� ����");
		}
		
		
	}//main

}
