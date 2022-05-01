package ex11_1_TryCatch;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		int res=0;
		int [] arr = {10,20,30};
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println("arr["+i+"] = "+arr[i]);
			}
		} catch (Exception e) {
			System.out.println("3번 방은 없는 index입니다.");
		}
		System.out.println("프로그램 종료");
	}//main

}
