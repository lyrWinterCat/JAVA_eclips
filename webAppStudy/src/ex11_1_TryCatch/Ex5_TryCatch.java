package ex11_1_TryCatch;

import java.util.Scanner;

public class Ex5_TryCatch {
	public static void main(String[] args) {
		// ���� : 100
		// ��� : 100
		
		// ���� : aab
		// ��� : aab��(��) ������ �ƴմϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String num=sc.next();
		try {
			System.out.println("�Է¹��� �� : "+Integer.parseInt(num));
		} catch (Exception e) {
			System.out.println(num+"��(��) ������ �ƴմϴ�.");
		}
		
		// ���� Ǯ��
		String str = "";
		try {
			int num2=sc.nextInt();
			System.out.println("��� : "+num2);
		} catch (Exception e) {
			String sNum=sc.next();
			System.out.println(sNum+"��(��) ������ �ƴմϴ�.");
			// �ڹ� ����. try���� ���� sc���� �״�� sNum�� �ִ´�
		}
		
		
		
		
		
	}//main

}
