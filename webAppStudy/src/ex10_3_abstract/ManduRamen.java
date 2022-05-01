package ex10_3_abstract;

public class ManduRamen extends Ramen{
	String mandu = "만두";

	@Override
	public void makeRamen() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s %s 넣은 라면 완성 \n",super.nuddle,super.soup,mandu);
	}

}
