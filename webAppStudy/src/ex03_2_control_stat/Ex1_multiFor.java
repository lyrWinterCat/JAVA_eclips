package ex03_2_control_stat;

public class Ex1_multiFor {
	public static void main(String[] args) {
		// ���� for�� : for�� �ȿ� for���� ���ԵǾ��ִ� ���
		
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
			System.out.println(); // ln >> line. �ٹٲ�
		}
		
		// �ǽ�
		// A B C D
		// A B C D
		// A B C D 

		for (int i = 0; i < 3; i++) {
			for (int j = 65; j < 69; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		
		// �ٸ� ��� >> �ƿ� char�� �ݺ�������
		for (int i = 0; i < 3; i++) {
			for (char j = 'A'; j < 'E'; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		// �ǽ�
		// A B C D 	65 66 67 68
		// E F G H 	69 70 71 72
		// I J K L 	73 74 75 76
		
		for (int i = 65; i <77; i+=4) {
			for (int j = i; j < i+4; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		
		// ����Ǯ��
		char ch = 'A';
		for (int i = 0; i < 3; i++) { //y��
			for (int j = 0; j < 4; j++) { //x�� >> �̷��� �����ϸ� ����
				System.out.print(ch++ + " "); //��¹��� �� i�� j�� ���� �ʾƵ� ��!
			}
			System.out.println();
		}
		// i=0 >> j=0,1,2,3
		// i=1 >> j=0,1,2,3
		// ...�̷��� ��� �����غ��� �͵� ����
		
		// ����� �ǽ�
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
		
		// ���� Ǯ��
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5-(i+1);  j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		// ��������~~ Ʈ�����
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
		
		// ��������~~ ���̾Ƹ�� 
		// ��/�ϴ� ����� �����ϱ�
	
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
//	  *******
//	   *****
//	    ***
//	     *
		// ���1
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
		// ���2
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
