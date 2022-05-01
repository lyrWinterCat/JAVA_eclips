package ex11_2_collection;

import java.util.HashMap;

public class Ex4_Map {
	public static void main(String[] args) {
		HashMap<String,Float> map = new HashMap<String,Float>();
		
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		//3.14값을 가져와보자
		System.out.println(map.get("k2"));
		
		float res = map.get("k2");
		System.out.println(res);
		
		// .containsKey(key값) : 해당 key값이 map안에 존재하는가? >>  true/false 반환
		if(map.containsKey("k3")) {
			System.out.println("k3이라는 key값이 존재합니다.");
		}
		
		// containsValue(value값) : 해당 value값이 map안에 존재하는가? >> true/false 반환
		if(map.containsValue(100f)) {
			System.out.println("100f라는 value값을 가지고 있습니다.");
		}
		
		
	}
	

}
