/*import java.util.Scanner;

public class Prog9DoWhile {

	public static void main(String[] args) {
		// Instanciando Scanner
		Scanner sc = new Scanner(System.in);
		
		// Variaveis
		double tempCelsius, tempFahrenheit;
		char repeatProgram;
		
		System.out.println("======================================");
		System.out.println(" Conversão de Celsius para Fahrenheit ");
		System.out.println("======================================");
		
		do {
			System.out.print("\nDigite o a temperatura em graus Celsius: ");
			tempCelsius = sc.nextDouble();
			
			tempFahrenheit = (9.0 * tempCelsius / 5.0) + 32.0;
			
			System.out.printf("%n%nTemperatura em Celsius digitada pelo usuário: %.2f°%n" +
				"Conversão para temperatura em Fahrenheit: %.2f°%n%n",
				tempCelsius, tempFahrenheit);
			
			System.out.println("Você deseja repetir o programa? (S/N)");
			repeatProgram = sc.next().toUpperCase().charAt(0);
			
		} while(repeatProgram == 'S');
		
		System.out.println("===================================");
		System.out.println(" F I M   D O   P R O G R A M A ! ! ");
		System.out.println("===================================");
		
		sc.close();
	}

}*/
