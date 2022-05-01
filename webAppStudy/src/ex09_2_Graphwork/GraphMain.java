package ex09_2_Graphwork;

import java.util.Random;

public class GraphMain {
	// 메인클래스를 만들어 0~9 사이의 난수를 100개 저장하는 배열을 만들고,
	// 해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해보자.
	
	// 단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.
	// 출력 예시
	// 0 : #####
	// 1 : #######
	public static void main(String[] args) {
		PrintGraph pg = new PrintGraph();
		
		int arNum[] = new int[10];
		for (int i = 0; i < 100; i++) {
//			arNum[i]=new Random().nextInt(10);
			int r = new Random().nextInt(10); 
			arNum[r]++; // 100개의 난수를 10칸짜리 배열에 저장. 최종 배열 값은 해당 index의 숫자가 몇번나왔는지 판별가능
		}
		pg.print(arNum);
		
		
	}//main
}
