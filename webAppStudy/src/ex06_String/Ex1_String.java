package ex06_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		// String 클래스는 두 가지 특징을 갖고 있다.
		// 1) 객체 생성법이 두가지(암시적,명시적)
		// 2) 한 번 생성된 문자열의 내용은 변하지 않는다.(불변의 특징)
		
		// 암시적 객체 생성
		String s1 = "abc";
		// 이미 앞에 같은 문자열로 생성도니 암시적 객체가 있다면
		// 앞서 생성된 객체의 주소를 재사용한다.
		String s2 = "abc";
		String s3 = "abc";
		
		//명시적 객체 생성
		String s4 = new String("abc");
		String s5 = new String("abc");
		
		
		// == 연산자는 기본자료형을 비교할 때는 값을 비교한다.
		// 그러나 객체끼리 비교를 할 때에는 주소를 비교하는 연산자로 기능이 바뀐다. (주소값비교)
		if(s1==s2) {
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		System.out.println("=========================");
		
		if(s3==s4) {
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		System.out.println("=========================");
		
		//String.equals(String) >> 해당 String끼리의 값을 비교하는 함수
		if(s3.equals(s4)) {
			System.out.println("내용이 같습니다.");
		}else {
			System.out.println("내용이 다릅니다.");
		}
		System.out.println("=========================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String s6 = sc.next(); //abc 입력
		if(s6.equals(s1)) {
			System.out.println("값이 같습니다.");
		}else {
			System.out.println("값이 다릅니다.");
		}
		if(s6==(s1)) {
			System.out.println("주소값이 같습니다.");
		}else {
			System.out.println("주소값이 다릅니다.");
		}
		
		System.out.println("=========================");
		// 불변의 특징
		String greet = "안녕"; // 처음 "안녕"만 적혀있는 heap 주소값은 변하지 않음
		greet+="하세요";
		System.out.println(greet); //"안녕하세요" 라는 새로운 heap 주소가 생성됨. 그것을 greet이 받아오는 것
		
	}//main

}
