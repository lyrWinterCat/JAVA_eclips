package ex04_2_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		int n = 0;
		while(n<10) {
			n++;
			if(n%2==0) {
				//while������ continue�� ������ ���ǽ����� �̵�
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
				System.out.println("switch�� 1�� ���İ�");
				// switch������ break�� �ݺ����� ������ �� �ƴ� switch���� ������ �ȴ�.
				break w; //label �ޱ� >>�ݺ������� ������ �� �� �ִ�! 
			case 2:
				System.out.println("switch�� 2�� ���İ�");
				// switch���� �ܵ����� ����� �� ���� continue�� ����� �� ����.
				continue;
			
			}//switch
			System.out.println(n);
		}//while
		
	}//main

}
