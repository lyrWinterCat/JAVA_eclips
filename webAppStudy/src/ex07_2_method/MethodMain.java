package ex07_2_method;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest m1 = new MethodTest();
		m1.test1();
		
		int su = 10;
		m1.value(su);
		
		// �Ķ���͸� �� ���� ���� ���簡 �Ǿ ������ �ǰ�
		// �������� ���������Ƿ� ����� �ϸ� �������� ��µȴ�.
		System.out.println(su);
		
		System.out.println("------------------------");
		
		int i1 = 10;
		int i2 = 5;
		
		String res=m1.exam(i1, i2); //15 >> �Լ��� ����Ǹ鼭 ���� i1+i2��
		// String res = "10" >>return���� �޾ƿ��� ����
		// String res = "�ȳ�" >>return���� �޾ƿ��� ����
		System.out.println(res); //10 / �ȳ�
		
		int r =m1.exam2('H'); // �Լ��� ����Ǹ鼭 ������ ��� char
		System.out.println(r); //return �� >> int (char�� �ƽ�Ű�ڵ�)
		// main-> sub class : �Ķ���ͷ� ����
		// sub -> main class : return ������ ����
				
		
	}//main

}
