package ex08_4_person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person(); //����� ��ü ����
		p1.setName("ȫ�浿");
		p1.setPhone("010-1111-1111");
		System.out.println("�̸� : "+p1.getName());
		System.out.println("��ȭ��ȣ : "+p1.getPhone());
		// ���� PersonŬ������ setProperty ���� this�� ���ٸ� p1.getProperty=null�� �� ��
		// ��? Person�� ��� name�� �޼��� ���� name���� �ν��ϱ� ���� >> �ش� Ŭ������ name�� �켱��! 
		// this�� �ִٸ� this.name=private String name / setProperty(name)=main���� �޾ƿ� name
		// >> �ؼ� �Է°��� �� ���� ��!
		
		
		// ����Ŭ������ ����� ����ڰ� ���� ������ �Է¹޴´�.
		// Start Ŭ������ �����Ͽ� 1~50 ������ ������ �߻���Ų��.
		// Start Ŭ�������� ����ڰ� �Է��� ���ڸ� �Ǵ��Ͽ�
		// �߻��� �������� ũ�ٸ� down!�� ����ϰ� �۴ٸ� up!�� ���
		
		// ����ڰ� �Է��� ���ڿ� �߻��� ������ ���� ��� ���α׷��� �����Ű��
		// �� ȸ���� ��������� ���
		// �� ������ ���� ��� ���α׷��� ����� Start Ŭ������ �ƴ� ����Ŭ�������� �̷�������� �Ѵ�.
		
		
	}//main

}
