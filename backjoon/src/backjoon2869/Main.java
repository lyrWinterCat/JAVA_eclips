package backjoon2869;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long up, down, hight;
		up=sc.nextInt();
		down=sc.nextInt();
		hight=sc.nextInt();
		

		long day=(hight-down)/(up-down);
		
		if((hight-up)%(up-down)!=0) {
			day++;
		}
		System.out.println(day);
	}
}
