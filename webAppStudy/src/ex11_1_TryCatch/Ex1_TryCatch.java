package ex11_1_TryCatch;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		// 자바에서 프로그램이 실행되는 도중 예외(오류,에러,버그)가 발생하면 그 시점에서
		// 프로그램이 강제로 종료가 된다.
		// 종료가 되는게 맞는 판단이지만 때로는 예상가능한 오류가 있거나
		// 오류 발생시 이를 무시하고 이후의 작업을 진행해야 하는 경우가 많다.
		// 예외처리를 통해서 프로그램의 비정상적인 종료를 줄여보자
		
		// try 영역에서 오류가 발생하면 catch영역으로 이동하여 코드를 수행한 뒤에 빠져나간다.
		
		int result=0;
		char[] arr = new char[3];
		try {
			// 오류가 나지 않는 정상적인 코드를 포함하여 try에 작성을 하게 되면
			// 오류가 나는 코드를 판단하지 못하고 try에서 튕겨나가버리는 경우가 있기 때문에
			// 오류가 나는 코드를 중점적으로 try에 작성해야한다.
			result = 10/0;
			arr[3]='A';	
			
		} catch (Exception e) {// Exception이라는 클래스
			// 자바에서 발생할 수 있는 모든 예외에 대한 정보를 가지고 있음
			e.printStackTrace();			
//			System.out.println("에러 발생");
		}
		System.out.println(result);		
		
	}//main

}
