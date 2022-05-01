package ex01_1_casting;

public class Ex_demotion {
	public static void main(String[] args) {
		// 디모션(demotion) : 큰 자료형에서 작은 자료형으로 대입을 한다.
		
		float f1 = 5.5f; // 4.xxbyte
		int num = 0; // 4byte
		
		num = (int)f1; //강제형변환 , 0.5 상실
		System.out.println("num = "+num);
		
		System.out.println("----------------------------");
		
		char c = 'B'; //2byte
		int n = c+1; //4byte >> promotion. 자동형변환
		System.out.println("n = "+n);
		
		c = (char)n;
		System.out.println("c = "+c);
		
		
		
		
		
	}//main
}
