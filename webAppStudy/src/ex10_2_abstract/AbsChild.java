package ex10_2_abstract;

public class AbsChild extends AbsParent{
	// 추상클래스를 상속받은 자식 클래스는
	// 부모가 갖고 있는 추상 메서드(미완성 메서드)를 반드시 받아두어야 한다.
	// 반드시 재정의할 필요는 없지만 오버라이딩을 해서 가지고는 있어야 한다.

	@Override
	public void setValue(int n) {
		// TODO Auto-generated method stub
		System.out.println("추상 메서드 재정의함");
		
	}

}
