package ex17_4_Thread;

public class ThreadCount implements Runnable{
	
	int num;
	
	public ThreadCount(int num) {
		this.num=num;
	}

	@Override
	public void run() {
		for (int i = num; i >=0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Á¾·á");
		
	}

}
