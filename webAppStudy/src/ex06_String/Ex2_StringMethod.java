package ex06_String;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		// 메서드(기능,함수) : 어떤 명령을 수행하기 위한 명령문들의 집합
		// 반복적으로 사용하는 코드를 미리 정의해두고 필요할 때마다 가져다가 사용할 수 있다.
		
		// () 안 값의 형태를 모를땐 커서를 안에 두고 ctrl+space
		
		String str = "Hong Gil Dong";
		
		// length() : 문자열의 길이를 셀 때 사용. int로 값을 받는다. ***
		int idx = str.length(); //공백도 하나의 문자로 인식
		System.out.println("str의 길이 : "+idx);
		
		// indexOf() : ()안의 글자가 String에서 처음 나오는 위치를 index값으로 int형태로 반환 ***
		idx=str.indexOf('o');
		System.out.println("str의 'o'가 맨 처음 나오는 글자의 위치 : "+idx);
		
		// lastIndexof() : ()안의 글자가 String에서 마지막으로 나오는 위치를 index값으로 int형태로 반환
		idx=str.lastIndexOf('o');
		System.out.println("str에서 'o'가 가장 나중으로 나오는 위치 : "+idx);
		
		// charAt(index) : String의 index에 해당하는 문자를 char 형태로 반환 ***
		char res=str.charAt(5);
		System.out.println("str에서 index가 5인 문자는 : "+res);
		
		// String 값 비교 메서드
		String exam = "apple";
		
		//.contentEquals()
		if(exam.contentEquals("apple")) { // 다른 객체와의 문자열이 동일한지 확인할때도 사용 가능
			// StringBuffer, StringBuilder , char Array 등과 비교 가능
			System.out.println("exam은 apple입니다.");
		}		
		//.equals()
		if(exam.equals("Apple")) { // 완벽하게 같지 않으면 같다는 값 반환 안함
			System.out.println("exam은 apple입니다.");
		}else {
			System.out.println("exam은 apple이 아닙니다.");
		}
		//.equalsIgnoreCase()
		if(exam.equalsIgnoreCase("Apple")) { // 대소문자를 무시하고 값 비교
			System.out.println("exam은 apple입니다.");
		}else {
			System.out.println("exam은 apple이 아닙니다.");
		}
		
		// .trim() : String에 있는 공백을 없애는 메소드 / 문자열 앞뒤의 의미없는 공백 제거 / 문자열 사이사이에 있는 공백은 제거 못함>>split으로 나누어줄수는있음
		String id=" abc ";
		if("abc".equals(id.trim())) {
			System.out.println("로그인 성공");
		}
		
		// 문자열에서 정수 가져오기 Integer.parseInt(String)
		// 정수형태의 문자열을 실제 정수로 바꿔주는 메서드
		String number = "100";
		int num=Integer.parseInt(number);
		System.out.println(num+5);
		
		// 정수를 문자열로 바꾸기
		int a = 10;
		String s1 = Integer.toString(a);
		System.out.println(s1);
		
		// 기본 자료형의 wrapper 클래스
		// int -> Integer
		// char -> Character
		// boolean -> Boolean
		// byte -> Byte
		// long -> Long
		// float -> Float
		// double -> Double
		
//		int a = 10;
//		Integer a = 10; >> 같은 변수선언
		
		
		String [] str2 = str.split(" "); // 문자열을 .split("")기준으로 나누어서 배열에 담는 메서드
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
	}

}
