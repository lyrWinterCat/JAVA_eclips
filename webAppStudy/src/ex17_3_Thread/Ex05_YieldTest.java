package ex17_3_Thread;

public class Ex05_YieldTest implements Runnable{
	// yield() : �ڽ��� �ð��� �纸�ϴ� �޼���.
	// Thread�� �۾��� �������̴� yield()�� ������ 
	// �ڽſ��� �Ҵ�� �ð��� ���� ���� �����忡�� �纸

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("��");
			Thread.yield();
		}
		
	}
}
