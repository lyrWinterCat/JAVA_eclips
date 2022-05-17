package BuyPanel;

public class Menu {
	public String name;
	public String options;
	public int totalPrice;
	public int productNum;
	
	public Menu() {};

	public Menu(String name, String options, int totalPrice) {
		this.name = name;
		this.options = options;
		this.totalPrice = totalPrice;
		productNum++;
	}
}
