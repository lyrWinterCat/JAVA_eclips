package ex09_3_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		// Child 클래스는 Parent 클래스를 상속받은 상태이므로
		// 부모로부터 받은 money, str 등의 변수를 마음대로 가져다 사용할 수 있다.
		
		// 부모자식 관계 객체는 자식객체가 메모리 영역에 할당이 되면
		// 힙 영역에 부모 영역이 먼저 만들어진다.
		// 부모 객체와 자식 객체느 메모리 영역에 주소(인스턴스)를 공유한다.
		Child c1 = new Child();
		System.out.println(c1.car); // 부모에게 차가 있더라도, 본인 객체의 변수를 우선해서 출력
		System.out.println(c1.getMoney()); // 부모클래스의 변수를
//		System.out.println(c1.str); // 쓸 수 있음 >> private가 붙어서 못씀
		
		// 자식은 부모의 재산을 쓸 수 있지만, 부모는 자식의 재산에 손을 대는 것이 불가능하다.
		Parent p1 = new Parent();
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
//		System.out.println(p1.car); >> 부모가 자식의 변수를 사용하는 것은 안됨
		
		System.out.println("----------------------------");
		
		// 자식과 부모의 주소가 같다는 것 증명
		// c1과 Parent가 상속관계라면
		// instanceof 키워드를 통해서 true값을 얻을 수 있다.
		boolean is_true = c1 instanceof Parent; // >> true / false
		if(c1 instanceof Parent) {
			System.out.println("c1은 parent의 자식!!");
		}
		
		// 자바의 단일 상속 체제
		// 1) 한 명의 자녀가 두 명의 부모를 갖는 것은 불가능하다.
		// 2) 언제든 어떤 상황이 됐든 상속관계의 꼭대기에는 Object가 있다.
		// 3) Object는 모든 타입을 받아들일 수 있는 최상위 객체이다.
		
		
	}//main

}
