package ex05_1_array;

public class Ex1_array {
	public static void main(String[] args) {
		// �迭(array) : ���� �ڷ������� ��Ƶ� �ϳ��� ����
		// ȿ������ ������ ���ؼ� �ݵ�� �ʿ��ϴ�.
		
		int su1=100;
		int su2=200;
		int su3=300;
		int su4=400;
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		System.out.println("---------------------------------");
		
		//1) �迭 ����
		int [] arr;
		
		//2) �迭 ����
		// �迭�� index ���� ������ ó�� ������ �� �������� ������ �ø��ų� ���� �� ����.
		arr=new int[4];
		
		//3) �迭 �ʱ�ȭ
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
//		arr[4]=500;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		// �迭�̸�.length : �迭 ���� ����
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
