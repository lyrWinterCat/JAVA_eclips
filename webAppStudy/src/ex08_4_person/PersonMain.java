package ex08_4_person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person(); //명시적 객체 생성
		p1.setName("홍길동");
		p1.setPhone("010-1111-1111");
		System.out.println("이름 : "+p1.getName());
		System.out.println("전화번호 : "+p1.getPhone());
		// 만약 Person클래스의 setProperty 에서 this를 뺀다면 p1.getProperty=null이 될 것
		// 왜? Person의 모든 name을 메서드 안의 name으로 인식하기 때문 >> 해당 클래스의 name이 우선됨! 
		// this가 있다면 this.name=private String name / setProperty(name)=main에서 받아온 name
		// >> 해서 입력값이 잘 들어가는 것!
		
		
		// 메인클래스를 만들고 사용자가 직접 정수를 입력받는다.
		// Start 클래스를 생성하여 1~50 사이의 난수를 발생시킨다.
		// Start 클래스에서 사용자가 입력한 숫자를 판단하여
		// 발생한 난수보다 크다면 down!을 출력하고 작다면 up!을 출력
		
		// 사용자가 입력한 숫자와 발생한 난수가 같을 경우 프로그램을 종료시키며
		// 몇 회만에 맞췄는지도 출력
		// 단 정답을 맞춘 경우 프로그램의 종료는 Start 클래스가 아닌 메인클래스에서 이루어지도록 한다.
		
		
	}//main

}
