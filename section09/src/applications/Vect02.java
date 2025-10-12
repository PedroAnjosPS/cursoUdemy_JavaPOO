package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Product02;

public class Vect02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		Product02[] vect = new Product02[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			
			System.out.print("Enter a name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter a price: $ ");
			double price = sc.nextDouble();
			
			System.out.println();
			
			vect[i] = new Product02(name, price);
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		} 
		
		System.out.printf("%nAVERAGE PRICE = $ %.2f", avg);

		sc.close();
	}

}
