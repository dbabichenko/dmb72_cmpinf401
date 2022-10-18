import java.util.UUID;

public abstract class Account {
	private String accountNumber;
	private double balance;
	
	public Account(double amount) {
		this.balance = amount;
		accountNumber = UUID.randomUUID().toString();
	}
	
	public Account() {
		this.balance = 0;
		accountNumber = UUID.randomUUID().toString();	
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	
	
}
