package ex10_4_abstract;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("�غ�",100,false);
		t1.decEnergy();
		System.out.println("�غ��� ������ : "+t1.getEnergy());
		
		Zerg z1 = new Zerg("����",200,true);
		z1.decEnergy();
		z1.decEnergy();		
		System.out.println("������ ������ : "+z1.getEnergy());
		
		Protoss p1 = new Protoss("������",250,false);
		p1.decEnergy();
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("�������� ������ : "+p1.getEnergy());

	
	
	}

}
