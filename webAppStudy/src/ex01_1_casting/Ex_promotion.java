package ex01_1_casting;

public class Ex_promotion {
	public static void main(String[] args) {
		// ����ȯ
		// ���θ�� (promotion) : ���� �ڷ������� ū �ڷ������� ����ȯ�� �ϴ� ��
		// ���� (demotion) : ū �ڷ������� ���� �ڷ������� ����ȯ�� �ϴ� ��.
		
		double d = 100.5; // 8byte
		int num = 200; //4byte
		
		d = num; // �ڹٿ�����  = : =�� �������� �������� ���� ���ʿ� �ִ� ��!
		System.out.println("d = "+d); //200.0 �Ǽ� 
		System.out.println("num = "+num); //200 ����
		
		char c = 'A';
		long l = 100;
		l=c;
		System.out.println("l = "+l); //65 >> �ƽ�Ű�ڵ�
		// ���θ���� �ڵ����� �̷������! 
		
		System.out.println("-----------------------------------------");
		byte b1 = 100;
		byte b2 = 30;
//		byte b3 = b1 + b2; // byte�� 127����. ���� ���ϸ� ������ ����.>> ���� (short�� �൵ ����!)
		int b4 = b1+b2;
		
		System.out.println("b1 + b2 = "+b4);
	}

}
