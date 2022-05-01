package ex10_4_abstract;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("해병",100,false);
		t1.decEnergy();
		System.out.println("해병의 에너지 : "+t1.getEnergy());
		
		Zerg z1 = new Zerg("살모사",200,true);
		z1.decEnergy();
		z1.decEnergy();		
		System.out.println("살모사의 에너지 : "+z1.getEnergy());
		
		Protoss p1 = new Protoss("광전사",250,false);
		p1.decEnergy();
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("광전사의 에너지 : "+p1.getEnergy());

	
	
	}

}
