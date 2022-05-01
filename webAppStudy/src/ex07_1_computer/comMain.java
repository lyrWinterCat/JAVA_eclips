package ex07_1_computer;

public class comMain {
	public static void main(String[] args) {
		
		// 명시적 생성
		Computer c1 = new Computer(); // stack: c1 컴퓨터 생성 / heap : {s:1024, r:64, c : 4.8 color : white}의 주소값 생성 
		// new 로 생성한다 >> 명시적 생성 : Computer마다 주소값이 다름. >> 각각의 개인의 컴퓨터를 만들 수 있음.
		// 암시적 생성 >> 주소값을 공유 >> ?? 공유컴? 
//		c1.brand = "asus"; >> private을 걸어버리면 바꿀수없음
		
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
