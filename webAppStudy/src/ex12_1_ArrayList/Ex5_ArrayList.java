package ex12_1_ArrayList;

import java.util.ArrayList;

public class Ex5_ArrayList {
	public static void main(String[] args) {
		ArrayList<Ex4_ArrayFriend> list = new ArrayList<Ex4_ArrayFriend>();
		// ���ʸ�Ÿ�Կ� Ŭ������ ��°�� �ִ� ���� ����
		
		Ex4_ArrayFriend f1 = new Ex4_ArrayFriend();
		f1.name="ȫ�浿";
		f1.age=20;
		f1.bt='A';
		
		Ex4_ArrayFriend f2 = new Ex4_ArrayFriend();
		f2.name="��浿";
		f2.age=23;
		f2.bt = 'B';
		
		list.add(f1); // list�� 0����� f1�� ������ �ּҸ� ������
		list.add(f2); // list�� 1����� f2�� ������ �ּҸ� ������
		
//		System.out.println(list.get(0).name);
//		System.out.println(list.get(0).age);
//		System.out.println(list.get(0).bt);
//		
//		System.out.println(list.get(1).name);
//		System.out.println(list.get(1).age);
//		System.out.println(list.get(1).bt);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
			System.out.println(list.get(i).age);
			System.out.println(list.get(i).bt);
			
		}
		
		
	}

}
