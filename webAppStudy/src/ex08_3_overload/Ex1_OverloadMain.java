package ex08_3_overload;

public class Ex1_OverloadMain {
	public static void main(String[] args) {
		
		Ex1_Overload ov = new Ex1_Overload();
		ov.result();
		ov.result(3);
		ov.result(3,10);
		ov.result('A');
//		ov.result('65'); // 아스키코드지만 메서드에 걸려서 적용이 안됨
		ov.result("ABC");
		ov.result("ABC",10);
		ov.result(10,"ABC");
		
		// 가장 많이 쓴 메서드 오버로드
//		System.out.print();
	}

}
