package backjoon2562;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		// ÃÖ´ñ°ª Á¤´ä~~
		int arnum[] = new int [9];
		for (int i = 0; i < arnum.length; i++) {
			arnum[i]=sc.nextInt();
		}

		int maxnum[] = new int[9];		
		for (int i = 0; i < maxnum.length; i++) {
			maxnum[i]=arnum[i];
		}
		Arrays.sort(maxnum);
		int maxNum = maxnum[maxnum.length-1];
		
		int index=0;
		for (int i = 0; i < arnum.length; i++) {
			if(maxNum==arnum[i]) {
				index=i;
			}
		}
		System.out.println(maxNum+"\n"+(index+1));
	}

}
