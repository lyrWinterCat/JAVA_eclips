package ex09_1_animal;

public class AnimalMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println("------�����-------");
		System.out.println("�� : "+cat.getEye());
		System.out.println("�ٸ� : "+cat.getLeg());
		System.out.println("Ư¡ : "+cat.balance);
		
		Lion lion = new Lion();
		System.out.println("----����----");
		System.out.println("�� : "+lion.getEye());
		System.out.println("�ٸ� : "+lion.getLeg());
		System.out.println("Ư¡ : "+lion.galgi);
		
		Bear bear = new Bear();
		System.out.println("-----��-----");
		System.out.println("�� : "+bear.getEye());
		System.out.println("�ٸ� : "+bear.getLeg());
		System.out.println("Ư¡ : "+bear.big);
		
		Snake snake = new Snake();
		System.out.println("----��----");
		System.out.println("�� : "+snake.getEye());
		System.out.println("�ٸ� : "+snake.getLeg()); 
		System.out.println("Ư¡ : "+snake.sensor);
		
	}

}
