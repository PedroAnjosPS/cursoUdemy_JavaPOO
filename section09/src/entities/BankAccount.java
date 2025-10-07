package entities;

public class BankAccount {
	private int userNumber;
	private String userName; // holder - titular
	private double bankBalance;
	private static final double TAX = 5.00;
		
	// constructor
	public BankAccount(int userNumber, String userName) {
		this.userNumber = userNumber;
		this.userName = userName;
	}

	

	public BankAccount(int userNumber, String userName, double initialDeposit) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
		bankDeposit(initialDeposit);
	}



	// getters and setters
	public int getUserNumber() {
		return userNumber;
	}
	
	public void setUserNumber(int userNumber) {
		if(this.userNumber == 0) 
			this.userNumber = userNumber;
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
		return "Account " + this.userNumber 
				+ ", Holder: " + this.userName
				+ ", Balance: $ " + String.format("%.2f", this.bankBalance);
	}

}
