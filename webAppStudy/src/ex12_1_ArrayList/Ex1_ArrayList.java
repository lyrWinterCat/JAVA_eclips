package ex12_1_ArrayList;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		// ArrayList : index ���� ���� ���� �߰��ϰų� �����ϴ� �뵵�� Ŭ����
		// �ߺ��� ���� �������� �ʰ� �߰�
		// index ��ȣ�� ������ ���� *���� �߿��� Ư¡!
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(100); // �ߺ��� ���
		list.add(20);
		System.out.println("list�� ũ�� : "+list.size());
		System.out.println(list);
		
		// 20�̶�� �� �������� >> index�� ����
		int res = list.get(2);
		System.out.println(res);
		
		// for���� ����Ͽ� list�� ���� ��� index�� �����ϱ�
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		// ������ for�� (������ roop) 
		// �����ϱ� �ѵ� Ư�� index�� �����ϱⰡ �����.
		// �迭, list�� ���� �������� index ������ �ڵ����� �����ϱ� ������ ������ ����ϴ� ���� ��������
		
		// index�� �������� ������ �Ұ����ϱ⶧���� Ư�� index�� ���� �����̳� ��� �Ұ�����
		for(int i:list) {
			System.out.print(i+" ");
		}
		
	}

}
