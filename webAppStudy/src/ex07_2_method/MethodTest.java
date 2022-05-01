package ex07_2_method;

public class MethodTest {
	
	public void test1() {
		System.out.println("test1()메서드 호출함");
	}
	
	// valueMethodTest() -> 각 단어의 시작 글자를 대문자로 작성(카멜표기법)
	// value_method_test() -> 단어마다 _를 붙이고 작성(스네이크표기법)
	public void value(int n) {
		n++;
		System.out.println("value() 메서드 : "+n);
	}
	
	// 반환형은 모든 기본자료형과 클래스 타입으로 지정이 가능
	
	public String exam(int n1, int n2) {
		System.out.println(n1+n2);
		// 반환형이 void가 아닌 경우에는 최소 한개의 return 값을 작성해야 된다.
		// 반환형과 return 타입은 반드시 일치해야 한다.
//		return ""+(n1+n2);
//		return "10";
		return "안녕";
	}
	
	//간단하게 char의 아스키코드값 알아보기 메서드
	public int exam2(char c) {
		System.out.println(c);
		// return 코드 아래쪽에는 어떠한 코드도 올 수 없음.
		return c;
	}

}
