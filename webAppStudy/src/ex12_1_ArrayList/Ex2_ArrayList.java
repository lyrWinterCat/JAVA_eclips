package ex12_1_ArrayList;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(100);
		// add(index,��); �����͸� �߰��ϰ� index ��ȣ�� �ϳ��� �и�
		list.add(1,14);
		System.out.println(list);
		
		// list.set(index, element) >> �ش� �ε����� ���ڰ� ����
		list.set(2, 20);
		list.add(55); // ���������� ���ʷ� �о���鼭 �߰�
		list.remove(1); // �ش� �ε����� �� ���� . ���� index���� �����
		
		list.removeAll(list); //����Ʈ�� ���� ����
		list.clear(); // ����Ʈ�� ���� ����
		
		System.out.println(list);
		
	}

}
