
public class CheckingAccount extends Account {
	private String accountType;
	
	public CheckingAccount(double amount) {
		super(amount);
		accountType = "checking";
	}
	
	public CheckingAccount() {
		super();
		accountType = "checking";
	}
	
	
	

}
