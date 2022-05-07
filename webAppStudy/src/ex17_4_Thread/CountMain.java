package ex17_4_Thread;

import java.util.Scanner;

public class CountMain {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		ThreadCount tc = new ThreadCount(sc.nextInt());
		Thread t = new Thread(tc);
		t.start();
	}

}
