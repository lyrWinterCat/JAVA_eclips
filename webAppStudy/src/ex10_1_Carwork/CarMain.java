package ex10_1_Carwork;

public class CarMain {
	// HybridCar Ŭ������ Car Ŭ������ ��ӹް� ���ο��� �����ڸ� ������ �� gasGauge, electricGauge�� �޴´�.
	// �޼��� �������̵��� �̿��Ͽ� �ܿ� ������ �ܿ� ���ⷮ�� ���
	
	// HybridWaterCar Ŭ������ HybridCar Ŭ������ ��ӹް� �����ڸ� ������ �� gasGauge, electricGauge, waterGauge�� �޴´�.
	// �޼��� �������̵��� �̿��Ͽ� �ܿ� ����,�ܿ� ���ⷮ,�ܿ� ���� ���
	
	// main���� HybridWterCar ��ü�� �����Ͽ� ������ ���� ����� ����Ͻÿ�
	// �ܿ� ������ : 15
	// �ܿ� ���ⷮ : 30
	// �ܿ� ���� : 25
	public static void main(String[] args) {
		HybridCar hc = new HybridCar(15,30);
		hc.showCurrentGauge();
		
		HybridWaterCar hwc = new HybridWaterCar(15,30,25);
		hwc.showCurrentGauge();
	}
	
	

}
