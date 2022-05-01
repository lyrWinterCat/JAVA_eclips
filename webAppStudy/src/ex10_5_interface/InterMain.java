package ex10_5_interface;

public class InterMain {
	public static void main(String[] args) {
		// 인터페이스는 객체생성이 불가능
//		InterTest it = new InterTest();
		InterChild ic = new InterChild();
		System.out.println("getA() : "+ic.getA());
		
	}

}
