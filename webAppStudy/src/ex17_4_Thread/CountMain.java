package ex17_4_Thread;

import java.util.Scanner;

public class CountMain {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		ThreadCount tc = new ThreadCount(sc.nextInt());
		Thread t = new Thread(tc);
		t.start();
	}

}
