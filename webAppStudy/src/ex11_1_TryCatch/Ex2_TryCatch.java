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
			System.out.println("3�� ���� ���� index�Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}//main

}
