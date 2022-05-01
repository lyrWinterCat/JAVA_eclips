package ex12_1_ArrayList;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(100);
		// add(index,값); 데이터를 추가하고 index 번호가 하나씩 밀림
		list.add(1,14);
		System.out.println(list);
		
		// list.set(index, element) >> 해당 인덱스의 인자값 변경
		list.set(2, 20);
		list.add(55); // 위에서부터 차례로 읽어오면서 추가
		list.remove(1); // 해당 인덱스의 값 삭제 . 뒤의 index값이 당겨짐
		
		list.removeAll(list); //리스트값 전부 삭제
		list.clear(); // 리스트값 전부 삭제
		
		System.out.println(list);
		
	}

}
