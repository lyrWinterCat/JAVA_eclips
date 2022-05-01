package ex02_3_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		// 논리연산자 : 비교연산자를 통해서 연산이 두 개 이상 필요할 때 작성하는 연산자
		// && , || 
		
		//&&(and)
		// 참&&참 : 참
		// 참&&거짓 : 거짓
		// 거짓&&참 : 거짓
		// 거짓&&거짓 :거짓
		// 앞의 조건이 거짓이면 뒤에 조건의 연산 계산을 안함
		int age = 21;
		int limit = 25;
		boolean res;
		res=(limit-age)<=5 && age >20;
		System.out.println(res);
		
		res=(limit-age)<=3 && (age+=2)>20;
		System.out.println(res);
		
		// ||(or) : 앞의 조건이나 뒤의 조건이 하나라도 참이라면 참인 연산자
		// 참||참 = 참
		// 참||거짓 = 참
		// 거짓||참=참
		// 거짓||거짓=거짓
		int n1=10;
		int n2=20;
		
		res=(n1-n2)>10 || n2==20;
		System.out.println(res);
		
		// 증감연산자 : 1씩 증가를 시키거나 1씩 감소를 시키는 연산자 (++,--)
		//1. 선행 증감 연상자
		//2. 후행 증감 연산자

		int a=10;
		int b=12;
		System.out.println("++a : "+ ++a);
		System.out.println("a++ : "+ a++); // 다음 출력때 1을 더해서 나올게
		System.out.println(a);
		
		System.out.println("--b : "+ --b);
		System.out.println("b-- : "+ b--);
		System.out.println(b);
		
		// 삼항연산자 : 하나의 조건을 정의해서 만약 그 조건이 참이라면 true, 거짓이라면  false를 얻어내기위한 연산자
		// ? , :
		
		int num1 = 10;
		int num2 = 15;
		boolean result;
		char answer;
		int answer2;
		result = ++num1>=num2? true:false;
		System.out.println(result);
		
		answer = ++num1 >= num2 ? 'O':'X';
		System.out.println(answer);
		
		answer2 = ++num1 >= num2 ? 1:0;
		System.out.println(answer2);
		
		
		
		
		
	}

}
