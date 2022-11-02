
import java.util.UUID;

import javax.swing.JOptionPane;  

/**
 * This class manages individual bank accounts
 * @author dbabichenko
 *
 */
public abstract class Account {
	private String accountNumber;
	private double balance;
	private double interestRate;
	
	// Each account may have up to two owners
	private User[] owners;
	
	// Each account may have up to 10 transactions
	private Transaction[] transactions; 
	
	/**
	 * This constructor for Account class generates a new account ID and 
	 * sets the account type based on the parameter provided by user.  
	 * balance and interestRate parameters are initialized to zeros. 
	 * @param accountType Type of account (e.g., checking or savings)
	 */
	public Account() {
		this.accountNumber = UUID.randomUUID().toString(); //Generates random UUID  
		this.balance = 0;
		this.interestRate = 0;
		this.owners = new User[2]; // Initialize an array of type User with a length of 2
		this.transactions = new Transaction[10]; // Initialize an array of type Transaction with a length of 10
	}
	
	/**
	 * Withdraws money from an account
	 * @param amount: Amount of money to be withdrawn from an account
	 */
	public void withdraw(double amount) {
		this.balance -= amount;
		Transaction t = new Transaction("withdrawal", amount, this.accountNumber);
	}
	
	/**
	 * Deposits money into an account
	 * @param amount: Amount of money to be deposited into an account
	 */
	public void deposit(double amount) {
		this.balance += amount;
		Transaction t = new Transaction("deposit", amount, this.accountNumber);
	}
	
	/**
	 * Saves a transaction to a list of transactions
	 * Note: pay attention to the visibility of this method - it is declared as "private"
	 * @param t A transaction object
	 */
	public void storeTransaction(Transaction t) {
		for(int i = 0; i<this.transactions.length; i++) {
			// Check each element of the array 
			// If it is not null, add transaction to that position
			if(this.transactions[i] != null) {
				this.transactions[i] = t;
				break; // Once you added an transaction, exit the loop
			}
		}
	}
	
	/**
	 * Adds a new owner to an account.  Multiple owners are allowed.
	 * @param owner An object of type User that denotes account owner
	 */
	public void addOwner(User owner) {
		if(owners[0]== null) {
			owners[0] = owner; // First user to get added to account is stored at index 0
		}
		else if(owners[1] == null) {
			owners[1] = owner; // Second user to get added to account is stored at index 1
		}
		else {
			JOptionPane.showMessageDialog(null, "This account already has two owners!");
			
		}
	}
	

	/**
	 * Getter for interest rate
	 * @return Interest rate for an account
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * Setter for interest rate
	 * @param interestRate Interest rate for an account
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * Getter for account number
	 * @return Account number of a given account
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Getter for account balance
	 * @return Account balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Getter for account owner
	 * @return An object of type User that denotes account owner
	 */
	public User[] getOwner() {
		return this.owners;
	}
	
	@Override
	public String toString() {
		return "Account number: " + this.accountNumber + "; balance: " + this.balance;
	}
	
	
}
