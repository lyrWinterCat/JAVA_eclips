package ex09_3_inheritance;

public class Parent extends Object{
	// Object
	// 자바 최상위 클래스
	// 모든 클래스는 object를 상속받고 있음
	
	// 부모 클래스에서 멤버변수에 private 쓰면 자식 클래스에서 함부로 가져다가 사용할 수 없다.
	private int money = 20_0000_0000; // 부모의 재산
	private String str = "서울"; // 부모의 부동산
//	private String car = "제네시스";
	
	public int getMoney() {
		return money;
	}

	public String getStr() {
		return str;
	}

	

}
