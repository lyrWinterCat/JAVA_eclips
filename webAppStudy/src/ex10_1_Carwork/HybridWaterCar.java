package ex10_1_Carwork;

public class HybridWaterCar extends HybridCar{
	private int waterGauge;

	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge=waterGauge;
	}
	
//	public int getWaterGauge() {
//		return waterGauge;
//	}

	@Override
	public void showCurrentGauge() { // 오버라이딩	
//		System.out.println("잔여 가스량 : " +getGasGauge());
//		System.out.println("잔여 전기량 : " +getElectricGauge());
		super.showCurrentGauge();
		System.out.println("잔여 물의 양 : " +waterGauge);
	}



}
