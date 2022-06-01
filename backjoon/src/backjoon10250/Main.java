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
			
			int gFloor;
			if(guest%floor==0) {
				gFloor=floor*100;
			}else {
				gFloor=guest%floor*100;				
			}
			
			int ho;
			if(guest%floor==0) {
				ho=guest/floor;
			}else {
				ho=(guest/floor)+1;				
			}
			System.out.println(gFloor+ho);
		}
		
	}
}
