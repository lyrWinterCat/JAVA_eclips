package ex05_2_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		// ������ : 1���� �迭�� �� �� �������� 2���� �迭
		// 		: 1���� �迭�� �� �� �������� 3���� �迭
		
		int [][] test = new int[2][3];
		//					ū��(��,Y) ������(��,X)	
		
		test[0][0]=100;
		test[0][1]=200;
		test[0][2]=300;
		test[1][0]=400;
		test[1][1]=500;
		test[1][2]=600;
		//test[0][3]=400; >> �濡 ���缭 ���� �־��־�� ��
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
		String[][] java = {{"����","java:90","android:100"},{"ö��","java:100","android:80"}}; //[2][3]
		// String[2][3] �̶� ���� ������ �迭
		for (int i = 0; i < java.length; i++) {
			for (int j = 0; j < java[i].length; j++) {
				System.out.print(java[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		// �ǽ�����~~
		// 4x4 ĭ
		// ABCD/EFGH/IJKL/MNOP ��µǴ�
		// �迭 �����
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
		
		// ���� Ǯ��
		String [][] str = new String[4][4];
		char ch='A';
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j]=""+ch++; // ���� String ����ȯ~
				System.out.print(str[i][j]+" ");
			}			
			System.out.println();
		}
		
		
	}//main

}
