package backjoon1152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
//		sc.nextLine();
		if(sentence.equals(" ")) {
			System.out.println(0);
		} else {
			sentence=sentence.trim();
			String[] space_Div = sentence.split(" ");
			System.out.println(space_Div.length);
			
		}
	}
}
