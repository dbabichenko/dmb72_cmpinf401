
import java.util.UUID;  

/**
 * 
 * @author dbabichenko
 *
 */
public class Account {
	private String accountNumber;
	private String accountType;
	private double balance;
	private double interestRate;
	private User owner;
	
	/**
	 * 
	 * @param accountType: Type of account (e.g., checking or savings)
	 */
	public Account(String accountType) {
		this.accountNumber = UUID.randomUUID().toString(); //Generates random UUID  
		this.accountType = accountType;
		this.balance = 0;
		this.interestRate = 0;
	}
	
	/**
	 * 
	 * @param accountType: Type of account (e.g., checking or savings)
	 * @param interestRate: Optional interest rate, by default set to zero
	 */
	public Account(String accountType, double interestRate) {
		this.accountNumber = UUID.randomUUID().toString(); //Generates random UUID  
		this.accountType = accountType;
		this.balance = 0;
		this.interestRate = interestRate;
	}
	
	/**
	 * 
	 * @param amount: Amount of money to be withdrawn from an account
	 */
	public void withdraw(double amount) {
		this.balance -= amount;
		Transaction t = new Transaction("withdrawal", amount, this.accountNumber);
	}
	
	/**
	 * 
	 * @param amount: Amount of money to be deposited into an account
	 */
	public void deposit(double amount) {
		this.balance += amount;
		Transaction t = new Transaction("deposit", amount, this.accountNumber);
	}
	
	public void addOwner(User owner) {
		this.owner = owner;
	}
	

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}
	
	public User getOwner() {
		return this.owner;
	}
	
	
}
