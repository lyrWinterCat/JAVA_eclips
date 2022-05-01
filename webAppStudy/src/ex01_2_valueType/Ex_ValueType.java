package ex01_2_valueType;

public class Ex_ValueType {
	public static void main(String[] args) {
		//�ڷ���(�⺻�ڷ���) :: �׸�
		/* JVM�� 128mb�� ���� �޸𸮸� ������
		 * 
		 * ���� : boolean - 1bit
		 * ������ : char - 2byte
		 * ������ : byte - 1byte,  -128~127
		 * 		short - 2byte,-3��2õ768~3��2õ768
		 * 		int - 4byte, -21��~21�� (���� ���� ���, 4.0byte)
		 * 		long - 8byte, -900��~900��
		 * �Ǽ��� : float - 4byte (4.xxbyte) >> int���� ŭ
		 * 		double - 8byte (
		 * 
		 */
		// ���� : �̸��� �޾��ش�.
		// �ڷ��� ������; >> ����
		// ������ = ��; >> ����
		// �ڷ��� ������ = ��; >> ����� ������ ���ÿ� �ϰ� (�ʱ�ȭ)
		// = : ���� ������ �ִ´�. ��� �ǹ�
		// == : ����.
		
		// ������ ���� ��Ģ
		// �ݵ�� ù���ڴ� �ҹ��ڷ� ���´�
		// ���ڰ� �տ� �� ���� ����
		// �̹� �ִ� ����(if, for, switch..��)���� �������� �ۼ����� �ʴ´�.
		// �ǹ��ִ� �ܾ�� (������ ����ϱ� ���� �ܾ�) �������� �����.
		
		boolean b1 = true; 
		boolean b2 = false; //b1�� ��� ������ �ߺ� ���� >>b2
		System.out.println(b1);
		System.out.println(b2);		
		System.out.println("----------------------------------");
		
		char c1 = 'A';
		char c2 = 65; // �ƽ�Ű�ڵ�
		System.out.println("char c1 = "+c1);
		System.out.println("char c2 = "+c2);
		System.out.println("----------------------------------");
		
		short s1 = 32765;
		System.out.println("short s1 = "+s1);
//		short s2 = 40000; >> ������ ����� �ٷ� ����
		int s2 = 40000;
		System.out.println("int s2 = "+s2);
		System.out.println("----------------------------------");
		float f1 = 3.14f; // �⺻���� double�̱� ������ ������. ������ �����ֱ� ���ؼ� float�� �� �ڿ� f�� �ٿ��ָ� ��
		double d1 = 3.14;
		System.out.println("float f1 = "+f1);
		System.out.println("double d1 = "+d1);		
		
		
	}//main : ���߿� �߰�ȣ �������� �򰥸��⶧���� ��������� ����

}
