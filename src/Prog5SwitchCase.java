import java.util.Scanner;

public class Prog5SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Variaveis
		int numDiaSemana;
		String diaSemana;
		
		System.out.println("==================================");
		System.out.println(" Programa - Qual o dia da semana? ");
		System.out.println("==================================");
		
		System.out.println("Digite o número equivalente ao dia da semana:"
				+ "\nDomingo       (1)"
				+ "\nSegunda-feira (2)"
				+ "\nTerça-feira   (3)"
				+ "\nQuarta-feira  (4)"
				+ "\nQuinta-feira  (5)"
				+ "\nSexta-feira   (6)"
				+ "\nSábado        (7)");
		numDiaSemana = sc.nextInt();
		
		switch (numDiaSemana) {
			case 1:
				diaSemana = "Domingo";
				break;
			case 2:
				diaSemana = "Segunda-feira";
				break;
			case 3:
				diaSemana = "Terça-feira";
				break;
			case 4: 
				diaSemana = "Quarta-feira";
				break;
			case 5:
				diaSemana = "Quinta-feira";
				break;
			case 6:
				diaSemana = "Sexta-feira";
				break;
			case 7:
				diaSemana = "Sábado";
				break;
			default:
				diaSemana = "Inválido";
				break;
		}
			
		System.out.println("O dia da semana escolhido pelo usuário foi: " + diaSemana);
		
		sc.close();
	}

}
