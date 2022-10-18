
public class Driver {

	public static void main(String[] args) {
		/*CheckingAccount ca = new CheckingAccount(20);
		ca.withdraw(100);
		ca.deposit(20000);
		
		System.out.println(ca.getBalance());
		*/
		
		SavingsAccount sa = new SavingsAccount(50);
		sa.withdraw(10);
		System.out.println(sa.getBalance());
		
	
	}
}
