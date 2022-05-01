package ex05_3_random;

import java.util.Random;

public class Ex2_work {
	public static void main(String[] args) {
		//1~45의 난수를 발생시켜서 로또번호를 생성하는 프로그램 만들기
		
		int arNum[] = new int[6];
		
		for (int i = 0; i < arNum.length; i++) {
			arNum[i]+=new Random().nextInt(45)+1;
			
			for (int j = 0; j < i; j++) { //중복숫자 검사
				if(arNum[i]==arNum[j]) {
					arNum[i]= new Random().nextInt(45)+1;
					
				}
			}
		}		
		System.out.println("이번주 로또 당첨 번호는");
		for (int i = 0; i < arNum.length; i++) {
			System.out.print(arNum[i]+" ");
		}
		System.out.println("입니다.");
		
		// 강사 풀이
		int[] arr = new int[6];
		outer : for (int i = 0; i < arr.length; i++) {
			arr[i]=new Random().nextInt(45)+1;
			// 중복값 비교 반복문
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					continue outer;
				}
			}
			System.out.print(arr[i]+" ");			
		}
		
		
	}//main

}
