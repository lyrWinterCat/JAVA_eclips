package ex07_2_method;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest m1 = new MethodTest();
		m1.test1();
		
		int su = 10;
		m1.value(su);
		
		// 파라미터를 줄 때는 수가 복사가 되어서 전달이 되고
		// 원본값은 남아있으므로 출력을 하면 원본값이 출력된다.
		System.out.println(su);
		
		System.out.println("------------------------");
		
		int i1 = 10;
		int i2 = 5;
		
		String res=m1.exam(i1, i2); //15 >> 함수가 실행되면서 나온 i1+i2값
		// String res = "10" >>return값을 받아오기 때문
		// String res = "안녕" >>return값을 받아오기 때문
		System.out.println(res); //10 / 안녕
		
		int r =m1.exam2('H'); // 함수가 실행되면서 나오는 출력 char
		System.out.println(r); //return 값 >> int (char의 아스키코드)
		// main-> sub class : 파라미터로 전달
		// sub -> main class : return 값으로 전달
				
		
	}//main

}
