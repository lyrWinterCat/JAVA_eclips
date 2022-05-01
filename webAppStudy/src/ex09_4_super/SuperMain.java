package ex09_4_super;

public class SuperMain {
	public static void main(String[] args) {

		Child ch = new Child();
		// 자식클래스를 생성하면 자식의 생성자가 호출이 되는데,
		// 자식클래스에서 super()로 부모의 생성자를 먼저 호출했으므로,
		// 부모클래스의 생성자에 먼저 접근을 하게 된다.
		
	}//main

}
