package ex11_2_collection;

import java.util.HashMap;

public class Ex3_Map {
	// Map : 키(Key)와 값(Value)을 묶어서 하나의 데이터로 저장을 하는 특징을 갖고 있음
	public static void main(String[] args) {
		
		// Map의 구조 : Key값과 Value가 하나의 쌍을 이루어 저장이 된다.
		// 대량의 데이터를 처리하는 데 유용함
		HashMap<Integer,Character> map = new HashMap<Integer,Character>();
		
		// map의 값 입력 : put
		map.put(1,'A');
		map.put(2,'B');
		map.put(3,'C');
		map.put(4,'A'); // map에서 저장되는 value값은 중복이 될 수 있음
		map.put(1, 'F'); // 단, map의 key값은 절대 중복이 될 수 없음 >> 값 갱신
		
		// map의 key값은 중복이 될 수 없으며
		// 기존에 같은 이름을 가진 key값이 있다면 해당 value 값이 갱신된다.
		
		System.out.println(map); // 값이 {key=value} 이런 형식으로 나옴
		
		// key값이 중복될 경우 추가가 되는 것이 아니라 해당 값의 value를 변경하게 됨
		System.out.println("map의 사이즈 : "+map.size()); //해당 map의 길이
		
		HashMap<String,Boolean> map1 = new HashMap<String,Boolean>();
		map1.put("k1", true);
		map1.put("k2", true);
		map1.put("k2", false);
		
		// map의 값 출력 : get(키) >> value 
		// key값을 통해서 데이터(value)값을 찾음
		// 따라서 get으로 호출을 할때 해당 값을 변수에 담으려면
		// value값에 맞는 형태의 변수에 담아주어야 함
		
		boolean b1 = map1.get("k1");
		System.out.println("b1: "+b1);
		boolean b2 = map1.get("k2");
		System.out.println("b2: "+b2); // k2의 변경된 값 false 출력
		
		System.out.println("-----------------------------------");
		
		HashMap<String,String> map2 = new HashMap<String, String>();
		map2.put("s1", "나의 key는 s1");
		map2.put("s2", "나의 key는 s2");
		map2.put("s3", "나의 key는 s3");
		
		String str1 = map2.get("s1");
		System.out.println("str1 : "+str1);
		String str2 = map2.get("s2");
		System.out.println("str2 : "+str2);
		String str3 = map2.get("s3");
		System.out.println("str3 : "+str3);
		
		// key값을 통해서 데이터(value)를 제거
		map2.remove("s1");
		System.out.println(map2);
		
		// map은 .size()를 통해서 크기를 알 수 있다.
		System.out.println(map2.size()); // 사이즈가 줄었다고 해서 뒤의 인자가 앞으로 당겨졌다거나 그런 개념이 아님
		
		// map의 특징
		// Map의 구조는 key값으로 Value값을 찾기 때문에
		// 배열처럼 메모리 공간에 순차적으로 자리를 잡고 있지 않는다.
		// 때문에 for문 등을 이용하여 값을 얻을 수 없음!
		
		// Map 구조의 내용을 순차적으로 얻어오기 위해서는
		// iterator라고 하는 반복자를 이용해야 함
		
		// 내일진도 > map에서 key 호출하기 , iterator
		
		// key값 호출 : map.keySet() >> key모아서 Set으로 반환
		// Set<key형태> keySet = map.keySet();
		
		// value값 호출 : map.get(key)
		// map.values() >> public Collection <V> values();
		
		// 둘 다 호출 : map.entrySet().iterator();
		// 혹은 forEach ( java8 이후)
		
		
	}//main
	

}
