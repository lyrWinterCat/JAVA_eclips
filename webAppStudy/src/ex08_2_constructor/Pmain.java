package ex08_2_constructor;

import java.util.Scanner;

public class Pmain {
	public static void main(String[] args) {
		Person p1 = new Person(20,"홍길동","010-1234-1234");
//		p1.age=40;
//		p1.name="홍길동";
//		p1.tel=("010-1234-1234");
		System.out.println(p1.age);
		
		Person p2 = new Person(40,"홍길순","010-111-1111");
//		p2.name="홍길순";
		
		Person p3 = new Person(); //기본생성자에 값을 넣어준다면 이렇게 생성 가능
		System.out.println(p3.age); // 기본생성자에서 설정한 값 출력
		
		Scanner sc = new Scanner(System.in); // 키보드에서 값을 가져오는 것 >> System.in으로
		// 값을 넣어주지 않았을때를 대비
		
		
		
		
	}
	

}
