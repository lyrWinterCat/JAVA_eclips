package ex10_2_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		// �߻�Ŭ������ �ν��Ͻ�(�ּҰ�)�� ���� ���� �� ����.
		// ��üȭ�� ��ų �� ����!
//		AbsParent ap = new AbsParent();
		
		AbsChild ac = new AbsChild();
		ac.setValue(10);
		System.out.println(ac.getValue());
	}

}
