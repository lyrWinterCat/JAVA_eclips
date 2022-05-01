package ex08_4_person;

public class Person {
	private String name;
	private String phone;
	
	
	// 우클릭 - source - Generate Getter and Setter
	// 단축키 : alt shift s + Generate Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// this : 현재 클래스 자신
		// this.name : person 클래스가 가진 전역변수 name
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	public String getProperty() {
//		return name;
//	}
//	public void setProperty(String name) { //여기 변수명은 나중에 main에서 받았을때 뭘 뜻하는 것인지 알기 쉽게 정하기
//		this.name = name;
//		// this.name=private String name >> Person 클래스에서 선언한 name
//		// name = String name >> 받아온 name
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
	

	
	

}
