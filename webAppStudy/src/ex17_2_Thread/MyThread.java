package ex17_2_Thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("스레드 진행중 : "+i);
		}
	}
}
