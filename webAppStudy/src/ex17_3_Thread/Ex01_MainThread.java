package ex17_3_Thread;

public class Ex01_MainThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		System.out.println("���� ����ǰ� �ִ� �������� �̸� : "+Thread.currentThread().getName());
		System.out.println("���� ����ǰ� �ִ� �������� ���� : "+Thread.currentThread().getState()); //runnable >> �������̶�� ǥ��
		System.out.println("���� ����ǰ� �ִ� �������� �켱���� : "+Thread.currentThread().getPriority());
	}//main
}

class MyThread extends Thread{
	@Override
	public void run() {
		this.setName("Thread2"); //�����忡 �̸� ����
		System.out.println("���� ����ǰ� �ִ� �������� �̸� : "+Thread.currentThread().getName());
		System.out.println("���� ����ǰ� �ִ� �������� ���� : "+Thread.currentThread().getState());
		System.out.println("���� ����ǰ� �ִ� �������� �켱���� : "+Thread.currentThread().getPriority());
	}
}
