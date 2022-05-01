package ex12_2_work;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// 바로 전에 만들었던 코드에서 중복된 아이디를 검사하는
		// 로직을 추가해보자
		
		// 아이디 생성 : abc
		// [abc]
		
		// 아이디 생성 : abc
		// 중복된 아이디
		
		// 아이디 생성 : abc2
		// [abc, abc2]
		
		// 아이디 생성 : abc3
		// [abc, abc2, abc3]
		
		ArrayList<String> arrid = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		outer : while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			// 내 풀이
//			if(!arrid.contains(id)) {
//				arrid.add(id);
//				System.out.println(arrid);
//			}else {
//				System.out.println("중복된 아이디");
//			}
			
			// 강사 풀이
			for (int i = 0; i < arrid.size(); i++) {
				if(id.equals(arrid.get(i))){
					System.out.println("중복된 아이디");
					continue outer;
				}
			}
			arrid.add(id);
			System.out.println(arrid);
			
			
			
		}
		
		
		
		
		
	}

}
