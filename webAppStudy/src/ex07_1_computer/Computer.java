package ex07_1_computer;

public class Computer {
	// ��ǻ���� �뷮������ ���� ���赵�� ����� �۾�
	
	// Ŭ������ ���� ���
	// 1) ���, �Ӽ�, ����...
	// 2) �޼���, ���, �Լ� ...
	
	private String brand = "hansam";
	int ssd = 1024; // �⺻������ ���������ڸ� �������� ���� ��� �ڵ����� default�� ������
	int ram = 64;
	float cpu = 4.8f;
	String color = "white";
	
	// ��ǻ���� ��� ������ Ȯ���� �� �ִ� �޼���
	// �޼��� : � �۾��� �����ϱ� ���� ��ɹ����� ����
	// �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ� �ݵ�� �ʿ��� ����
	
	public void getInfo() {
		System.out.println("brand : "+brand);
		System.out.println("ssd : "+ssd+"GB");
		System.out.println("ram : "+ram+"GB");
		System.out.println("cpu : "+cpu+"Ghz");
		System.out.println("color : "+color);
		System.out.println("----------------------");
	}
	// �޼����� ����
	// ���������� ��ȯ�� �޼����(�Ķ����, ����, �Ű�����, �ƱԸ���){
	//	�޼����� ���� ����
	//}

	// ����������
	// 1) public : ���� ������Ʈ ���� ��� Ŭ�������� ����� �� �ֵ��� �㰡
	// 2) private : ���� Ŭ���� �������� ����� �� �ֵ��� ���� / ���� ������ ����
	// 3) protected : ���(�θ��ڽ�)������ ��ü�鿡�Ը� ����� �㰡 
	// 4) default : ���� ��Ű�� �������� ����� �㰡
}
