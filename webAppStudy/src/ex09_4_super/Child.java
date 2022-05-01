package ex09_4_super;

public class Child extends Parent{
	
	// super : 부모의 클래스
	public Child() {
		super(10);// parent(), 먼저 써주어야 함
		System.out.println("자식(Child)클래스");
	}
	@Override
	public int result() {		
		return 100;
	}

}
