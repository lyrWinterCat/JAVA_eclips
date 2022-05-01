package ex10_3_abstract;

public class CheeseRamen extends Ramen{
	String cheese = "치즈";

	@Override
	public void makeRamen() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s %s 넣은 라면 완성 \n",super.nuddle,super.soup,cheese);
		
	}

}
