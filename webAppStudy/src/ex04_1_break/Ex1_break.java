package ex04_1_break;

public class Ex1_break {
	public static void main(String[] args) {
		// break�� : �ݺ��� ������ ���������� ���� ����� �ݺ������� �������� �� ���
		// 1) break�� �ؿ��� �ٸ� ������ �� �� ����.
		// 2) break���� �ݺ��� �ȿ����� ����� �� �ִ�.
		
		for(int i=1; i<=2; i++) {
			for (int j = 1; j <=5; j++) {
				if(j%2==0) {
					break;
				}
				System.out.print(j+" ");
			}//inner
			System.out.println();
		}//outer
		
	}//main

}
