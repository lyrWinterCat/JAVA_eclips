package ex10_4_abstract;

public class Protoss extends Unit{
	
	boolean fly;
	public Protoss(String name, int energy, boolean fly) {
		super.name=name;
		super.energy=energy;
		this.fly=fly;
	}

	@Override
	public void decEnergy() {
		energy --;
		
	}

}
