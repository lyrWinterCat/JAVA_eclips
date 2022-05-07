package ex17_3_Thread;

public class Ex07_YieldMain {
	public static void main(String[] args) {
		Ex05_YieldTest yt1 = new Ex05_YieldTest();
		Ex06_YieldTest2 yt2 = new Ex06_YieldTest2();
		
		Thread t1 = new Thread(yt1);
		Thread t2 = new Thread(yt2);
		
		t1.start();
		t2.start();
	}

}
