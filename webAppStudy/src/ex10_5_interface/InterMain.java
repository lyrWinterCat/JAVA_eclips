package ex10_5_interface;

public class InterMain {
	public static void main(String[] args) {
		// �������̽��� ��ü������ �Ұ���
//		InterTest it = new InterTest();
		InterChild ic = new InterChild();
		System.out.println("getA() : "+ic.getA());
		
	}

}
