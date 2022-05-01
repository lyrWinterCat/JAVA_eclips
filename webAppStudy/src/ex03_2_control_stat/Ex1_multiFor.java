package ex03_2_control_stat;

public class Ex1_multiFor {
	public static void main(String[] args) {
		// 다중 for문 : for문 안에 for문이 포함되어있는 경우
		
		//for(){
		//	for(){
		//	} //inner for
		//}//outter for
		
		// 1 2
		// 1 2
		
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j < 3; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // ln >> line. 줄바꿈
		}
		
		// 실습
		// A B C D
		// A B C D
		// A B C D 

		for (int i = 0; i < 3; i++) {
			for (int j = 65; j < 69; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		
		// 다른 방법 >> 아예 char로 반복돌리기
		for (int i = 0; i < 3; i++) {
			for (char j = 'A'; j < 'E'; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		// 실습
		// A B C D 	65 66 67 68
		// E F G H 	69 70 71 72
		// I J K L 	73 74 75 76
		
		for (int i = 65; i <77; i+=4) {
			for (int j = i; j < i+4; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		
		// 강사풀이
		char ch = 'A';
		for (int i = 0; i < 3; i++) { //y축
			for (int j = 0; j < 4; j++) { //x축 >> 이렇게 생각하면 편함
				System.out.print(ch++ + " "); //출력문에 꼭 i나 j를 쓰지 않아도 됨!
			}
			System.out.println();
		}
		// i=0 >> j=0,1,2,3
		// i=1 >> j=0,1,2,3
		// ...이렇게 적어서 이해해보는 것도 좋음
		
		// 별찍기 실습
		// *
		// * *
		// * * *
		// * * * * 
		// * * * * *
		char star = '*';
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(star+" ");
			}
			System.out.println();
		}
		
		//         *
		//       * *
		//     * * *
		//   * * * *
		// * * * * *
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >i; j--) {
				System.out.print(' ');
				System.out.print(' ');
			}
			for (int j = 0; j <=i; j++) {
				System.out.print(' ');
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 강사 풀이
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5-(i+1);  j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		// 별찍기놀이~~ 트리모양
		//     *  
		//    * * 
		//   * * *
		//  * * * *
		// * * * * *
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >i; j--) {
				System.out.print(' ');
			}
			for (int j = 0; j <=i; j++) {
				System.out.print(' ');
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 별찍기놀이~~ 다이아몬드 
		// 상/하단 나누어서 생각하기
	
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
//	  *******
//	   *****
//	    ***
//	     *
		// 방법1
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=5-i; j++) {
				System.out.print("*");
			}
			for (int j = 3; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 방법2
		for (int i = 1; i <=5; i++) {
			for (int j =1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for (int j =1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =4; i>0; i--) {
			for (int j =4; j>=i; j--) {
				System.out.print(" ");
			}
			for (int j =1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}




		
		
	
		
		
		
	}//main

}
