
public class Prog8For {

	public static void main(String[] args) {
		
		System.out.println("======================");
		System.out.println("  Contagem Crescente  ");
		System.out.println("======================");
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("O valor de i é: " + i);
		}
		
		System.out.println("\n\n=====================");
		System.out.println(" Contagem Regressiva ");
		System.out.println("=====================");

		for(int i = 5; i >= 0; i--) {
			System.out.println("O valor de i é: " + i);
		}
	}

}
