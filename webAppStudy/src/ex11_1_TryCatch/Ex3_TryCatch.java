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
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ʴ� index���� �����Դϴ�.");
//		} catch(){
//			System.out.println("��ο� ������ �������� �ʽ��ϴ�.");
		} finally {
			// try�������� ���� �߻� ���ο� ���� ����
			// �������� �ݵ�� ȣ��Ǵ� ����
			System.out.println("������");
		}
		System.out.println(res);
		
	}//main

}
