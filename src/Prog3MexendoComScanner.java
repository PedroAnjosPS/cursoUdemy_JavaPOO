import java.util.Scanner;

public class Prog3MexendoComScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================================");
		System.out.println("          S I G N - I N         ");
		System.out.println("================================");
		
		String userName, email, password, passwordConfirm;
		
		System.out.print("Write your user name: ");
		userName = sc.nextLine();
		
		System.out.print("\nWrite your email address: ");
		email = sc.nextLine();
		
		System.out.print("\nWrite your password: ");
		password = sc.nextLine();
		
		System.out.print("\nConfirm your password: ");
		passwordConfirm = sc.nextLine();
		
		System.out.println("\nEmail address: " + email);
		
		if (passwordConfirm.equals(password)) 
			System.out.println("\nWelcome again, " + userName);
		else
			System.out.println("\nOne of your personal informations is wrong, write them again!");
		
		sc.close();
	}

}
