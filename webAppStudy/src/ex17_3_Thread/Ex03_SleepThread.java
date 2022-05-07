package ex17_3_Thread;

public class Ex03_SleepThread extends Thread{
	@Override
	public void run() {
		System.out.println("카운트 다운 5초");
		for (int i = 5; i >=0; i--) {
			if(i!=0) { // 카운트다운 제한 걸어놓기 >> if조건이 없다면 한번에 54321이 출력될 것
				try { 
					Thread.sleep(1000); // 1초 (=1000밀리초)
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//if
		}//for
		System.out.println("종료");	
	
	}
	

}
