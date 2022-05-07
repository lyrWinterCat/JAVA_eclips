package ex17_3_Thread;

import java.util.Scanner;

public class Ex11_work implements Runnable{

	// 키보드에서 숫자를 입력받고
	// 스레드에서 입력받은 숫자가 1씩 감소하다가 0이 되었을 때
	// "종료" 라는 메세지와 함께 스레드를 빠져나오도록 만들어보자
	Scanner sc = new Scanner(System.in); 
	public void run() {
		int num=sc.nextInt();
		for (int i = num; i >=0 ; i--) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		System.out.println("종료!");
		}
		
	
	public static void main(String[] args) {
		Ex11_work ew = new Ex11_work();
		Thread t = new Thread(ew);
		System.out.println("숫자 하나를 입력하세요");
		t.start();

	}
}
