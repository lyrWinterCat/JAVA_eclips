package ex12_1_ArrayList;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		// ArrayList : index 제한 없이 값을 추가하거나 제거하는 용도의 클래스
		// 중복된 값을 무시하지 않고 추가
		// index 번호를 가지고 있음 *가장 중요한 특징!
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(100); // 중복값 허용
		list.add(20);
		System.out.println("list의 크기 : "+list.size());
		System.out.println(list);
		
		// 20이라는 값 가져오기 >> index로 접근
		int res = list.get(2);
		System.out.println(res);
		
		// for문을 사용하여 list가 가진 모든 index로 접근하기
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		// 개선된 for문 (개선된 roop) 
		// 간단하긴 한데 특정 index로 접근하기가 힘들다.
		// 배열, list와 같이 순차적인 index 구조로 자동으로 접근하기 때문에 내용을 출력하는 것이 간편해짐
		
		// index로 직접적인 접근이 불가능하기때문에 특정 index에 대한 수정이나 제어가 불가능함
		for(int i:list) {
			System.out.print(i+" ");
		}
		
	}

}
