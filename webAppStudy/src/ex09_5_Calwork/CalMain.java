package ex09_5_Calwork;

public class CalMain {
	public static void main(String[] args) {
		// Calculator 의 getResult() 함수를 정의하고 반환형은 정수
		// 인자 두 개n1, n2)를 받고 -1로 return하게 만듭니다.
		
		//CalPlus클래스에서 오버라이딩을 사용하여 Calculator의 getResult() 함수를
		// 인자로 받은 n1과 n2를 더해주는 함수로 만듭니다.
		// return값이 -1이면 안됨
		
		// CalMinus 클래스에서 오버라이딩을 사용하여 Calculator의 getResult() 함수를 
		// 인자로 받은 n1과 n2를 빼주는 함수로 만듦
		
		// Main에서 실행하여 아래와 같은 결과가 나오면 성공
		// CalPlus : 30;
		// CalMinus : 15;
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		System.out.println("CalPlus : "+cp.getResult(10,20));
		System.out.println("CalMinus : "+cm.getResult(30,15));

	}

}
