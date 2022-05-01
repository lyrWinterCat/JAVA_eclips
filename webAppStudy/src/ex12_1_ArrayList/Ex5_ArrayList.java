package ex12_1_ArrayList;

import java.util.ArrayList;

public class Ex5_ArrayList {
	public static void main(String[] args) {
		ArrayList<Ex4_ArrayFriend> list = new ArrayList<Ex4_ArrayFriend>();
		// 제너릭타입에 클래스를 통째로 넣는 것이 목적
		
		Ex4_ArrayFriend f1 = new Ex4_ArrayFriend();
		f1.name="홍길동";
		f1.age=20;
		f1.bt='A';
		
		Ex4_ArrayFriend f2 = new Ex4_ArrayFriend();
		f2.name="김길동";
		f2.age=23;
		f2.bt = 'B';
		
		list.add(f1); // list의 0번방과 f1의 영역이 주소를 공유함
		list.add(f2); // list의 1번방과 f2의 영역이 주소를 공유함
		
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
