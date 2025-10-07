package applications;

import java.util.Locale;
import java.util.Scanner;

public class Vect01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		double [] vect = new double[n];
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter a height: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double averageHeight = sum / n;
		
		System.out.printf("%nAVERAGE HEIGHT = %.2f m", averageHeight);
		
		sc.close();
	}

}
