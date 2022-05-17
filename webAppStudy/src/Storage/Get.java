package Storage;

public class Get extends PrMain{

	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	public String getName() {return name;}
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
	
	public String toString() {
		return "Ex2_Get [name=" + name + ", price=" + price + ",  numberOfStock=" + numberOfStock + ", sold=" + sold + "]";
	}
	
}
