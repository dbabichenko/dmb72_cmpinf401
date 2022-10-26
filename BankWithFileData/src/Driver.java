import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Bank b = new Bank();
		
		/*
		for(Account a : b.getAccounts()) {
			System.out.println(a.getAccountNumber() + ": " + a.getBalance());
		}
		
		for(User u : b.getCustomers()) {
			System.out.println(u.getLastName());
		}
		*/
		
		Account a = b.findAccountByID("1");
		a.deposit(5000);
		
		
	}

}
