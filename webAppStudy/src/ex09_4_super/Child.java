package ex09_4_super;

public class Child extends Parent{
	
	// super : �θ��� Ŭ����
	public Child() {
		super(10);// parent(), ���� ���־�� ��
		System.out.println("�ڽ�(Child)Ŭ����");
	}
	@Override
	public int result() {		
		return 100;
	}

}
