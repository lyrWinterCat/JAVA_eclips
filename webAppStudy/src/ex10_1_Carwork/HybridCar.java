package ex10_1_Carwork;

public class HybridCar extends Car{
	private int electricGauge;

	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge=electricGauge;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void showCurrentGauge() { //오버라이딩
//		System.out.println("잔여 가스량 : " +getGasGauge());
		super.showCurrentGauge(); //>> getter 필요 없음
		System.out.println("잔여 전기량 : " +electricGauge);
	}

//	public int getElectricGauge() {
//		return electricGauge;
//	}
	

}
