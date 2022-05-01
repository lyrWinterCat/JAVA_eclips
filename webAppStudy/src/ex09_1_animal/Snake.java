package ex09_1_animal;

public class Snake extends Animal{
	String sensor = "감각이 좋아요";
	
	// 오버로딩(오버로드)는 메서드를 '중복정의'의 의미를 갖는다.
//	public int print(int n) {
//		
//	}
//	public int print(char a) {
//		
//	}
//	public int print(int a, String n) {
//		
//	}
//	public int print(String m, int b) {
//		
//	}

	// 메서드의 오버라이딩 (오버라이드) : '메서드의 재정의'
	// 상속관계의 객체에서 부모의 메서드를 자식이 가져와서 사용하되
	// 이름은 그대로 두고, 내용만 현재 클래스의 상황에 맞게 재정의 하는 것.
	
	// 오버라이딩 메서드는 내용을 제외하고는 부모의 것과 완전히 동일해야 한다.
	@Override
	public int getLeg() { // 이름, 접근제어자, 파라미터가 같음
		return 0; // 반환값 혹은 정의값이 다름 (각 클래스 상황에 맞춰 변경)
	}

}
