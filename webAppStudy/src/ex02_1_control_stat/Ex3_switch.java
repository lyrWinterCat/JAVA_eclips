package ex02_1_control_stat;

public class Ex3_switch {
	public static void main(String[] args) {
		
		char c = 'A';
		
		switch(c) {
			case 'A':
				System.out.println("����� ������ 90�� �̻��Դϴ�.");
				break; //break�� ���� ��� ���� break�� ���������� �������Ե�!
			case 'B':
				System.out.println("����� ������ 80�� �̻��Դϴ�.");
				break;
			case 'C':
				System.out.println("����� ������ 70�� �̻��Դϴ�.");
				break;
			case 'D':
				System.out.println("����� ������ 60�� �̻��Դϴ�.");
				break;
			case 'F':
				System.out.println("����� ������ 59�� �����Դϴ�.");
				break;
			default :
				System.out.println("A~F������ ���ĺ��� �Է����ּ���");
				break;
		}
		
	}//main

}
