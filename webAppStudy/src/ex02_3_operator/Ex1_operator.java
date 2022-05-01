package ex02_3_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		
		// 연산자
		/*
		 * 1. 최고 연산자 : . , () >> 가장 먼저 실행(계산)됨
		 * 2. 증감 연산자 : ++ , -- (1씩 증가/감소)
		 * 3. 산술 연산자 : +,-,*,/,%(모듈러, 몫이 아닌 나머지를 가져온다.)
		 * 4. 시프트 연산자 : >> , << , >>>
		 * 5. 비교 연산자 : < , > , <= , >= , == , != (!는 아니다. 다르다. 의 뜻)
		 * 6. 비트 연산자 : & , | , ^ , ~
		 * 7. 논리 연산자 : &&(and) , ||(or) , !(not)
		 * 8. 조건(삼항) 연산자 : ? , : (조건 ? 참 : 거짓 )
		 * 9. 대입 연산자 : = (오른쪽의 값을 왼쪽에 대입) , *= , /= , %= , += , -=
		 */
		
		// 산술연산자 : 4칙연산과 나머지 연산자를 갖고 있는 연산자
		// + , - , * , / , %
		int n1, n2, n3;
		n1=20;
		n2=7;
		n3=n1+n2;
		System.out.println(n3);
		n3=n1-n2;
		System.out.println(n3);
		n3=n1*n2;
		System.out.println(n3);
		n3=n1/n2;
		System.out.println("n1 / n2 = "+n3+"몫");
		n3=n1%n2;
		System.out.println("n1 % n2 = "+n3+"나머지");
		System.out.println("------------------------");
		
		// 대입연산자 : 특정값을 변수에 전달하기 위해서 기억시킬 때 사용하는 연산자
		// = , += , -= , *= , /= , %=
		// a (+=,-=,*=,/=,%=)b = a(+,-,*,/,%)b
		int num1 = 10;
		int num2 = 7;
		System.out.println("= : num1 num2 = "+num1+" "+num2);
		
		//+= 연산자
		int num3 = 13;
		int num4 = 15;
		// num3+=num4 >> num3 = num3+num4
		num3+=num4;
		System.out.println("+=연산자 (num3+=num4): "+num3);
		
		int num5=20;
		int num6 = 10;
		num5-=num6;
		System.out.println("-=연산자 (num5-=num6): "+num5);
		
		int num7=20;
		int num8=7;
		System.out.println("/=연산자(num7/=num8) : "+(num7/=num8));
		
		int num9=20;
		int num10=7;
		// 아니면 num7,8에 다시 20,7이란 값을 넣어줘도 됨
		System.out.println("%=연산자(num9%=num10) : "+(num9%=num10));
		
		int num11=10;
		int num12=15;
		System.out.println("*=연산자(num11*=num12) : "+(num11*=num12));
		
	}//main
}
