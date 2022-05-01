package ex10_4_abstract;

public class Terran extends Unit{
	boolean fly;
	public Terran(String name, int energy, boolean fly) {
		super.name=name; //this로 받아도 상관 없음
		super.energy=energy;
		this.fly=fly;
		
	}
	
	@Override
	public void decEnergy() {
		energy -= 3;
		
	}

}
