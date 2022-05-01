package ex10_4_abstract;

abstract public class Unit {
	String name;
	int energy;
	
	abstract public void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
	
	

}
