import java.util.UUID;

import javax.swing.JOptionPane;

public final class CheckingAccount extends Account{
	private final double OVERDRAFT_PENALTY = 25;
	private final double MAX_WITHDRAWAL = 500;
	
	public CheckingAccount() {
		super();
		
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount <= MAX_WITHDRAWAL) {
			super.withdraw(amount);
		}
		else {
			JOptionPane.showMessageDialog(null, "You cannot withdraw more than $500.");
		}
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		str = str + "; This is a checking account";
		return str;
	}

}
