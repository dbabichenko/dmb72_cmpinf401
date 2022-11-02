
public final class SavingsAccount extends Account{
	private final double INTEREST_RATE = 0.01;
	private final double INTEREST_THESHOLD = 10000;
	
	public SavingsAccount() {
		super();
	}
	
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		if(super.getBalance() >= 10000) {
			double newAmount = super.getBalance() + (super.getBalance() * INTEREST_RATE);
			// super.deposit(newAmount); // if you keep depositing, will create an infite loop
		}
	}
}
