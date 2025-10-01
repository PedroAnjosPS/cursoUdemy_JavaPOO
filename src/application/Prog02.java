package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Prog02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo rectangle;
		rectangle = new Retangulo();
		
		System.out.print("Enter rectangle width: ");
		rectangle.setWidth(sc.nextDouble());
		
		System.out.print("\nEnter rectangle height: ");
		rectangle.setHeight(sc.nextDouble());
		
		System.out.printf("%n%nAREA = %.2f", rectangle.area());
		
		System.out.printf("%nPERIMETER = %.2f", rectangle.perimeter());
		
		System.out.printf("%nDIAGONAL = %.2f", rectangle.diagonal());
		
		sc.close();
	}
}
