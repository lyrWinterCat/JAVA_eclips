package backjoon1712;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fCost=sc.nextInt();
		int vCost=sc.nextInt();
		int price=sc.nextInt();
		
		if(price-vCost==0) {
			System.out.println(-1);
		}else {
			int bPoint=(int) Math.ceil(fCost/(price-vCost));
			if(bPoint<0) {
				System.out.println(-1);
			}else {
				System.out.println(bPoint+1);
			}	
			
		}	

	}
}
