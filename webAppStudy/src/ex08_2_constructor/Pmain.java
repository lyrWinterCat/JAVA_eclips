package ex08_2_constructor;

import java.util.Scanner;

public class Pmain {
	public static void main(String[] args) {
		Person p1 = new Person(20,"ȫ�浿","010-1234-1234");
//		p1.age=40;
//		p1.name="ȫ�浿";
//		p1.tel=("010-1234-1234");
		System.out.println(p1.age);
		
		Person p2 = new Person(40,"ȫ���","010-111-1111");
//		p2.name="ȫ���";
		
		Person p3 = new Person(); //�⺻�����ڿ� ���� �־��شٸ� �̷��� ���� ����
		System.out.println(p3.age); // �⺻�����ڿ��� ������ �� ���
		
		Scanner sc = new Scanner(System.in); // Ű���忡�� ���� �������� �� >> System.in����
		// ���� �־����� �ʾ������� ���
		
		
		
		
	}
	

}
