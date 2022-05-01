package ex10_5_interface;

public class InterChild implements InterTest{ // 인터페이스 상속 >> implements 구현
	// 인터페이스는 동시에 여러개를 구현하는 '다중구현'이 가능하다!
	
	// 인터페이스를 구현하려면
	// 구현하려는 클래스에서 implement 예약어를 사용한다.	
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return NUM;
	}

}
