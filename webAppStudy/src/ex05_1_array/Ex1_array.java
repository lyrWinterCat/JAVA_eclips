package ex05_1_array;

public class Ex1_array {
	public static void main(String[] args) {
		// 배열(array) : 같은 자료형끼리 모아둔 하나의 묶음
		// 효울적인 관리를 위해서 반드시 필요하다.
		
		int su1=100;
		int su2=200;
		int su3=300;
		int su4=400;
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		System.out.println("---------------------------------");
		
		//1) 배열 선언
		int [] arr;
		
		//2) 배열 생성
		// 배열의 index 수의 개수는 처음 지정해 둔 갯수에서 강제로 늘리거나 줄일 수 없다.
		arr=new int[4];
		
		//3) 배열 초기화
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
//		arr[4]=500;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		// 배열이름.length : 배열 방의 개수
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
