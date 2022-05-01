package ex09_2_Graphwork;

public class PrintGraph {
	
	public void print(int[] arr) { //메서드 파라미터로 배열도 가능!
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+"의 개수 : ");
		for (int j = 0; j < arr[i]; j++) { //그래프화
			System.out.print('#');
		}
			System.out.println(" "+arr[i]);
		}
	}
	

}
