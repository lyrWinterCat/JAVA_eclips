package backjoon1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int line=0;
		int lastN=0;
		int top=0;
		int bottom=0;
		
		while(lastN<n) {
			line++;
			lastN=line*(line+1)/2;
		}
		
		if(line%2!=0) {
			top=1+lastN-n;
			bottom=line+n-lastN;
		}else {
			bottom = 1+lastN-n;
			top = line+n-lastN;
		}
		
		System.out.println(top+"/"+bottom);	
	}
}

/*
 * n�� ���° ���ΰ��������� �˸� ����... 
 * �и� : ���ι�°
 * ���� : ���ι�°
 *  
 * 
 * 1�� : n�� �޾Ƽ� n*(2n-1)�� ������ �������ų� n-1�� n*(2n-1)�� ������ ������ ���� ���ι�°, ���δ� 1(���ڴ� 1, ���δ� �������� ��)
 * 
 * 1  2  6  7  15 16 28 29 45 46 ( Ȧ�� : Ȧ��+1 / 1 6 15 28 45 ...1*1 2*3 3*5 4*7 5*9 =n*(2n-1)
 * 3  5  8  14 17 27 30 44 47 
 * 4  9  13 18 26 31 43 48 
 * 10 12 19 25 32 42 49
 * 11 20 24 33 41 50
 * 21 23 34 40 51
 * 22 35 39 52
	 * 36 38 53
 * 37 54
 * 55
 * 
 * 1���� ��Ģ
 * 
 * 
 * 1���� �밢�� ��������
 * (1) (23)(456)(789 10) (11 12 13 14 15)...
 * 1 	2	3	4		5	...
 * 1���� n��°�� n�� Ȧ���� ��� ���� ū ���� 1��
 * n�� ¦����°�� ��� �� ���� ���� ���� �� 
 * �밢�� ���� n+1�� ����
 */
