package ex17_3_Thread;

public class Ex01_MainThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		System.out.println("현재 실행되고 있는 스레드의 이름 : "+Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태 : "+Thread.currentThread().getState()); //runnable >> 실행중이라는 표시
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : "+Thread.currentThread().getPriority());
	}//main
}

class MyThread extends Thread{
	@Override
	public void run() {
		this.setName("Thread2"); //스레드에 이름 지정
		System.out.println("현재 실행되고 있는 스레드의 이름 : "+Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태 : "+Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : "+Thread.currentThread().getPriority());
	}
}
