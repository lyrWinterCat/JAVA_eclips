package ex17_2_Thread;

public class MyThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		// .run()�� �� ��� thred�� ������� ������ �Ʒ��� �ڵ� ������� ����
		// thread�� ����ϴ� ���� �ִ��� ���ÿ� �Ͼ�� ��ó�� ���̰� �ϱ� ���Ѱ�
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
	}

}
