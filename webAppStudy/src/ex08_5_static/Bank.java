package ex08_5_static;

public class Bank {
	
	private String point; //���� ��ġ
	private String tel; // ���� ��ȣ
//	float interest=10f;
	static float interest = 10f; // ������
	
	// static : ��ü�� �ƹ��� ���� �����Ǿ
	// �޸𸮻� �� �Ѱ��� ��������� ������ �޼���
	
	// static ������ �޼���� ��ü�������̵� ������ �����ٰ� ����� �� �ִ�.
	// stack, heap ���� static �̶�� ��������� ���� ����
	// static�� ���α׷� ����� ���ÿ� ���� ���� ���캸�� �������
	// ��ü�� ������ �ʿ� X. Ŭ���� �̸����� ���� ����
	
	public Bank(String point, String tel) {
		this.point=point;
		this.tel=tel;
	}
	public void getBank() {
		System.out.printf("���� : %s \n",point);
		System.out.printf("��ȭ��ȣ : %s \n",tel);
		System.out.printf("������ : %.1f \n",interest);
	}

	

}
