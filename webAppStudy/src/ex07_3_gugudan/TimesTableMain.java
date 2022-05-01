package ex07_3_gugudan;


import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TimesTable tt = new TimesTable();
		
		System.out.println("출력할 단을 입력 : ");
		int dan = sc.nextInt();
		tt.showTable(dan);
				
	}

}
