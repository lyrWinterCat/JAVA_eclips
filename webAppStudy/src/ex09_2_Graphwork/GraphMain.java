package ex09_2_Graphwork;

import java.util.Random;

public class GraphMain {
	// ����Ŭ������ ����� 0~9 ������ ������ 100�� �����ϴ� �迭�� �����,
	// �ش� �迭�� ������ �ִ� �� ���� ������ �Ǻ��Ͽ� �׷���ȭ �غ���.
	
	// ��, �߻��� ������ �׷���ȭ �۾��� PrintGraphŬ������ �ϵ��� �Ѵ�.
	// ��� ����
	// 0 : #####
	// 1 : #######
	public static void main(String[] args) {
		PrintGraph pg = new PrintGraph();
		
		int arNum[] = new int[10];
		for (int i = 0; i < 100; i++) {
//			arNum[i]=new Random().nextInt(10);
			int r = new Random().nextInt(10); 
			arNum[r]++; // 100���� ������ 10ĭ¥�� �迭�� ����. ���� �迭 ���� �ش� index�� ���ڰ� ������Դ��� �Ǻ�����
		}
		pg.print(arNum);
		
		
	}//main
}
