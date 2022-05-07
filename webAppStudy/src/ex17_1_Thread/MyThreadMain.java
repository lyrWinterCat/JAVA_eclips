package ex17_1_Thread;

public class MyThreadMain {
	public static void main(String[] args) {
		
		// 1) 스레드 클래스를 상속했을때 실행하는 법
		MyThread mt = new MyThread();
//		mt.run(); >>스레드 클래스 상속시 이렇게 호출하지 않음
		mt.start();
		
		// 2) Runnable 인터페이스를 구현했을 때 스레드를 실행하는 법
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr); // Thread 객체 안에 Runnable 인터페이스 받은 객체를 넣어주기
		t.start();
		
		
	}//main

}
