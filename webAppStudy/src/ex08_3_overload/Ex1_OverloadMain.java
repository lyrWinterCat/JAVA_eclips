package ex08_3_overload;

public class Ex1_OverloadMain {
	public static void main(String[] args) {
		
		Ex1_Overload ov = new Ex1_Overload();
		ov.result();
		ov.result(3);
		ov.result(3,10);
		ov.result('A');
//		ov.result('65'); // �ƽ�Ű�ڵ����� �޼��忡 �ɷ��� ������ �ȵ�
		ov.result("ABC");
		ov.result("ABC",10);
		ov.result(10,"ABC");
		
		// ���� ���� �� �޼��� �����ε�
//		System.out.print();
	}

}
