package ex09_2_Graphwork;

public class PrintGraph {
	
	public void print(int[] arr) { //�޼��� �Ķ���ͷ� �迭�� ����!
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+"�� ���� : ");
		for (int j = 0; j < arr[i]; j++) { //�׷���ȭ
			System.out.print('#');
		}
			System.out.println(" "+arr[i]);
		}
	}
	

}
