package backjoon10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 10809 ¾ËÆÄºªÃ£±â
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int [] arAlpa = new int[26];
		for (int i = 0; i < arAlpa.length; i++) {
			arAlpa[i]=-1;
		}
		for (int i = 0; i < s.length(); i++) {
			int location = (int)s.charAt(i)-(int)'a';
			if(arAlpa[location]==-1) {
				arAlpa[location]=i;
			}
		}
		
		for (int i = 0; i < arAlpa.length; i++) {
			System.out.print(arAlpa[i]+" ");
		}
	}

}
