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
	public void showCurrentGauge() { // �������̵�	
//		System.out.println("�ܿ� ������ : " +getGasGauge());
//		System.out.println("�ܿ� ���ⷮ : " +getElectricGauge());
		super.showCurrentGauge();
		System.out.println("�ܿ� ���� �� : " +waterGauge);
	}



}
