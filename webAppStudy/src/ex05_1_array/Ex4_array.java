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
		
		// int [] arr = {10,20,30,40,50}으로 초기화된 배열이 있을때
		// 인자들의 총 합을 출력하세요
		
		int [] arNum = {10,20,30,40,50};
		int sum=0;
		for (int i = 0; i < arNum.length; i++) {
			sum+=arNum[i];
		}
		System.out.println(sum);
		System.out.println("--------------------------------------");
		// 발생된 난수 money를 동전으로 바꾸면 각 동전이 몇 개씩 필요한 지를 판단하는 코드 작성
		// 가능한 적은 수의 동전을 사용하세요.
		// 예) 4170 >> 500원 : 8 100원 : 1 50원 : 1 10원 : 2
		// 난수를 발생할 때 1의자리는 없도록
		int fH=0; // 배열 안썼당 ㅎㅎ;;
		int oH=0;
		int fT=0;
		int tT=0;
		while(true) {
			int money = new Random().nextInt(1000)+1; 
			money*=10;// 1의자리 제거
			System.out.println("금액 : "+money);
			fH=money/500;
			oH=(money%500)/100;
			fT=((money%500)%100)/50;
			tT=(((money%500)%100)%50)/10;
			break;
		}
		System.out.printf("500원 : %d 100원 : %d 50원 : %d 10원 : %d",fH,oH,fT,tT);
		System.out.println();
		
		// 강사풀이
		int [] coin = {500,100,50,10};
		int money2 = new Random().nextInt(1000)+1;
		money2*=10;
		System.out.println("금액 : "+money2);
		for (int i = 0; i < coin.length; i++) {
			int res = money2/coin[i];
			System.out.println(coin[i]+"원: "+res);
			money2%=coin[i];
		}
		
		
		
	}

}
