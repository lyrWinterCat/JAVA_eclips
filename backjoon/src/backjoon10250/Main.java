package backjoon10250;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		
		for (int i = 0; i < test; i++) {
			int floor=sc.nextInt();
			int room=sc.nextInt();
			int guest=sc.nextInt();
			int gFloor=0;
			int ho=0;
			
			int cnt=1;
			int wguest=guest;
			int wfloor=floor;
			while((wguest-wfloor)>wfloor) {
				cnt++;
				wguest-=wfloor;	
			}
			
			if(guest-(floor*cnt)==0) {
				gFloor=floor;
			}else {
				gFloor=guest-(floor*cnt);				
			}
			ho=cnt+1;
			String sHo=String.format("%02d", ho);			
			
			System.out.println(""+gFloor+sHo);
		}		
	}
}
