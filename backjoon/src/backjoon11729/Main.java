package backjoon11729;

import java.util.Scanner;

public class Main {
	/*
	 * N : 원판 갯수
	 * start:출발지
	 * move:이동해야 할 장소
	 * to : 목적지
	 */
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sb.append((int)(Math.pow(2, n)-1)).append("\n");
		Hanoi(n,1,2,3);
		System.out.println(sb);
	}
	
	
	public static void Hanoi(int N, int start, int move, int to) {
		if(N==1) {
			sb.append(start+" "+to+"\n");
			return;
		}
		Hanoi(N-1,start,to,move);
		sb.append(start+" "+to+"\n");
		Hanoi(N-1,move,start,to);
	}
}
