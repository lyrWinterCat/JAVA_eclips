package ex17_1_Thread;

public class MyThreadMain {
	public static void main(String[] args) {
		
		// 1) ������ Ŭ������ ��������� �����ϴ� ��
		MyThread mt = new MyThread();
//		mt.run(); >>������ Ŭ���� ��ӽ� �̷��� ȣ������ ����
		mt.start();
		
		// 2) Runnable �������̽��� �������� �� �����带 �����ϴ� ��
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr); // Thread ��ü �ȿ� Runnable �������̽� ���� ��ü�� �־��ֱ�
		t.start();
		
		
	}//main

}
