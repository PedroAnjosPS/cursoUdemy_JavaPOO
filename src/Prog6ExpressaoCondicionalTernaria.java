import java.util.Scanner;

public class Prog6ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco;
		
		System.out.println("=====================================");
		System.out.println(" Programa - Usando Operação Ternária ");
		System.out.println("=====================================");
		
		System.out.print("Digite um preço que deseja pagar no produto: ");
		preco = sc.nextDouble();
		
		preco *= (preco < 20) ? 0.9 : 0.95;
		
		System.out.println("\nO valor final do produto (com desconto) é: " + preco);
		
		sc.close();

	}

}
