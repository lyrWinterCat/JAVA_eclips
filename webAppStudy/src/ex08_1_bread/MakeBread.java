package ex08_1_bread;

public class MakeBread {
	// �޼��� ����� (���� �ٸ� ����� ȣ���ϴ� �� ���� �޼��� �ۼ�) , �����ε� ���
	// ���� Ŭ�������� ������ �޼��带 ȣ������ �� ������ ����� ������ �ڵ带 �ۼ��غ���
	
	// ���
	// ���� ��������ϴ�. >> ù��° �޼��� ȣ����
	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
	}
	
	// ���� ��������ϴ�.
	// ���� ��������ϴ�. >> �ι�° �޼��� ȣ�� ���
	// ��û�Ͻ� n���� ���� ��������ϴ�.
	public void makeBread(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� "+n+"���� ���� ��������ϴ�.");
	}
	
	
	// ũ������ ��������ϴ�.
	// ũ������ ��������ϴ�.
	// ũ������ ��������ϴ�.
	// ��û�Ͻ� oo���� n�� ��������ϴ�. >> ����° �޼��� ȣ�� ���
	public void makeBread(String breadName, int breadN) {
		for (int i = 0; i < breadN; i++) {
			System.out.println(breadName+"�� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� "+breadName+"�� "+breadN+"�� ��������ϴ�.");
	}

}
