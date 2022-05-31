package backjoon2869;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int up, down, hight;
		up=sc.nextInt();
		down=sc.nextInt();
		hight=sc.nextInt();
		
		int day;
//		day=(int) Math.floor((float)(hight/(up-down)));
		
		day=(int) Math.floor((float)(hight-up)/(up-down))+1;
		
		if((hight-up)>(up-down)) {
			System.out.println(day);
		}else {
			System.out.println(day+1);
		}

		
		
	}

}
