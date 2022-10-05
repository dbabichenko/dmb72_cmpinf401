import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		/*
		Account[] accountList = new Account[20];
		 
		
		for(int i = 0; i<accountList.length; i++) {
			// System.out.println(accountList[i]);
			accountList[i] = new Account("checking");
		}
		
		
		for(Account a : accountList) {
			System.out.println(a.getAccountNumber());
		}
		*/
		
		/* Test addOwner method with ArrayList */
		Account a = new Account("checking");
		
		System.out.println("Checking owners logic");
		System.out.println("________________________________\n");
		for(int i = 0; i<5; i++) {
			User u = new User("111-11-1111", "Bob", "Smith");
			a.addOwner(u);
		}
		
		ArrayList<User> ownerList = a.getOwner();
		for(User owner : ownerList) {
			System.out.println(owner.getUserID() + " - " + owner.getLastName());
		}
		
		System.out.println("________________________________");
		System.out.println("Checking transactions logic");
		System.out.println("________________________________\n");
		
		
		a.deposit(100000);
		System.out.println("Balance: " + a.getBalance());
		a.deposit(500);
		System.out.println("Balance: " + a.getBalance());
		a.withdraw(2000);
		System.out.println("Balance: " + a.getBalance());
		System.out.println("Transactions: " + a.getTransactions().size());
		
		// Using standard for loop
		for(int i = 0; i<a.getTransactions().size(); i++) {
			// System.out.println(a.getTransactions().get(i).getTransactionAmount());
		}
		
		// Using enhanced for loop
		for(Transaction t : a.getTransactions()) {
			// System.out.println(t.getTransactionType() + ": " + t.getTransactionAmount());
		}
		
		
		
		
	}

}
