package backjoon2798;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] cardN = sc.nextLine().split(" ");
		int n = Integer.parseInt(cardN[0]);
		int m = Integer.parseInt(cardN[1]);
		
		String [] cardL = sc.nextLine().split(" ");
		
		ArrayList<Integer> cards = new ArrayList<>();
		
		for (String num:cardL) {
			cards.add(Integer.parseInt(num));
		}
		
		int max=0;
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int k = j+1; k < n; k++) {
					int sum=cards.get(i)+cards.get(j)+cards.get(k);
					
					if(sum<=m) {
						max=Math.max(max, sum);
					}
					if(max==m) {
						System.out.println(max);
						return;
					}
					
				}
			}
		}
		
		System.out.println(max);
		
	}

}
