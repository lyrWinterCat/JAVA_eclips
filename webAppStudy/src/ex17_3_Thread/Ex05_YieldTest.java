package ex17_3_Thread;

public class Ex05_YieldTest implements Runnable{
	// yield() : 자신의 시간을 양보하는 메서드.
	// Thread가 작업을 수행중이던 yield()를 만나면 
	// 자신에게 할당된 시간을 다음 차례 스레드에게 양보

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("★");
			Thread.yield();
		}
		
	}
}
