package ex09_3_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		// Child Ŭ������ Parent Ŭ������ ��ӹ��� �����̹Ƿ�
		// �θ�κ��� ���� money, str ���� ������ ������� ������ ����� �� �ִ�.
		
		// �θ��ڽ� ���� ��ü�� �ڽİ�ü�� �޸� ������ �Ҵ��� �Ǹ�
		// �� ������ �θ� ������ ���� ���������.
		// �θ� ��ü�� �ڽ� ��ü�� �޸� ������ �ּ�(�ν��Ͻ�)�� �����Ѵ�.
		Child c1 = new Child();
		System.out.println(c1.car); // �θ𿡰� ���� �ִ���, ���� ��ü�� ������ �켱�ؼ� ���
		System.out.println(c1.getMoney()); // �θ�Ŭ������ ������
//		System.out.println(c1.str); // �� �� ���� >> private�� �پ ����
		
		// �ڽ��� �θ��� ����� �� �� ������, �θ�� �ڽ��� ��꿡 ���� ��� ���� �Ұ����ϴ�.
		Parent p1 = new Parent();
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
//		System.out.println(p1.car); >> �θ� �ڽ��� ������ ����ϴ� ���� �ȵ�
		
		System.out.println("----------------------------");
		
		// �ڽİ� �θ��� �ּҰ� ���ٴ� �� ����
		// c1�� Parent�� ��Ӱ�����
		// instanceof Ű���带 ���ؼ� true���� ���� �� �ִ�.
		boolean is_true = c1 instanceof Parent; // >> true / false
		if(c1 instanceof Parent) {
			System.out.println("c1�� parent�� �ڽ�!!");
		}
		
		// �ڹ��� ���� ��� ü��
		// 1) �� ���� �ڳడ �� ���� �θ� ���� ���� �Ұ����ϴ�.
		// 2) ������ � ��Ȳ�� �Ƶ� ��Ӱ����� ����⿡�� Object�� �ִ�.
		// 3) Object�� ��� Ÿ���� �޾Ƶ��� �� �ִ� �ֻ��� ��ü�̴�.
		
		
	}//main

}
