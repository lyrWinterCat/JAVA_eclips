package ex10_3_abstract;

public class CheeseRamen extends Ramen{
	String cheese = "ġ��";

	@Override
	public void makeRamen() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s %s ���� ��� �ϼ� \n",super.nuddle,super.soup,cheese);
		
	}

}
