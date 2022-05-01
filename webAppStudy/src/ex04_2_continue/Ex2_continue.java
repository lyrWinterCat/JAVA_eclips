package ex04_2_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		int n = 0;
		while(n<10) {
			n++;
			if(n%2==0) {
				//while문에서 continue를 만나면 조건식으로 이동
				continue;
			}//if
			System.out.println(n);
		}//while
		
		System.out.println("----------------------------------------------------");
		n=0;
		w:while(n<10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch문 1번 거쳐감");
				// switch문에서 break는 반복문을 나가는 게 아닌 switch문만 나가게 된다.
				break w; //label 달기 >>반복문에도 영향을 줄 수 있다! 
			case 2:
				System.out.println("switch문 2번 거쳐감");
				// switch문만 단독으로 사용을 할 때는 continue를 사용할 수 없다.
				continue;
			
			}//switch
			System.out.println(n);
		}//while
		
	}//main

}
