package ex08_4_person;

public class Person {
	private String name;
	private String phone;
	
	
	// ��Ŭ�� - source - Generate Getter and Setter
	// ����Ű : alt shift s + Generate Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// this : ���� Ŭ���� �ڽ�
		// this.name : person Ŭ������ ���� �������� name
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
//	public void setProperty(String name) { //���� �������� ���߿� main���� �޾����� �� ���ϴ� ������ �˱� ���� ���ϱ�
//		this.name = name;
//		// this.name=private String name >> Person Ŭ�������� ������ name
//		// name = String name >> �޾ƿ� name
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
	

	
	

}
