package ex08_5_static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("강남","02-1111-1111");
		Bank bk2 = new Bank("분당","031-1111-2222");
		Bank bk3 = new Bank("홍대","02-2222-1111");
		
//		bk1.interest=0.1f; // static 안 썼을때 >> 하나만 변경
		bk1.interest=0.1f; // static 썼을때 >> 하나만 변경해도 전부가 변경
		Bank.interest=0.1f; // 클래스 이름으로 접근
		
		bk1.getBank();
		System.out.println("---------------------------");
		bk2.getBank();
		System.out.println("---------------------------");
		bk3.getBank();
		
	}

}
