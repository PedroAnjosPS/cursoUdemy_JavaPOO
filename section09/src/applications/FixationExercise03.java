package applications;

import java.util.Scanner;


public class FixationExercise03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		StringBuilder valoresDigitados = new StringBuilder();
		
		int numDigitados = 0;
		double numSoma = 0.0, numMedia = 0.0;
		double[] numeros;
		
		System.out.print("Quantos números você vai digitar? ");
		numDigitados = sc.nextInt();
		
		numeros = new double[numDigitados];
		
		System.out.println();
		
		for(int i = 0; i < numDigitados; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble(); 
			numSoma += numeros[i];
			valoresDigitados.append(numeros[i]).append("  ");
		}
		
		numMedia = numSoma / numDigitados;
		
		System.out.printf("%nVALORES = %s%n", valoresDigitados);
		System.out.printf("SOMA = %.2f%n", numSoma);
		System.out.printf("MÉDIA = %.2f%n", numMedia);
		
		sc.close();
	}

}
