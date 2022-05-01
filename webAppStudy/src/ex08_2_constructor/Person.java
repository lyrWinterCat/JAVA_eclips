package ex08_2_constructor;

public class Person {
	int age;
	String name;
	String tel;
	// ctrl space 눌렀을때 생성자 !
	
	public Person() { //기본생성자
		age=50;
		name="독고길동";
		tel="010-1111-2222";
	}
	
	public Person(String name) { //오버로딩은 가능하나 기본생성자는 아님
		
	}
	
	public Person(int age, String name, String tel) {// 사용을 위한 custom 적용한 생성자
		// 메서드 오버로딩이랑 비슷하지 않나..?
		// >> 생성자 오버로딩 가능! 
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
		this.tel=tel;
	}

}
