package ex02_1_control_stat;

import java.util.Scanner;

public class Ex5_switch {
	public static void main(String[] args) {
		// ���� ex) 4�� �� ���� 00 �� �Դϴ�.
		Scanner sc = new Scanner(System.in);
//		int monthType = 0;
//
//		int month = sc.nextInt();
//		
//		if(month==2) {
//			monthType=3;
//		}else if(month<8 && month%2==1) {
//			monthType=1;
//		}else if(month>=8 && month%2==0) {
//			monthType=1;
//		}else if(month<8 && month%2==0) {
//			monthType=0;
//		}else if(month>=8 && month%2==1) {
//			monthType=0;
//		}		
//		switch(monthType) {
//		case 1:
//			System.out.println(month+"�� �� ���� 31�� �Դϴ�.");
//			break;
//		case 2:
//			System.out.println(month+"�� �� ���� 30�� �Դϴ�.");
//			break;
//		case 3:
//			System.out.println(month+"�� �� ���� 28�� �Դϴ�.");
//			break;
//		default:
//			System.out.println("�ش��ϴ� ���� �����ϴ�.");
//			break;
//		}
		
		//��
		int month=4;
		
		switch(month) { //�񱳰�
		case 1:
			System.out.println("1���� 31�� ���� �ֽ��ϴ�.");
			break;
		
		case 2:
			System.out.println("2���� 28�� ���� �ֽ��ϴ�.");
			break;
		
		case 3:
			System.out.println("3���� 31�� ���� �ֽ��ϴ�.");
			break;
		}// .... �̷��� 12���� �ѹ��� �� �ۼ��ϱ� ---- ù��° ���
		
		// �ϳ��� ������� �������� case�� ���� �� �ִ�!
		int month2 = sc.nextInt();
		switch(month2) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month2+"���� 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month2+"���� 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println(month2+"���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		default:
			System.out.println("1~12 ������ ���ڸ� �Է����ּ���.");
		}// ....�̷��� ���̽��� �����ֱ� ----�ι�° ���
		

		
		
	}//main

}
