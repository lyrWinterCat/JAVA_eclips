package ex07_1_computer;

public class comMain {
	public static void main(String[] args) {
		
		// ����� ����
		Computer c1 = new Computer(); // stack: c1 ��ǻ�� ���� / heap : {s:1024, r:64, c : 4.8 color : white}�� �ּҰ� ���� 
		// new �� �����Ѵ� >> ����� ���� : Computer���� �ּҰ��� �ٸ�. >> ������ ������ ��ǻ�͸� ���� �� ����.
		// �Ͻ��� ���� >> �ּҰ��� ���� >> ?? ������? 
//		c1.brand = "asus"; >> private�� �ɾ������ �ٲܼ�����
		
//		System.out.println("ssd : "+c1.ssd);
//		System.out.println("ram : "+c1.ram);
//		System.out.println("cpu : "+c1.cpu);
//		System.out.println("color : "+c1.color);
//		System.out.println("---------------------------");
		
		Computer c2 = new Computer();
		c2.ssd = 2048;
//		System.out.println("ssd : "+c2.ssd);
//		System.out.println("ram : "+c2.ram);
//		System.out.println("cpu : "+c2.cpu);
//		System.out.println("color : "+c2.color);
		
		c1.getInfo();
		c2.getInfo();
		
		
		
	}//main
}
