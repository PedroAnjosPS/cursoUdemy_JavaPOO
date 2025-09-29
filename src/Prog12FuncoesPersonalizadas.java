import java.util.Scanner;

public class Prog12FuncoesPersonalizadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		System.out.println("The highest number is: " + higher + ".");
		
		sc.close();
	}
	
	
	public static int max(int num1, int num2, int num3) {
		int higher;
		if (num1 > num2 && num1 > num3) {
			higher = num1;
		} else if (num2 > num3) {
			higher = num2;
		} else {
			higher = num3;
		}
		
		return higher;
	}
}
