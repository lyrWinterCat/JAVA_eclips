package ex08_3_overload;

public class Ex1_Overload {
	// 메서드 오버로드 : 메서드의 '중복정의'
	// 하나의 클래스 내에서 같은 이름을 가진 메서드가
	// 여러개 정의되는 것
	
	// 오버로드라고 하는 것 자체가 메서드에서만 적용이 되는 것
	
	// ** 메서드 오버로드의 규칙**
	// 1) 메서드의 이름이 같아야 함
	// 2) 파라미터의 개수가 다른 경우 
	// 3) 파라미터의 개수가 같아도 타입이 다른 경우
	// 4) 파라미터의 개수와 타입이 같아도 순서가 다른 경우	
	
	public void result() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void result(int n) { // 메서드 이름은 같지만(에러) 파라미터를 받으면 정상작동
		System.out.println(n+" 정수를 인자로 받는 메서드");
	}
	
	public void result(int a, int b) {
		System.out.println(a+" "+b+" 정수 2개를 인자로 받는 메서드");
	}
	
	public void result(char n) {
		System.out.println(n + " 문자를 인자로 받는 메서드");
	}
	public void result(String n) {
		System.out.println(n+" 문자열을 인자로 받는 메서드");
	}
	public void result(String n, int a) {
		System.out.println(n+" "+a+" 문자열과 정수를 인자로 받는 메서드");
	}
	
	public void result(int c, String s) {
		System.out.println(c+" "+s+" 정수와 문자열을 인자로 받는 메서드");
	}
	

}
