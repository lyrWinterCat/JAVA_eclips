package ex02_1_control_stat;

import java.util.Scanner;

public class Ex6_switch {
	public static void main(String[] args) {
		// �� ���� ������ �ʱ�ȭ�ϰ�
		// �����ڸ� �ϳ� �޾Ƽ�(+ - * /) switch������ ������ �����ϴ� �ڵ带 �ۼ�
		// ��� ��� : 0 + 0 = 0
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		switch(c) {//�񱳰�
		case "+" : //���ǰ�
			System.out.println(a+" + "+b+" = "+(a+b));
			break;
		case "-" :
			System.out.println(a+" - "+b+" = "+(a-b));
			break;
		case "*" :
			System.out.println(a+" * "+b+" = "+(a*b));
			break;
		case "/" :
			System.out.println(a+" / "+b+" = "+(a/b));
			break;
		default:
			System.out.println("+ - / * �� �ϳ��� �Է����ּ���.");
		}
		
	}//main

}
