package ex04_3_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ctrl shift o ������ �ѹ��� import��! 
		
		// Ű���忡�� ������ �Է¹��� �� , �� ���ڰ� �Ҽ����� �ƴ����� �Ǵ��ϴ�
		// �ڵ带 �ۼ�
		
		// ���� 11 :
		// 11��(��) �Ҽ��Դϴ�.
		
		System.out.println("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int flag = 0;
		for(int i = 2; i<num; i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+"��(��) �Ҽ��Դϴ�.");
		}else {
			System.out.println(num+"��(��) �Ҽ��� �ƴմϴ�.");
		}
		
		// ���� Ǯ��
		num = sc.nextInt();
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.printf("%d��(��) �Ҽ��Դϴ�.",num);
		}else {
			System.out.printf("%d��(��) �Ҽ��� �ƴմϴ�.",num);			
		}

		
		
	}//main

}
