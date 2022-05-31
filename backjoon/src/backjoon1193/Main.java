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
 * n이 몇번째 세로가로줄인지 알면 가능... 
 * 분모 : 가로번째
 * 분자 : 세로번째
 *  
 * 
 * 1행 : n을 받아서 n*(2n-1)로 나누어 떨어지거나 n-1을 n*(2n-1)로 나누어 떨어진 값이 가로번째, 세로는 1(분자는 1, 가로는 나누어진 몫)
 * 
 * 1  2  6  7  15 16 28 29 45 46 ( 홀수 : 홀수+1 / 1 6 15 28 45 ...1*1 2*3 3*5 4*7 5*9 =n*(2n-1)
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
 * 1행의 규칙
 * 
 * 
 * 1행의 대각선 기준으로
 * (1) (23)(456)(789 10) (11 12 13 14 15)...
 * 1 	2	3	4		5	...
 * 1행의 n번째가 n이 홀수인 경우 가장 큰 수가 1행
 * n이 짝수번째인 경우 맨 위가 가장 작은 수 
 * 대각선 수는 n+1씩 증가
 */
