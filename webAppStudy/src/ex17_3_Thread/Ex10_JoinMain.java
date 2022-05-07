package ex17_3_Thread;

public class Ex10_JoinMain {
	public static void main(String[] args) {
		Ex08_JoinThread1 jt1 = new Ex08_JoinThread1();
		Ex09_JoinThread2 jt2 = new Ex09_JoinThread2();
		
		Thread t1 = new Thread(jt1);
		Thread t2 = new Thread(jt2);
		
		//join���� ���� �����带 ���� �Ϸ� �ϰ� ���� ������ ����
		//yield�� ������ ���� ������ �� ������ �Ʒ��� ������� ���� (�纸)
		
		t1.start();
		try {
			t1.join(); // t1�� ������ ������ ������ block
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();
		try {
			t2.join();
		} catch (Exception e) { // t2�� ������ ������ ������ block
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("���ν����� : "+i);
		}
		
		
	}//main

}
