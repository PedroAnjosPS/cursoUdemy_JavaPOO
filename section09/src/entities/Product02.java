package entities;

public class Product02 {
	private String name;
	private double price;
	
	// Constructor
	public Product02(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String toString() {
		return "Product: " + this.getName()
				+ ", price: $ " + String.format("%.2f", this.getPrice());
	}
	
}
