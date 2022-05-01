package ex11_2_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex1_Set {
	public static void main(String[] args) {
		// �÷���(collection) : java.util ��Ű�� �ȿ� �ִ� �������̽�
		// �迭�� ������ �����Ͽ� index ������ �������� ���� �ټ��� ��ü��
		// �ٷ�� ���Ͽ� ����ϴ� ���α׷��� ���
		
		// Set Map List
		
		//<���ʸ� Ÿ��> : ������ Set ��ü���� �����ϰ��� �ϴ� �ڷ����� Ÿ���� �̸� �����صδ� ����
		// �ݵ�� Ŭ���� ���·θ� ���� ����
		HashSet<String> hs1 = new HashSet<>(); // ���� <> ���ʸ��� ��������
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		System.out.println(hs1); // a b d f >> a-z, ���ڸ��� ���� ������ �ڵ�����
		
		// set���� �ߺ��� �����͸� �߰��� �� ����.
		hs1.add("a");
		hs1.add("b");
		System.out.println(hs1); 
		
		// .remove("���� ������") : set�� ����Ǿ��ִ� ������ ����
		hs1.remove("a");
		System.out.println(hs1); 
		
		//set��.removeAll(set��) : set�� �ִ� ��� ������ ����
		// set��.clear()
//		hs1.removeAll(hs1);
		hs1.clear();
		System.out.println(hs1);
		
		System.out.println("--------------------------------");
		//Set���� �ζǹ�ȣ �����
		HashSet<Integer> hs2 = new HashSet<Integer>();
		while(true) {
			int r = new Random().nextInt(45)+1;
			hs2.add(r);
			if(hs2.size()==6) { // hashset�̸�.size() : set ��ü�� �� ����
				break;
			}
		}
		// �迭ó�� index��ȣ�� ���� ������ �ϳ��� ��� ���� �����ϰų� ���� �� ����
		System.out.println(hs2);
		
		//Set->�迭 ��ȯ��
		// new Integer[0] << �迭�� �� ������ 0���� ������ set�� add �صξ��� �� ������ŭ
		// �ڵ����� �迭�� index�� ������ ��
		Integer[] arr = hs2.toArray(new Integer[0]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}//main
	

}
