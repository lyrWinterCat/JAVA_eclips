package ex09_3_inheritance;

public class Child extends Parent{
	// 상속 : 부모가 가지고 있는 재산 일부를 자식이 물려받는 것.
	// stack / heap
	// c1	/ parent[money , str (child - car)] 
	// 부모의 주소와 자식의 주소를 공유
	
	
	// Child는 Parent 클래스의 자식임을 명시하는 extends 키워드 사용
	String car = "티볼리";

}
