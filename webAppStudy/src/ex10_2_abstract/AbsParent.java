package ex10_2_abstract;

abstract public class AbsParent { // abstract �޼��带 �����ҰŸ� Ŭ���� �տ��� �ٿ��־�� �� >>�߻�Ŭ����
	// �߻� �޼��带 �ϳ��� ������ �ִ� Ŭ���� >> abstract Ű���带 ������ �߻�Ŭ������ �����ؾ��Ѵ�.
	private int value = 100;

	public int getValue() { // �������� ���ͼ��� ������ ������ get+ctrl space �ؼ� �����Ҽ�������
		return value;
	}

	// �߻�޼���� body( {} ) �� ����.
	abstract public void setValue(int n); // {} �� ����. �߻�޼���. (�̿ϼ�)
	// public abstract void setValue(int n); //abstract�� ��ġ�� void �տ��� ��ġ�ϸ� ��
	// �ڽ�Ŭ�������� �� �޼��带 �ѱ� >> �ʰ� �ϼ���! 
	
	// �̿ϼ� ������ ���� �ִ� �߻�޼��带 �ڽ��� ��ӹ޾Ƽ� �ϼ���Ű���� �ϴ� ������ �ִ�.
	

	

}
