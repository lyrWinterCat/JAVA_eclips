package ex01_1_casting;

public class Ex_demotion {
	public static void main(String[] args) {
		// ����(demotion) : ū �ڷ������� ���� �ڷ������� ������ �Ѵ�.
		
		float f1 = 5.5f; // 4.xxbyte
		int num = 0; // 4byte
		
		num = (int)f1; //��������ȯ , 0.5 ���
		System.out.println("num = "+num);
		
		System.out.println("----------------------------");
		
		char c = 'B'; //2byte
		int n = c+1; //4byte >> promotion. �ڵ�����ȯ
		System.out.println("n = "+n);
		
		c = (char)n;
		System.out.println("c = "+c);
		
		
		
		
		
	}//main
}
