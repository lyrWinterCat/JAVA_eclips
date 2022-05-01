package ex11_2_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex2_Set {
	public static void main(String[] args) {
		// HashSet�� �̿��Ͽ� 5 * 5�� ���� ������ �����
		HashSet<Integer> set = new HashSet<Integer>();
		int [][] board = new int[5][5];
		
//		for (int i = 0; set.size()<25; i++) {
		for (;set.size()<25;) {  // for(; ���ѹݺ��ڵ� ;)
			set.add(new Random().nextInt(50)+1);
		}
		
		Iterator<Integer> it = set.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (Integer)it.next();
				System.out.printf("%02d ",board[i][j]);
			}
			System.out.println();
		}
		
		
	}//main

}
