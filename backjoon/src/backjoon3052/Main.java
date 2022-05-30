package backjoon3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		// 나머지 개수
		int num[] = new int[10];
		int numDiv[] = new int[10];
		int result[] = new int[42];
		int cnt=0;
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) { // numDiv에 num%42 저장 
			numDiv[i]=num[i]%42;
			result[numDiv[i]]++;
		}
		
		// 중복값 찾아볼까...^^...
		// result[] 안에 0이 아닌값의 개수 구하기.... >> result 총 배열 길이 - 0의 개수
		// 아니면 이중for문으로 돌려서 중복값이 나오면 cnt++ 하고 result배열길이 - 중복개수...........
				
		for (int i = 0; i < result.length; i++) {
			if(result[i]>=1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
