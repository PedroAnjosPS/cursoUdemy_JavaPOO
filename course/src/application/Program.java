package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product objProduct;
		objProduct = new Product();
		
		System.out.println("=========================");
		System.out.println("    PROGRAM - PRODUCTS   ");
		System.out.println("=========================");
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		objProduct.name = sc.nextLine();
		
		System.out.print("Price: ");
		objProduct.price = sc.nextDouble();
		
		System.out.print("Quantity: ");
		objProduct.quantity = sc.nextInt();
		
		//objProduct.toString();
		
		System.out.println("Product data: " + objProduct);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		objProduct.addProducts(sc.nextInt());
		
		System.out.println("\nUpdate data: " + objProduct);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		objProduct.removeProducts(sc.nextInt());
		
		System.out.println("\nUpdate data: " + objProduct);
		
		
		sc.close();
	}

}
