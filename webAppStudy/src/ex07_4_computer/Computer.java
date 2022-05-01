package ex07_4_computer;

public class Computer {
	// getter setter 
	// private로 만들어진 변수의 값을 가져오거나 변경하고 싶을때 사용하는 메서드의 개념
	
	
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

	// private 변수 접근/변경 메서드
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
