package ex17_3_Thread;

public class Ex03_SleepThread extends Thread{
	@Override
	public void run() {
		System.out.println("ī��Ʈ �ٿ� 5��");
		for (int i = 5; i >=0; i--) {
			if(i!=0) { // ī��Ʈ�ٿ� ���� �ɾ���� >> if������ ���ٸ� �ѹ��� 54321�� ��µ� ��
				try { 
					Thread.sleep(1000); // 1�� (=1000�и���)
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//if
		}//for
		System.out.println("����");	
	
	}
	

}
