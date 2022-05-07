package ex17_2_Thread;

public class MyThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		// .run()을 쓸 경우 thred와 상관없이 위에서 아래로 코드 순서대로 진행
		// thread를 사용하는 것은 최대한 동시에 일어나는 것처럼 보이게 하기 위한것
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
	}

}
