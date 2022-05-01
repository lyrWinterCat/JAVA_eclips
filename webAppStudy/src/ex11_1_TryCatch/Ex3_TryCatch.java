package ex11_1_TryCatch;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		int res=0;
		int[] arr = new int[2];
		
		try {
//			res=10/0;
			res=10/2;
//			arr[2]=10;
			arr[1]=10;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 index로의 접근입니다.");
//		} catch(){
//			System.out.println("경로에 파일이 존재하지 않습니다.");
		} finally {
			// try영역에서 예외 발생 여부와 관계 없이
			// 마지막에 반드시 호출되는 영역
			System.out.println("마참내");
		}
		System.out.println(res);
		
	}//main

}
