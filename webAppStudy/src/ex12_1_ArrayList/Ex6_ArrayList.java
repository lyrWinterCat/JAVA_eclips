package ex12_1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6_ArrayList {
	public static void main(String[] args) {
		// ���̵� Ű����� �Է¹޾Ƽ� ����
		// ArrayList ����
		
		// ���
		
		// ���̵� ���� : abc
		// abc
		
		// ���̵� ���� : abc2
		// abc abc2
		
		// ���̵� ���� : abc3
		// abc abc2 abc3
		
		// ���̵� ���� : 
		
		// ������ ���̵� arraylist�� �־ ���
		
		ArrayList<String> arrid = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���̵� ���� : ");
			String id = sc.next();
			arrid.add(id);
			for (int i = 0; i < arrid.size(); i++) {
				System.out.print(arrid.get(i)+" ");
//				System.out.println(arrid); >> ����Ǯ��
			}
			System.out.println();
			
		}
		
		
	}//main

}
