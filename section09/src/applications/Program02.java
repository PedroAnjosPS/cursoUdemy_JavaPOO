package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// variables
		String userName;
		char answer;
		int userNumber;
		double deposit = 0.00, withdrawal;
		BankAccount bankAcc;
		
		System.out.print("Create your bank account. Enter your datas:"
				+ "\nEnter account number: ");
		userNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account name: ");
		userName = sc.nextLine();
		
		
		
		
		System.out.print("Would you like to make your first deposit? (Y/N): ");
		answer = sc.next().charAt(0);		
		
		// optional first deposit
		if(Character.toUpperCase(answer) == 'Y') {
			System.out.print("\nEnter your first deposit to add to your bank balance: $");
			deposit = sc.nextDouble();
			
			bankAcc = new BankAccount(userNumber, userName, deposit);
		} 
			
		bankAcc = new BankAccount(userNumber, userName);
		
		
		System.out.println("\nAccount data:");
		System.out.println(bankAcc + "\n");
		
		System.out.print("Make a deposit: $");
		deposit = sc.nextDouble();
		bankAcc.bankDeposit(deposit);
		
		System.out.println("\nAccount data:");
		System.out.println(bankAcc + "\n");
		
		System.out.print("Make a withdrawal: $");
		withdrawal = sc.nextDouble();
		bankAcc.bankWithdrawal(withdrawal);
		
		System.out.println("\nAccount data:");
		System.out.println(bankAcc + "\n");
				
		sc.close();
	}

}
