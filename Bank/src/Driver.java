

public class Driver {

	public static void main(String[] args) {
		/*
		 * Account
		 * 	accountNumber: String
		 * 	accountType: String
		 * 	balance: double
		 * 	interestRate: double
		 * 	owner: User
		 *  
		 *  
		 * User
		 * 	userID: String
		 * 	ssn: String
		 * 	userName: String
		 * 	password: String
		 * 	dob: String
		 * 	firstName: String
		 * 	lastName: String
		 * 	account: Account
		 * 
		 * 
		 * Transaction
		 * 	transactionID: String
		 * 	transactionType: String
		 * 	amount: double
		 * 	originAccountNumber: String
		 * 	destinationAccountNumber: String
		 */
		
		User u = new User("111-11-1111", "Dmitriy", "Babichenko");
		System.out.println(u.getFirstName() + " " + u.getLastName());
		
		Account a = new Account("checking");
		u.addAccount(a); // Add new account to user
		
		a.addOwner(u); // Set user to be the account's owner
		
		System.out.println("Owner ID: " + a.getOwner().getUserID());
		
		System.out.println("Balance: " + a.getBalance());
		a.deposit(20);
		System.out.println("Balance: " + a.getBalance());
		a.deposit(1000);
		System.out.println("Balance: " + a.getBalance());
		a.deposit(200);
		System.out.println("Balance: " + a.getBalance());
		a.withdraw(200);
		System.out.println("Balance: " + a.getBalance());
		
		
		
	}

}
