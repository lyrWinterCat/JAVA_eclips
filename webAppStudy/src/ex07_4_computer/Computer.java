package ex07_4_computer;

public class Computer {
	// getter setter 
	// private�� ������� ������ ���� �������ų� �����ϰ� ������ ����ϴ� �޼����� ����
	
	
	private String brand = "lucky gumsung";
	private int ssd = 512;
	int ram = 16;
	
	
	public int getSsd() {
		return ssd;
	}
//	public void setSsd(int ssd) {
//		this.ssd = ssd;
//	}
	
	public void setSsd(int a) {
		ssd=a;
	}

	// private ���� ����/���� �޼���
	public String getBrand() {
		return brand;
	}
	
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
	
	public void setBrand(String a) {
		brand=a;
	}	

}
