package ex05_2_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		// 2���� �迭���ʹ� ���� ũ�Ⱑ �ٸ� �� �ִ�.
		int [][] arr = {{10,20},
				{30,40,50},
				{60}
		};
		// �ݺ��� ����ؼ� ����غ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");				
			}
			System.out.println();
		}
		
		//2�����迭�� ���  index�� �ش��ϴ� ���� ���� �� ���� ���ϰ�
		// ���� ����� ���Ͻÿ� ����� float���� �ް� �Ҽ��� �Ʒ� ���ڸ������� �޴´�.
		 int arr2[][] = {{20,54,12},
							{18,84},
							{32,90,47},
							{26,49,85,29}
						};
		 int sum=0;
		 int indexcnt=0;
		 float avg=0;
		 for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum+=arr2[i][j];
				indexcnt++;
			}
		}
		avg=(float)sum/indexcnt;
		 
		System.out.printf("�� �� : %d \n��� : %.2f",sum,avg);
		
		
	}//main
	

}
