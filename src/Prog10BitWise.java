import java.util.Scanner;

public class Prog10BitWise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100100;
		int numero;
		
		System.out.print("Write a number with your preference: ");
		numero = sc.nextInt();
		
		if ((numero & mask) != 0)
			System.out.println("The third and sixth bit of this number is true!");
		else
			System.out.println("The third and sixth bit of this number is false!");
		
		sc.close();
	}

}
