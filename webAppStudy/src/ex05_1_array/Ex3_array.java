package ex05_1_array;

public class Ex3_array {
	public static void main(String[] args) {
		
//		char[] cArr = new char[5];
//		cArr[0]='J';
//		cArr[1]='A';
//		cArr[2]='V';
//		cArr[3]='A';
//		cArr[4]='!';
//		// cArr[5]='!'; >> ���� ���
		
		char[] cArr= {'J','A','V','A','!'}; //����� ���ÿ� �ʱ�ȭ

		
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		System.out.println(cArr);
		
		String [] str = new String[3];
		str[0]="hello";
		
		System.out.println(str); //�ּҰ�~~
		
	}

}
