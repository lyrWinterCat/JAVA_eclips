package ex10_2_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		// 추상클래스는 인스턴스(주소값)를 직접 가질 수 없다.
		// 객체화를 시킬 수 없다!
//		AbsParent ap = new AbsParent();
		
		AbsChild ac = new AbsChild();
		ac.setValue(10);
		System.out.println(ac.getValue());
	}

}
