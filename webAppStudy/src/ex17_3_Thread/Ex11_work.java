package ex17_3_Thread;

import java.util.Scanner;

public class Ex11_work implements Runnable{

	// Ű���忡�� ���ڸ� �Է¹ް�
	// �����忡�� �Է¹��� ���ڰ� 1�� �����ϴٰ� 0�� �Ǿ��� ��
	// "����" ��� �޼����� �Բ� �����带 ������������ ������
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
			
		System.out.println("����!");
		}
		
	
	public static void main(String[] args) {
		Ex11_work ew = new Ex11_work();
		Thread t = new Thread(ew);
		System.out.println("���� �ϳ��� �Է��ϼ���");
		t.start();

	}
}
