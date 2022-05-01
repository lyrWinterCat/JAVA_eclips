package ex09_1_animal;

public class AnimalMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println("------°í¾çÀÌ-------");
		System.out.println("´« : "+cat.getEye());
		System.out.println("´Ù¸® : "+cat.getLeg());
		System.out.println("Æ¯Â¡ : "+cat.balance);
		
		Lion lion = new Lion();
		System.out.println("----»çÀÚ----");
		System.out.println("´« : "+lion.getEye());
		System.out.println("´Ù¸® : "+lion.getLeg());
		System.out.println("Æ¯Â¡ : "+lion.galgi);
		
		Bear bear = new Bear();
		System.out.println("-----°õ-----");
		System.out.println("´« : "+bear.getEye());
		System.out.println("´Ù¸® : "+bear.getLeg());
		System.out.println("Æ¯Â¡ : "+bear.big);
		
		Snake snake = new Snake();
		System.out.println("----¹ì----");
		System.out.println("´« : "+snake.getEye());
		System.out.println("´Ù¸® : "+snake.getLeg()); 
		System.out.println("Æ¯Â¡ : "+snake.sensor);
		
	}

}
