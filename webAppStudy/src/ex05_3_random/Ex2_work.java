package ex05_3_random;

import java.util.Random;

public class Ex2_work {
	public static void main(String[] args) {
		//1~45�� ������ �߻����Ѽ� �ζǹ�ȣ�� �����ϴ� ���α׷� �����
		
		int arNum[] = new int[6];
		
		for (int i = 0; i < arNum.length; i++) {
			arNum[i]+=new Random().nextInt(45)+1;
			
			for (int j = 0; j < i; j++) { //�ߺ����� �˻�
				if(arNum[i]==arNum[j]) {
					arNum[i]= new Random().nextInt(45)+1;
					
				}
			}
		}		
		System.out.println("�̹��� �ζ� ��÷ ��ȣ��");
		for (int i = 0; i < arNum.length; i++) {
			System.out.print(arNum[i]+" ");
		}
		System.out.println("�Դϴ�.");
		
		// ���� Ǯ��
		int[] arr = new int[6];
		outer : for (int i = 0; i < arr.length; i++) {
			arr[i]=new Random().nextInt(45)+1;
			// �ߺ��� �� �ݺ���
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					continue outer;
				}
			}
			System.out.print(arr[i]+" ");			
		}
		
		
	}//main

}
