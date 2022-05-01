package ex10_6_Interface;

public interface Menu1 extends Menu2, Menu3{
	// 인터페이스는 인터페이스만 상속이 가능함 (일반클래스는 상속이 불가능)
	// 인터페이스는 구현능력이 없기때문에 다중상속이 가능.
	
	abstract String jjajang();
	
	String jjambbong();

}
