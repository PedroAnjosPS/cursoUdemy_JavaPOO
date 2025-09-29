import java.util.Scanner;

public class Prog7While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		while(num != 0) {
			num = sc.nextInt();
		}
		
		System.out.println("Parabéns! Você saiu do looping!!");
		
		sc.close();
	}

}
