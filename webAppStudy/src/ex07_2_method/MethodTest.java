package ex07_2_method;

public class MethodTest {
	
	public void test1() {
		System.out.println("test1()�޼��� ȣ����");
	}
	
	// valueMethodTest() -> �� �ܾ��� ���� ���ڸ� �빮�ڷ� �ۼ�(ī��ǥ���)
	// value_method_test() -> �ܾ�� _�� ���̰� �ۼ�(������ũǥ���)
	public void value(int n) {
		n++;
		System.out.println("value() �޼��� : "+n);
	}
	
	// ��ȯ���� ��� �⺻�ڷ����� Ŭ���� Ÿ������ ������ ����
	
	public String exam(int n1, int n2) {
		System.out.println(n1+n2);
		// ��ȯ���� void�� �ƴ� ��쿡�� �ּ� �Ѱ��� return ���� �ۼ��ؾ� �ȴ�.
		// ��ȯ���� return Ÿ���� �ݵ�� ��ġ�ؾ� �Ѵ�.
//		return ""+(n1+n2);
//		return "10";
		return "�ȳ�";
	}
	
	//�����ϰ� char�� �ƽ�Ű�ڵ尪 �˾ƺ��� �޼���
	public int exam2(char c) {
		System.out.println(c);
		// return �ڵ� �Ʒ��ʿ��� ��� �ڵ嵵 �� �� ����.
		return c;
	}

}
