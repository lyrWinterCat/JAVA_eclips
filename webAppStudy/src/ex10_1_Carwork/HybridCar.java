package ex10_1_Carwork;

public class HybridCar extends Car{
	private int electricGauge;

	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge=electricGauge;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void showCurrentGauge() { //�������̵�
//		System.out.println("�ܿ� ������ : " +getGasGauge());
		super.showCurrentGauge(); //>> getter �ʿ� ����
		System.out.println("�ܿ� ���ⷮ : " +electricGauge);
	}

//	public int getElectricGauge() {
//		return electricGauge;
//	}
	

}
