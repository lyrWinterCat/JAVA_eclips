package ex03_1_printf;

public class Ex_homework {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// 4 5 6 7 8 9 10 1 2 3
		// 5 6 7 8 9 10 1 2 3 4
		// 6 7 8 9 10 1 2 3 4 5
		// 7 8 9 10 1 2 3 4 5 6
		// 8 9 10 1 2 3 4 5 6 7
		// 9 10 1 2 3 4 5 6 7 8
		// 10 1 2 3 4 5 6 7 8 9
		
		// 위 글을 출력하는 반복문 작성
		for (int i = 1; i <= 10; i++) {
			for (int j = i; j <=10; j++) {
				System.out.print(j+" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		// 10의 나머지로도 접근해보기 (나머지가 0이면 10출력 조건문 주기)
		
		System.out.println("------------------------------------------------------");
		
		// 풀이
		for (int i = 1; i<=10; i++) {
			for (int j = 0; j < 10; j++) {
				int num = i+j;
				
				if(num>10) {
					num-=10;
				}
				System.out.printf("%d ",num);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------");
		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		// 별찍기 트리~~
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j<=i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		for (int i = 1; i <=5; i++) {
			for (int j =1; j<=5-i; j++) {
				System.out.print(" ");
				System.out.print(" ");
				
			}
			for (int j =1; j<=i*2-1; j++) { // j 홀수개 찍기
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// 여기까지 하면 다이아몬드~~
//		for (int i = 1; i <=5; i++) {
//			for (int j = 1; j<=5-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j<=i*2-1 ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i =4; i>0; i--) {
//			for (int j =4; j>=i; j--) {
//				System.out.print(" ");
//			}
//			for (int j =1; j<=i*2-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	// 강사 풀이
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5+i; j++) {
				if(i+j>3) {
					System.out.print("* ");				
				}else {
					System.out.print("  ");
				}
			}//inner
			System.out.println();
		}//outer
		
	}//main

}
