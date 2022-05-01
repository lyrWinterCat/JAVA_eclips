package ex11_2_collection;

import java.util.HashMap;

public class Ex3_Map {
	// Map : Ű(Key)�� ��(Value)�� ��� �ϳ��� �����ͷ� ������ �ϴ� Ư¡�� ���� ����
	public static void main(String[] args) {
		
		// Map�� ���� : Key���� Value�� �ϳ��� ���� �̷�� ������ �ȴ�.
		// �뷮�� �����͸� ó���ϴ� �� ������
		HashMap<Integer,Character> map = new HashMap<Integer,Character>();
		
		// map�� �� �Է� : put
		map.put(1,'A');
		map.put(2,'B');
		map.put(3,'C');
		map.put(4,'A'); // map���� ����Ǵ� value���� �ߺ��� �� �� ����
		map.put(1, 'F'); // ��, map�� key���� ���� �ߺ��� �� �� ���� >> �� ����
		
		// map�� key���� �ߺ��� �� �� ������
		// ������ ���� �̸��� ���� key���� �ִٸ� �ش� value ���� ���ŵȴ�.
		
		System.out.println(map); // ���� {key=value} �̷� �������� ����
		
		// key���� �ߺ��� ��� �߰��� �Ǵ� ���� �ƴ϶� �ش� ���� value�� �����ϰ� ��
		System.out.println("map�� ������ : "+map.size()); //�ش� map�� ����
		
		HashMap<String,Boolean> map1 = new HashMap<String,Boolean>();
		map1.put("k1", true);
		map1.put("k2", true);
		map1.put("k2", false);
		
		// map�� �� ��� : get(Ű) >> value 
		// key���� ���ؼ� ������(value)���� ã��
		// ���� get���� ȣ���� �Ҷ� �ش� ���� ������ ��������
		// value���� �´� ������ ������ ����־�� ��
		
		boolean b1 = map1.get("k1");
		System.out.println("b1: "+b1);
		boolean b2 = map1.get("k2");
		System.out.println("b2: "+b2); // k2�� ����� �� false ���
		
		System.out.println("-----------------------------------");
		
		HashMap<String,String> map2 = new HashMap<String, String>();
		map2.put("s1", "���� key�� s1");
		map2.put("s2", "���� key�� s2");
		map2.put("s3", "���� key�� s3");
		
		String str1 = map2.get("s1");
		System.out.println("str1 : "+str1);
		String str2 = map2.get("s2");
		System.out.println("str2 : "+str2);
		String str3 = map2.get("s3");
		System.out.println("str3 : "+str3);
		
		// key���� ���ؼ� ������(value)�� ����
		map2.remove("s1");
		System.out.println(map2);
		
		// map�� .size()�� ���ؼ� ũ�⸦ �� �� �ִ�.
		System.out.println(map2.size()); // ����� �پ��ٰ� �ؼ� ���� ���ڰ� ������ ������ٰų� �׷� ������ �ƴ�
		
		// map�� Ư¡
		// Map�� ������ key������ Value���� ã�� ������
		// �迭ó�� �޸� ������ ���������� �ڸ��� ��� ���� �ʴ´�.
		// ������ for�� ���� �̿��Ͽ� ���� ���� �� ����!
		
		// Map ������ ������ ���������� ������ ���ؼ���
		// iterator��� �ϴ� �ݺ��ڸ� �̿��ؾ� ��
		
		// �������� > map���� key ȣ���ϱ� , iterator
		
		// key�� ȣ�� : map.keySet() >> key��Ƽ� Set���� ��ȯ
		// Set<key����> keySet = map.keySet();
		
		// value�� ȣ�� : map.get(key)
		// map.values() >> public Collection <V> values();
		
		// �� �� ȣ�� : map.entrySet().iterator();
		// Ȥ�� forEach ( java8 ����)
		
		
	}//main
	

}
