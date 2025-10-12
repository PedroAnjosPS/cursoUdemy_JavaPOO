package applications;

import java.util.Scanner;


public class FixationExercise02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int numDigitados = 0;
		int[] num;
		
		System.out.print("Quantos números você vai digitar? ");
		numDigitados = sc.nextInt();
		
		num = new int[numDigitados];
		
		System.out.println();
		
		for(int i = 0; i < numDigitados; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\n==== NÚMEROS NEGATIVOS DIGITADOS ====");
		
		for(int i = 0; i < numDigitados; i++) {
			if(num[i] < 0) 
				System.out.println(num[i] + "\n");
		}
		
		sc.close();
	}

}
