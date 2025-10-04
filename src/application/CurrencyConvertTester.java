package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class CurrencyConvertTester {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice, dollarsQuantity, dollarConversion;
		
		System.out.print("What is the dollar price? ");
		dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		dollarsQuantity = sc.nextDouble();
		
		dollarConversion = CurrencyConverter.dollarConversion(dollarPrice, 
				dollarsQuantity);
		
		System.out.printf("%nAmount to be paid in reais: R$ %.2f", dollarConversion);

		sc.close();
	}

}
