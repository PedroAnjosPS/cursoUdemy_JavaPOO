import java.util.Scanner;

public class Prog4ExercicioAtribuicaoCumulativa {

	public static void main(String[] args) {
		// Instanciando o scanner
		Scanner sc = new Scanner(System.in);
		
		// Constantes
		final double CUSTO_EXTRA = 2.00;
		final int MINUTOS_BASICO = 100;
		
		// Variaveis
		double contaFinal = 50.00, custoAdicional;
		int consumoMinutos, minutosExtras;
		
		System.out.println("=================================================");
		System.out.println(" Exercício - Operadores de Atribuição Cumulativa ");
		System.out.println("=================================================");
		
		System.out.print("Digite a quantidade de minutos consumida pelo "
				+ "usuário na chamada telefônica: ");
		consumoMinutos = sc.nextInt();
		
		if(consumoMinutos > MINUTOS_BASICO) {
			minutosExtras = consumoMinutos - MINUTOS_BASICO;
			custoAdicional = minutosExtras * CUSTO_EXTRA;
			// operador de atribuicao cumulativo
			contaFinal += custoAdicional;
		}
		
		System.out.println("\nA conta telefônica final do usuário é de: R$ " + contaFinal);
		
		sc.close();
	}

}
