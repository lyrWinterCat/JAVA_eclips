package ex05_1_array;

import java.util.Random;

public class Ex4_array {
	public static void main(String[] args) {
		
		//String[] sArr = new String[4];
		String [] sArr = {"1111","22222","33333","44444","5555"};
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		System.out.println("--------------------------------------");
		
		// int [] arr = {10,20,30,40,50}���� �ʱ�ȭ�� �迭�� ������
		// ���ڵ��� �� ���� ����ϼ���
		
		int [] arNum = {10,20,30,40,50};
		int sum=0;
		for (int i = 0; i < arNum.length; i++) {
			sum+=arNum[i];
		}
		System.out.println(sum);
		System.out.println("--------------------------------------");
		// �߻��� ���� money�� �������� �ٲٸ� �� ������ �� ���� �ʿ��� ���� �Ǵ��ϴ� �ڵ� �ۼ�
		// ������ ���� ���� ������ ����ϼ���.
		// ��) 4170 >> 500�� : 8 100�� : 1 50�� : 1 10�� : 2
		// ������ �߻��� �� 1���ڸ��� ������
		int fH=0; // �迭 �Ƚ�� ����;;
		int oH=0;
		int fT=0;
		int tT=0;
		while(true) {
			int money = new Random().nextInt(1000)+1; 
			money*=10;// 1���ڸ� ����
			System.out.println("�ݾ� : "+money);
			fH=money/500;
			oH=(money%500)/100;
			fT=((money%500)%100)/50;
			tT=(((money%500)%100)%50)/10;
			break;
		}
		System.out.printf("500�� : %d 100�� : %d 50�� : %d 10�� : %d",fH,oH,fT,tT);
		System.out.println();
		
		// ����Ǯ��
		int [] coin = {500,100,50,10};
		int money2 = new Random().nextInt(1000)+1;
		money2*=10;
		System.out.println("�ݾ� : "+money2);
		for (int i = 0; i < coin.length; i++) {
			int res = money2/coin[i];
			System.out.println(coin[i]+"��: "+res);
			money2%=coin[i];
		}
		
		
		
	}

}
