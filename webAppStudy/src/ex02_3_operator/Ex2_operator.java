package ex02_3_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		// �񱳿����� : ������ ���� ���ؼ� ���� ������ �Ǵ��ϴ� ������
		// > , < , >= , <= , == , !=
		
		int a , b;
		a=10; b=5;
		boolean res = a<b;
		System.out.println(res);
		
		a=20;
		b=20;
		res=a==b;
		boolean res2 = a!=b; // != �����ڴ� ���� ���� �޶�� true, ���� ���ٸ� false
		System.out.println(res);
		System.out.println(res2);
		
	}//main

}
