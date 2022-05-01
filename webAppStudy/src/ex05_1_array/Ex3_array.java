package ex05_1_array;

public class Ex3_array {
	public static void main(String[] args) {
		
//		char[] cArr = new char[5];
//		cArr[0]='J';
//		cArr[1]='A';
//		cArr[2]='V';
//		cArr[3]='A';
//		cArr[4]='!';
//		// cArr[5]='!'; >> 범위 벗어남
		
		char[] cArr= {'J','A','V','A','!'}; //선언과 동시에 초기화

		
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		System.out.println(cArr);
		
		String [] str = new String[3];
		str[0]="hello";
		
		System.out.println(str); //주소값~~
		
	}

}
