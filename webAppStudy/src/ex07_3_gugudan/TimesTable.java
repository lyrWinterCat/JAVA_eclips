package ex07_3_gugudan;

public class TimesTable {
	// 실습
	// TimesTable이라는 클래스를 만들고 showTable()이라고 하는 메서드 정의
	// showTable() 메서드 : 구구단을 출력하는 코드를 작성
	// TimesTableMain클래스를 만들고 TimesTable객체를 생성하고 다음과 같은 결과를 출력하시오
	
	// Scanner를 통해 받는 값은 반드시 TimesTableMain클래스에서 하도록 한다.
	// 출력할 단을 입력 : 5
	// 5 * 1 = 5
	// 5 * 2 = 10
	// ...
	// 5 * 9 = 45
	public void showTable(int dan){
		System.out.println(dan+"단");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d \n",dan,i,(dan*i));
		}		
	}

}
