package ex10_5_interface;

public interface InterTest {
	// 인터페이스에서는 상수와 추상메서드 이외에는 아무것도 들어갈 수 없다.
	// 인터페이스에서는 메서드를 자동으로 abstract로 인식 (생략가능)
	// 변수는 final로 인식 (생략 가능)
	final int NUM = 100; // 상수 선언 >> 자료형 앞에 final 붙임. 변수명은 항상 대문자로 작성
	abstract public int getA();

}
