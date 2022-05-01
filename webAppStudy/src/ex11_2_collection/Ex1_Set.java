package ex11_2_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex1_Set {
	public static void main(String[] args) {
		// 컬렉션(collection) : java.util 패키지 안에 있는 인터페이스
		// 배열의 단점을 보완하여 index 개수가 정해지지 않은 다수의 객체를
		// 다루기 위하여 사용하는 프로그래밍 방식
		
		// Set Map List
		
		//<제너릭 타입> : 앞으로 Set 객체에서 관리하고자 하는 자료형의 타입을 미리 지정해두는 구조
		// 반드시 클래스 형태로만 기입 가능
		HashSet<String> hs1 = new HashSet<>(); // 뒤의 <> 제너릭은 생략가능
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		System.out.println(hs1); // a b d f >> a-z, 한자릿수 숫자 정도는 자동정렬
		
		// set에는 중복된 데이터를 추가할 수 없다.
		hs1.add("a");
		hs1.add("b");
		System.out.println(hs1); 
		
		// .remove("지울 데이터") : set에 저장되어있는 데이터 제거
		hs1.remove("a");
		System.out.println(hs1); 
		
		//set명.removeAll(set명) : set에 있는 모든 데이터 제거
		// set명.clear()
//		hs1.removeAll(hs1);
		hs1.clear();
		System.out.println(hs1);
		
		System.out.println("--------------------------------");
		//Set으로 로또번호 만들기
		HashSet<Integer> hs2 = new HashSet<Integer>();
		while(true) {
			int r = new Random().nextInt(45)+1;
			hs2.add(r);
			if(hs2.size()==6) { // hashset이름.size() : set 객체의 방 개수
				break;
			}
		}
		// 배열처럼 index번호가 없기 때문에 하나를 골라서 값을 변경하거나 지울 수 없다
		System.out.println(hs2);
		
		//Set->배열 변환법
		// new Integer[0] << 배열의 방 개수를 0으로 잡으면 set이 add 해두었던 방 개수만큼
		// 자동으로 배열의 index가 생성이 됨
		Integer[] arr = hs2.toArray(new Integer[0]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}//main
	

}
