package ex05_1_array;

public class Ex2_array {
	public static void main(String[] args) {
		
		int [] iArr = new int[4];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i]=100*(i+1);
			System.out.println(iArr[i]);
		}
	}

}
