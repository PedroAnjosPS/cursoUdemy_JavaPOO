package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		double price;
		int quantity = 0;
		Product objProduct;

		System.out.println("=========================");
		System.out.println("    PROGRAM - PRODUCTS   ");
		System.out.println("=========================");

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		name = sc.nextLine();

		System.out.print("Price: ");
		price = sc.nextDouble();

		//System.out.print("Quantity: ");
		//quantity = sc.nextInt();

		objProduct = new Product(name, price);
		
		// objProduct.toString();

		objProduct.setName("Computer");
		
		System.out.println("\nUpdated name: " + objProduct.getName());
		
		objProduct.setPrice(1200.00);
		
		System.out.printf("%nUpdated price: $ %.2f", objProduct.getPrice());

		System.out.println("\n\nProduct data: " + objProduct);

		System.out.print("\nEnter the number of products to be added in stock: ");
		objProduct.addProducts(sc.nextInt());

		System.out.println("\nUpdate data: " + objProduct);

		System.out.print("\nEnter the number of products to be removed from stock: ");
		objProduct.removeProducts(sc.nextInt());

		System.out.println("\nUpdate data: " + objProduct);

		sc.close();
	}

}