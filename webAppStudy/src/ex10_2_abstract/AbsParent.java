package ex10_2_abstract;

abstract public class AbsParent { // abstract 메서드를 포함할거면 클래스 앞에도 붙여주어야 함 >>추상클래스
	// 추상 메서드를 하나라도 가지고 있는 클래스 >> abstract 키워드를 붙혀서 추상클래스로 정의해야한다.
	private int value = 100;

	public int getValue() { // 만들어야할 게터세터 변수가 적으면 get+ctrl space 해서 생성할수도있음
		return value;
	}

	// 추상메서드는 body( {} ) 가 없다.
	abstract public void setValue(int n); // {} 가 없음. 추상메서드. (미완성)
	// public abstract void setValue(int n); //abstract의 위치는 void 앞에만 위치하면 됨
	// 자식클래스에게 이 메서드를 넘김 >> 너가 완성해! 
	
	// 미완성 개념을 갖고 있는 추상메서드를 자식이 상속받아서 완성시키려고 하는 조건이 있다.
	

	

}
