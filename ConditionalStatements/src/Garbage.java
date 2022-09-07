
public class Garbage {

	public static void main(String[] args) {
		double accountBalance = 60;
		boolean isAccountActive = true;
		String currencyType = "us_dollars";
		
		// boolean result = false;
		
		
		// result = (accountBalance > 50 && isAccountActive == true && currencyType == "us_dollars");
		
		// AND = &&
		// OR = ||
		// NOT = !
		
		// System.out.println(result);
		
		
		/*
		if(accountBalance > 50 && isAccountActive == true && currencyType == "us_dollars") {
			System.out.println("Can withdraw");
		}
		else {
			System.out.println("Cannot withdraw");
		}
		*/
		
		/*
		String userName = "dmb72";
		
		if(userName != "dmb72") {
			
		}
		*/
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		if(s1 == s2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		// s1 = ['H', 'e', 'l', 'l', 'o']
		
		// BETTER WAY OF COMPARING STRINGS
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
	}

}
