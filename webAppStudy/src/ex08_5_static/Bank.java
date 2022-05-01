package ex08_5_static;

public class Bank {
	
	private String point; //은행 위치
	private String tel; // 은행 번호
//	float interest=10f;
	static float interest = 10f; // 이자율
	
	// static : 객체가 아무리 많이 생성되어도
	// 메모리상에 딱 한개만 만들어지는 변수나 메서드
	
	// static 변수나 메서드는 객체생성없이도 언제든 가져다가 사용할 수 있다.
	// stack, heap 말고 static 이라는 저장공간에 변수 생성
	// static은 프로그램 실행과 동시에 가장 먼저 살펴보는 저장공간
	// 객체로 접근할 필요 X. 클래스 이름으로 접근 가능
	
	public Bank(String point, String tel) {
		this.point=point;
		this.tel=tel;
	}
	public void getBank() {
		System.out.printf("지점 : %s \n",point);
		System.out.printf("전화번호 : %s \n",tel);
		System.out.printf("이자율 : %.1f \n",interest);
	}

	

}
