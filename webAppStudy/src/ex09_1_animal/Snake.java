package ex09_1_animal;

public class Snake extends Animal{
	String sensor = "������ ���ƿ�";
	
	// �����ε�(�����ε�)�� �޼��带 '�ߺ�����'�� �ǹ̸� ���´�.
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

	// �޼����� �������̵� (�������̵�) : '�޼����� ������'
	// ��Ӱ����� ��ü���� �θ��� �޼��带 �ڽ��� �����ͼ� ����ϵ�
	// �̸��� �״�� �ΰ�, ���븸 ���� Ŭ������ ��Ȳ�� �°� ������ �ϴ� ��.
	
	// �������̵� �޼���� ������ �����ϰ�� �θ��� �Ͱ� ������ �����ؾ� �Ѵ�.
	@Override
	public int getLeg() { // �̸�, ����������, �Ķ���Ͱ� ����
		return 0; // ��ȯ�� Ȥ�� ���ǰ��� �ٸ� (�� Ŭ���� ��Ȳ�� ���� ����)
	}

}
