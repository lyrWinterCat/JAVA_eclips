package ex02_3_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		// 비교연산자 : 변수의 값을 비교해서 참과 거짓을 판단하는 연산자
		// > , < , >= , <= , == , !=
		
		int a , b;
		a=10; b=5;
		boolean res = a<b;
		System.out.println(res);
		
		a=20;
		b=20;
		res=a==b;
		boolean res2 = a!=b; // != 연산자는 값이 서로 달라야 true, 값이 같다면 false
		System.out.println(res);
		System.out.println(res2);
		
	}//main

}
