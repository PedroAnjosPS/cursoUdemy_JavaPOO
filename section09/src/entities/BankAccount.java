package entities;

public class BankAccount {
	private int userNumber;
	private String userName;
	private double bankBalance;
	private static final double TAX = 5.00;
		
	// constructor
	public BankAccount() {
		super();
	}

	// getters and setters
	public int getUserNumber() {
		return userNumber;
	}
	
	public void setUserNumber(int userNumber) {
		if(this.userNumber == 0) {
			this.userNumber = userNumber;
		} 
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	// other methods
	public void bankDeposit(double deposit) {
		this.bankBalance += deposit;
	}
	
	public void bankWithdrawal(double withdrawal) {
		this.bankBalance -= (withdrawal + TAX);
	}
	
	public String toString() {
		return "Account Number: " + this.userNumber 
				+ "\nAccount Name: " + this.userName
				+ "\nBank Balance: " + this.bankBalance;
	}

}
