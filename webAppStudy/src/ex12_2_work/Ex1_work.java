package ex12_2_work;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// �ٷ� ���� ������� �ڵ忡�� �ߺ��� ���̵� �˻��ϴ�
		// ������ �߰��غ���
		
		// ���̵� ���� : abc
		// [abc]
		
		// ���̵� ���� : abc
		// �ߺ��� ���̵�
		
		// ���̵� ���� : abc2
		// [abc, abc2]
		
		// ���̵� ���� : abc3
		// [abc, abc2, abc3]
		
		ArrayList<String> arrid = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		outer : while(true) {
			System.out.print("���̵� ���� : ");
			String id = sc.next();
			
			// �� Ǯ��
//			if(!arrid.contains(id)) {
//				arrid.add(id);
//				System.out.println(arrid);
//			}else {
//				System.out.println("�ߺ��� ���̵�");
//			}
			
			// ���� Ǯ��
			for (int i = 0; i < arrid.size(); i++) {
				if(id.equals(arrid.get(i))){
					System.out.println("�ߺ��� ���̵�");
					continue outer;
				}
			}
			arrid.add(id);
			System.out.println(arrid);
			
			
			
		}
		
		
		
		
		
	}

}
