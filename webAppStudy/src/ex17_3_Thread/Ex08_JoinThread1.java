package ex17_3_Thread;

public class Ex08_JoinThread1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("t1 : "+i);
		}
		System.out.println("<<t1¿Ï·á>>");
		
	}

}
