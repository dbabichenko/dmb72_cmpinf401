
import java.util.ArrayList;
import java.util.UUID;

import javax.swing.JOptionPane;  

/**
 * This class manages individual bank accounts
 * @author dbabichenko
 *
 */
public class Account {
	private String accountNumber;
	private String accountType;
	private double balance;
	private double interestRate;
	
	private ArrayList<User> owners;
	
	private ArrayList<Transaction> transactions; 
	
	/**
	 * This constructor for Account class generates a new account ID and 
	 * sets the account type based on the parameter provided by user.  
	 * balance and interestRate parameters are initialized to zeros. 
	 * @param accountType Type of account (e.g., checking or savings)
	 */
	public Account(String accountType) {
		this.accountNumber = UUID.randomUUID().toString(); //Generates random UUID  
		this.accountType = accountType;
		this.balance = 0;
		this.interestRate = 0;
		this.owners = new ArrayList<User>(); 
		this.transactions = new ArrayList<Transaction>(); 
	}
	
	/**
	 * This constructor for Account class generates a new account ID and 
	 * sets the account type and interest rate based on the parameter provided by user.  
	 * balance parameter is initialized to zero. 
	 * @param accountType Type of account (e.g., checking or savings)
	 * @param interestRate Optional interest rate, by default set to zero
	 */
	public Account(String accountType, double interestRate) {
		this.accountNumber = UUID.randomUUID().toString(); //Generates random UUID  
		this.accountType = accountType;
		this.balance = 0;
		this.interestRate = interestRate;
		this.owners = new ArrayList<User>(); 
		this.transactions = new ArrayList<Transaction>(); 
	}
	
	public Account(String accountNumber, String accountType, double balance, double interestRate) {
		this.accountNumber = accountNumber;  
		this.accountType = accountType;
		this.balance = balance;
		this.interestRate = interestRate;
		this.owners = new ArrayList<User>(); 
		this.transactions = new ArrayList<Transaction>(); 
	}
	
	/**
	 * Withdraws money from an account
	 * @param amount: Amount of money to be withdrawn from an account
	 */
	public void withdraw(double amount) {
		this.balance -= amount;
		Transaction t = new Transaction("withdrawal", amount, this.accountNumber);
		transactions.add(t);
	}
	
	/**
	 * Deposits money into an account
	 * @param amount: Amount of money to be deposited into an account
	 */
	public void deposit(double amount) {
		this.balance += amount;
		Transaction t = new Transaction("deposit", amount, this.accountNumber);
		transactions.add(t);
	}
	
	
	
	/**
	 * Adds a new owner to an account.  Multiple owners are allowed.
	 * @param owner An object of type User that denotes account owner
	 */
	public void addOwner(User owner) {
		this.owners.add(owner);
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
	 * Getter for account type
	 * @return Account type (e.g., checking, savings) for a given account
	 */
	public String getAccountType() {
		return accountType;
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
	public ArrayList<User> getOwner() {
		return this.owners;
	}
	
	public ArrayList<Transaction> getTransactions(){
		return this.transactions;
	}
	
	@Override
	public String toString() {
		return this.accountNumber;
	}
	
	
}
