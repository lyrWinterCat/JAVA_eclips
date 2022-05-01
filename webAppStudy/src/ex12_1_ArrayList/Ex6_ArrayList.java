package ex12_1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6_ArrayList {
	public static void main(String[] args) {
		// 아이디를 키보드로 입력받아서 생성
		// ArrayList 생성
		
		// 결과
		
		// 아이디 생성 : abc
		// abc
		
		// 아이디 생성 : abc2
		// abc abc2
		
		// 아이디 생성 : abc3
		// abc abc2 abc3
		
		// 아이디 생성 : 
		
		// 생성된 아이디를 arraylist에 넣어서 출력
		
		ArrayList<String> arrid = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			arrid.add(id);
			for (int i = 0; i < arrid.size(); i++) {
				System.out.print(arrid.get(i)+" ");
//				System.out.println(arrid); >> 강사풀이
			}
			System.out.println();
			
		}
		
		
	}//main

}
