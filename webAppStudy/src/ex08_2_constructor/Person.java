package ex08_2_constructor;

public class Person {
	int age;
	String name;
	String tel;
	// ctrl space �������� ������ !
	
	public Person() { //�⺻������
		age=50;
		name="����浿";
		tel="010-1111-2222";
	}
	
	public Person(String name) { //�����ε��� �����ϳ� �⺻�����ڴ� �ƴ�
		
	}
	
	public Person(int age, String name, String tel) {// ����� ���� custom ������ ������
		// �޼��� �����ε��̶� ������� �ʳ�..?
		// >> ������ �����ε� ����! 
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
		this.tel=tel;
	}

}
