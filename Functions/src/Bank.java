
public class Bank {

	public static void main(String[] args) {
		double balance = 1000;
		
		balance = withdraw(balance, 10);
		System.out.println(balance);
		
		balance = withdraw(balance, 10, "CAD");
		System.out.println(balance);
		
		balance = deposit(balance, 1000);
		System.out.println(balance);

	}
	
	public static double withdraw(double initBalance, double amount) {
		double finalBalance = initBalance - amount;
		
		return finalBalance;
	}
	
	public static double withdraw(double initBalance, double amount, String currency) {
		double finalBalance = initBalance;
		
		if(currency.equalsIgnoreCase("CAD")) {
			amount = amount * 0.77;
		}
		
		finalBalance = finalBalance - amount;
		
		return finalBalance;
	}
	
	public static double deposit(double initBalance, double amount) {
		double finalBalance = initBalance + amount;
		
		return finalBalance;
	}

}
