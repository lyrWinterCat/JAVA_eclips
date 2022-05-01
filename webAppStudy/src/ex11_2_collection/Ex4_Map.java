package ex11_2_collection;

import java.util.HashMap;

public class Ex4_Map {
	public static void main(String[] args) {
		HashMap<String,Float> map = new HashMap<String,Float>();
		
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		//3.14���� �����ͺ���
		System.out.println(map.get("k2"));
		
		float res = map.get("k2");
		System.out.println(res);
		
		// .containsKey(key��) : �ش� key���� map�ȿ� �����ϴ°�? >>  true/false ��ȯ
		if(map.containsKey("k3")) {
			System.out.println("k3�̶�� key���� �����մϴ�.");
		}
		
		// containsValue(value��) : �ش� value���� map�ȿ� �����ϴ°�? >> true/false ��ȯ
		if(map.containsValue(100f)) {
			System.out.println("100f��� value���� ������ �ֽ��ϴ�.");
		}
		
		
	}
	

}
