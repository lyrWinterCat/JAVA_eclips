package ex04_1_break;

public class Ex3_label_break {
	public static void main(String[] args) {
		//label : Ư�� �ݺ����� �̸�ǥ�� �ٿ� �� �� �̻��� �ݺ�����
		//		 ������ �� �ֵ��� �ϴ� Ű����
		// label�� �׻� ������ �����Ѵ�.
		// label�� �̸��� �ڱⰡ ���ϴ� ��� ����� �����ϴ�.
		
		// label�� �ڽ��� �����ϰ� �ִ� ���� ���信�Ը� �� �� �ִ�.
		
		out: for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=10; j++) {
				if(j%2==0) {
					break out;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	// �̷��� ����ϴ� ���� �Ұ���
	// ���� ���� ������ label�� �����ؾ���
//	for (int i = 1; i <=3; i++) {
//		happy : for(int k = 1; k<=10; k++) {
//			System.out.print(k+" ");
//		}
//		for (int j = 1; j <=10; j++) {
//			if(j%2==0) {
//				break happy;
//			}
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
	// �ٱ� for (���⿡ label�� �ִٸ� �������� �� ����)
	// 		�� for (���⿡ label�� �ް� �Ǹ� >>�����ϰ� �ִ� ������ �ƴ�. (���� for���� �������ͼ� ����� ���ڴ�?? >>���� X)
	// 		�� for //break , label (���� �޸� ���� ���������ڴ�!) >> ������ ������ ���� �������θ� �� �� �ִ�.
		
	}//main

}
