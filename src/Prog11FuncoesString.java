//import java.util.Scanner;

public class Prog11FuncoesString {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		String str1 = "   texto1 hahaha    ";
		
		String lowerCase = str1.toUpperCase(); 
		
		String upperCase = str1.toLowerCase();
		
		String trim = str1.trim();
		
		String[] vetor = trim.split(" ");
		
		System.out.println("str1: -" + str1 + "-" +
				"\nstr2: -" + str1 + "-" +
				"\ntoUpperCase(): -" + upperCase + "-" +
				"\ntoLowerCase(): -" + lowerCase + "-" +
				"\ntrim() -> Tira os espaços em branco das laterais da String: -" + trim + "-" +
				"\nVetor[0] := " + vetor[0] +
				"\nVetor[1] := " + vetor[1]);
		
		
		//sc.close();

	}

}
