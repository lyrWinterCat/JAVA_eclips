package ex08_5_static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("����","02-1111-1111");
		Bank bk2 = new Bank("�д�","031-1111-2222");
		Bank bk3 = new Bank("ȫ��","02-2222-1111");
		
//		bk1.interest=0.1f; // static �� ������ >> �ϳ��� ����
		bk1.interest=0.1f; // static ������ >> �ϳ��� �����ص� ���ΰ� ����
		Bank.interest=0.1f; // Ŭ���� �̸����� ����
		
		bk1.getBank();
		System.out.println("---------------------------");
		bk2.getBank();
		System.out.println("---------------------------");
		bk3.getBank();
		
	}

}
