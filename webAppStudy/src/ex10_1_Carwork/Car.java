package ex10_1_Carwork;

public class Car { //부모클래스
	private int gasGauge;
	
	public Car(int gasGauge) {
		this.gasGauge=gasGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가스량 : " +gasGauge);
	}
	
//	public int getGasGauge() {
//		return gasGauge;
//	}
	

}
