package ex05_2_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		// 2차원 배열부터는 방의 크기가 다를 수 있다.
		int [][] arr = {{10,20},
				{30,40,50},
				{60}
		};
		// 반복문 사용해서 출력해보기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");				
			}
			System.out.println();
		}
		
		//2차원배열의 모든  index가 해당하는 값을 더한 총 합을 구하고
		// 값의 평균을 구하시오 평균은 float으로 받고 소숫점 아래 두자리까지만 받는다.
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
		 
		System.out.printf("총 합 : %d \n평균 : %.2f",sum,avg);
		
		
	}//main
	

}
