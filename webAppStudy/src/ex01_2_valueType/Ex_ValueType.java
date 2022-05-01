package ex01_2_valueType;

public class Ex_ValueType {
	public static void main(String[] args) {
		//자료형(기본자료형) :: 그릇
		/* JVM은 128mb의 가상 메모리를 제공함
		 * 
		 * 논리형 : boolean - 1bit
		 * 문자형 : char - 2byte
		 * 정수형 : byte - 1byte,  -128~127
		 * 		short - 2byte,-3만2천768~3만2천768
		 * 		int - 4byte, -21억~21억 (가장 많이 사용, 4.0byte)
		 * 		long - 8byte, -900경~900경
		 * 실수형 : float - 4byte (4.xxbyte) >> int보다 큼
		 * 		double - 8byte (
		 * 
		 */
		// 변수 : 이름을 달아준다.
		// 자로형 변수명; >> 선언
		// 변수명 = 값; >> 대입
		// 자료형 변수명 = 값; >> 선언과 대입을 동시에 하고 (초기화)
		// = : 값을 변수에 넣는다. 라는 의미
		// == : 같다.
		
		// 변수명 선언 규칙
		// 반드시 첫글자는 소문자로 적는다
		// 숫자가 앞에 올 수는 없다
		// 이미 있는 문법(if, for, switch..등)으로 변수명을 작성하지 않는다.
		// 의미있는 단어로 (본인이 기억하기 쉬운 단어) 변수명을 만든다.
		
		boolean b1 = true; 
		boolean b2 = false; //b1일 경우 변수명 중복 오류 >>b2
		System.out.println(b1);
		System.out.println(b2);		
		System.out.println("----------------------------------");
		
		char c1 = 'A';
		char c2 = 65; // 아스키코드
		System.out.println("char c1 = "+c1);
		System.out.println("char c2 = "+c2);
		System.out.println("----------------------------------");
		
		short s1 = 32765;
		System.out.println("short s1 = "+s1);
//		short s2 = 40000; >> 범위가 벗어나면 바로 오류
		int s2 = 40000;
		System.out.println("int s2 = "+s2);
		System.out.println("----------------------------------");
		float f1 = 3.14f; // 기본형이 double이기 때문에 오류남. 오류를 막아주기 위해서 float의 값 뒤에 f를 붙여주면 됨
		double d1 = 3.14;
		System.out.println("float f1 = "+f1);
		System.out.println("double d1 = "+d1);		
		
		
	}//main : 나중에 중괄호 많아지면 헷갈리기때문에 적어놓으면 편함

}
