package ex04_1_break;

public class Ex1_break {
	public static void main(String[] args) {
		// break문 : 반복문 내에서 강제적으로 가장 가까운 반복문으로 빠져나갈 때 사용
		// 1) break문 밑에는 다른 문장이 올 수 없다.
		// 2) break문은 반복문 안에서만 사용할 수 있다.
		
		for(int i=1; i<=2; i++) {
			for (int j = 1; j <=5; j++) {
				if(j%2==0) {
					break;
				}
				System.out.print(j+" ");
			}//inner
			System.out.println();
		}//outer
		
	}//main

}
