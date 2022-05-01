package ex01_1_casting;

public class Ex_promotion {
	public static void main(String[] args) {
		// 형변환
		// 프로모션 (promotion) : 작은 자료형에서 큰 자료형으로 형변환을 하는 것
		// 디모션 (demotion) : 큰 자료형에서 작은 자료형으로 형변환을 하는 것.
		
		double d = 100.5; // 8byte
		int num = 200; //4byte
		
		d = num; // 자바에서의  = : =를 기준으로 오른쪽의 값을 왼쪽에 넣는 것!
		System.out.println("d = "+d); //200.0 실수 
		System.out.println("num = "+num); //200 정수
		
		char c = 'A';
		long l = 100;
		l=c;
		System.out.println("l = "+l); //65 >> 아스키코드
		// 프로모션은 자동으로 이루어진다! 
		
		System.out.println("-----------------------------------------");
		byte b1 = 100;
		byte b2 = 30;
//		byte b3 = b1 + b2; // byte는 127까지. 둘을 더하면 범위가 넘음.>> 에러 (short로 줘도 에러!)
		int b4 = b1+b2;
		
		System.out.println("b1 + b2 = "+b4);
	}

}
