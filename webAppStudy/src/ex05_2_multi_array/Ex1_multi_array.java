package ex05_2_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		// 다차원 : 1차원 배열이 두 개 모여있으면 2차원 배열
		// 		: 1차원 배열이 세 개 모여있으면 3차원 배열
		
		int [][] test = new int[2][3];
		//					큰방(행,Y) 작은방(열,X)	
		
		test[0][0]=100;
		test[0][1]=200;
		test[0][2]=300;
		test[1][0]=400;
		test[1][1]=500;
		test[1][2]=600;
		//test[0][3]=400; >> 방에 맞춰서 값을 넣어주어야 함
		// 0: 100 200 300
		// 1: 400 500 600
		
//		System.out.println(test[0][0]);
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) { //test[0].length , test[1].length = 3
				System.out.println(test[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		String[][] java = {{"영희","java:90","android:100"},{"철수","java:100","android:80"}}; //[2][3]
		// String[2][3] 이랑 같은 형태의 배열
		for (int i = 0; i < java.length; i++) {
			for (int j = 0; j < java[i].length; j++) {
				System.out.print(java[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		// 실습예제~~
		// 4x4 칸
		// ABCD/EFGH/IJKL/MNOP 출력되는
		// 배열 만들기
		char [][] abc = new char [4][4];
		int a=65;
		for (int i = 0; i < abc.length; i++) {
			for (int j = 0; j < abc[i].length; j++) {
				abc[i][j]=(char)(a+j);
				System.out.print(abc[i][j]+" ");
			}
			a+=4;
			System.out.println();
		}
		
		// 강사 풀이
		String [][] str = new String[4][4];
		char ch='A';
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j]=""+ch++; // 간단 String 형변환~
				System.out.print(str[i][j]+" ");
			}			
			System.out.println();
		}
		
		
	}//main

}
