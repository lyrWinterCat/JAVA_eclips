package ex08_3_overload;

public class Ex1_Overload {
	// �޼��� �����ε� : �޼����� '�ߺ�����'
	// �ϳ��� Ŭ���� ������ ���� �̸��� ���� �޼��尡
	// ������ ���ǵǴ� ��
	
	// �����ε��� �ϴ� �� ��ü�� �޼��忡���� ������ �Ǵ� ��
	
	// ** �޼��� �����ε��� ��Ģ**
	// 1) �޼����� �̸��� ���ƾ� ��
	// 2) �Ķ������ ������ �ٸ� ��� 
	// 3) �Ķ������ ������ ���Ƶ� Ÿ���� �ٸ� ���
	// 4) �Ķ������ ������ Ÿ���� ���Ƶ� ������ �ٸ� ���	
	
	public void result() {
		System.out.println("���ڰ� ���� �޼���");
	}
	
	public void result(int n) { // �޼��� �̸��� ������(����) �Ķ���͸� ������ �����۵�
		System.out.println(n+" ������ ���ڷ� �޴� �޼���");
	}
	
	public void result(int a, int b) {
		System.out.println(a+" "+b+" ���� 2���� ���ڷ� �޴� �޼���");
	}
	
	public void result(char n) {
		System.out.println(n + " ���ڸ� ���ڷ� �޴� �޼���");
	}
	public void result(String n) {
		System.out.println(n+" ���ڿ��� ���ڷ� �޴� �޼���");
	}
	public void result(String n, int a) {
		System.out.println(n+" "+a+" ���ڿ��� ������ ���ڷ� �޴� �޼���");
	}
	
	public void result(int c, String s) {
		System.out.println(c+" "+s+" ������ ���ڿ��� ���ڷ� �޴� �޼���");
	}
	

}
