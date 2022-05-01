package ex10_1_Carwork;

public class CarMain {
	// HybridCar 클래스는 Car 클래스를 상속받고 메인에서 생성자를 생성할 때 gasGauge, electricGauge를 받는다.
	// 메서드 오버라이딩을 이용하여 잔여 가스와 잔여 전기량을 출력
	
	// HybridWaterCar 클래스는 HybridCar 클래스를 상속받고 생성자를 생성할 때 gasGauge, electricGauge, waterGauge를 받는다.
	// 메서드 오버라이딩을 이용하여 잔여 가스,잔여 전기량,잔여 물량 출력
	
	// main에서 HybridWterCar 객체를 생성하여 다음과 같은 결과를 출력하시오
	// 잔여 가스량 : 15
	// 잔여 전기량 : 30
	// 잔여 물량 : 25
	public static void main(String[] args) {
		HybridCar hc = new HybridCar(15,30);
		hc.showCurrentGauge();
		
		HybridWaterCar hwc = new HybridWaterCar(15,30,25);
		hwc.showCurrentGauge();
	}
	
	

}
