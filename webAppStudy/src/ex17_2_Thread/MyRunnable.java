package ex17_2_Thread;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("���ʺ� ������ : "+i);
		}
		
	}

}
