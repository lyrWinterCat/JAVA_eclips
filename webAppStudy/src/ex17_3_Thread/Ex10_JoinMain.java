package ex17_3_Thread;

public class Ex10_JoinMain {
	public static void main(String[] args) {
		Ex08_JoinThread1 jt1 = new Ex08_JoinThread1();
		Ex09_JoinThread2 jt2 = new Ex09_JoinThread2();
		
		Thread t1 = new Thread(jt1);
		Thread t2 = new Thread(jt2);
		
		//join으로 정한 스레드를 먼저 완료 하고 다음 스레드 실행
		//yield는 스레드 실행 순서가 꼭 위에서 아래로 진행되지 않음 (양보)
		
		t1.start();
		try {
			t1.join(); // t1을 제외한 나머지 스레드 block
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();
		try {
			t2.join();
		} catch (Exception e) { // t2를 제외한 나머지 스레드 block
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("메인스레드 : "+i);
		}
		
		
	}//main

}
