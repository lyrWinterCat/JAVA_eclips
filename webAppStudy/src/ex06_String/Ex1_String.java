package ex06_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		// String Ŭ������ �� ���� Ư¡�� ���� �ִ�.
		// 1) ��ü �������� �ΰ���(�Ͻ���,�����)
		// 2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�.(�Һ��� Ư¡)
		
		// �Ͻ��� ��ü ����
		String s1 = "abc";
		// �̹� �տ� ���� ���ڿ��� �������� �Ͻ��� ��ü�� �ִٸ�
		// �ռ� ������ ��ü�� �ּҸ� �����Ѵ�.
		String s2 = "abc";
		String s3 = "abc";
		
		//����� ��ü ����
		String s4 = new String("abc");
		String s5 = new String("abc");
		
		
		// == �����ڴ� �⺻�ڷ����� ���� ���� ���� ���Ѵ�.
		// �׷��� ��ü���� �񱳸� �� ������ �ּҸ� ���ϴ� �����ڷ� ����� �ٲ��. (�ּҰ���)
		if(s1==s2) {
			System.out.println("�ּҰ� �����ϴ�");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�");
		}
		
		System.out.println("=========================");
		
		if(s3==s4) {
			System.out.println("�ּҰ� �����ϴ�");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�");
		}
		
		System.out.println("=========================");
		
		//String.equals(String) >> �ش� String������ ���� ���ϴ� �Լ�
		if(s3.equals(s4)) {
			System.out.println("������ �����ϴ�.");
		}else {
			System.out.println("������ �ٸ��ϴ�.");
		}
		System.out.println("=========================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� : ");
		String s6 = sc.next(); //abc �Է�
		if(s6.equals(s1)) {
			System.out.println("���� �����ϴ�.");
		}else {
			System.out.println("���� �ٸ��ϴ�.");
		}
		if(s6==(s1)) {
			System.out.println("�ּҰ��� �����ϴ�.");
		}else {
			System.out.println("�ּҰ��� �ٸ��ϴ�.");
		}
		
		System.out.println("=========================");
		// �Һ��� Ư¡
		String greet = "�ȳ�"; // ó�� "�ȳ�"�� �����ִ� heap �ּҰ��� ������ ����
		greet+="�ϼ���";
		System.out.println(greet); //"�ȳ��ϼ���" ��� ���ο� heap �ּҰ� ������. �װ��� greet�� �޾ƿ��� ��
		
	}//main

}
