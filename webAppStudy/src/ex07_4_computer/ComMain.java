package ex07_4_computer;

public class ComMain {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.setBrand("LG");
		com.setSsd(1024);
		
		System.out.println(com.getBrand());
		System.out.println(com.getSsd());
		System.out.println(com.ram);
	}// main

}
