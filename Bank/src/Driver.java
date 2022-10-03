

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
		
		User u1 = new User("111-11-1111", "Dmitriy", "Babichenko");
		System.out.println("User 1: " + u1.getFirstName() + " " + u1.getLastName());
		
		User u2 = new User("222-22-2222", "Jane", "Smith");
		System.out.println("User 2: " + u2.getFirstName() + " " + u2.getLastName());
		
		Account a = new Account("checking");
		// u.addAccount(a); // Add new account to user
		
		a.addOwner(u1); // Set user to be the account's owner
		a.addOwner(u2); // Set user to be the account's co-owner
		
		/*
		 * Class hierarchy for Account and Owner as follows:
		 * 1. Account --> User
		 * 
		 */
		
		// Step 1: Get list of owners
		User[] userList = a.getOwner(); // Get a list of owners from account
		System.out.println(userList[0]);
		System.out.println(userList[1]);
		
		// Step 2: Get individual owner objects (User objects)
		User owner1 = userList[0];
		User owner2 = userList[1];
		System.out.println("Owner 1: " + owner1.getFirstName() + " " + owner1.getLastName());
		System.out.println("Owner 2: " + owner2.getFirstName() + " " + owner2.getLastName());
		
		// You can do all of this by daisy chaining things
		
		for(int i = 0; i<a.getOwner().length; i++) {
			System.out.println(a.getOwner()[i].getFirstName());
		}
		
		/*
		User accountOwner = a.getOwner();
		accountOwner.getUserID();
		
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
		*/
		
		
		
	}

}
