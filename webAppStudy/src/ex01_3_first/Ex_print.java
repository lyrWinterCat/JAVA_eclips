package ex01_3_first;

public class Ex_print {
	public static void main(String[] args) {
		// 주석 : 컴퓨터(jvm)에서 컴파일을 할 시 인식하지 못하는 코드
		/* main() : 코드를 실행할 때 가장 먼저 실행되는 영역
		 *  : 여러줄 주석
		 */
		System.out.println(100);
		System.out.println(150+50);
		System.out.println("안녕하세용"+10); // 문자열에는 + 만 사용 가능
//		System.out.println("hi"-10); >> -,*,/ 는 사용 불가능
		System.out.println(5+10+":"+5+10); 
		// "" 뒤에 +가 오면 문자열로 취급함 >> ":" + "5" + "10" >>:510
		System.out.println("2+2="+2+2); //22
		System.out.println("2+2="+(2+2));//4
	}

}
