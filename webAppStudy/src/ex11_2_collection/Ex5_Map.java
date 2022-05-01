package ex11_2_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex5_Map {
	public static void main(String[] args) {
		// id와 pw는 키보드에서 값을 받는다
		
		// id : aaaa
		// pw : 1111
		// 아이디가 존재하지 않습니다.
		
		// id : lee
		// pw : 3333
		// 비밀번호가 일치하지 않습니다.
		
		// id : park
		// pw : 3333
		// 로그인 성공
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pw : ");
		int pw = sc.nextInt();
		
		if(map.containsKey(id)) {
			if(pw==map.get(id)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
		//강사 코드
		if(!map.containsKey(id)) {
			System.out.println("아이디가 존재하지 않습니다.");
		} else {
			if(map.get(id)!=pw) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}else {
				System.out.println("로그인 성공");
			}
		}
	
		
		
		
		
		
	}

}
