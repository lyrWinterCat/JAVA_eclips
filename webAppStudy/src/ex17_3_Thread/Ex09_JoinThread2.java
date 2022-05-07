package ex17_3_Thread;

public class Ex09_JoinThread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("t2 : "+i);
		}
		System.out.println("<<t2¿Ï·á>>");
		
	}

}
