import javax.swing.JOptionPane;

public class PalindromeFunctionsDoLoop {

	// What is a palindrome? - a word of a phrase that reads the same backwards and forward
	// Should ignore captialization
	// Ignore everything that's not a letter

	/*
	 * 1. User provides input
	 * 2. Convert everything to lower case
	 * 3. Remove all non-letter characters
	 * 4. Reverse the phrase
	 * 5. Compare the two strings
	 */

	public static void main(String[] args) {
		
		
		String phrase = "";
		
		while(!phrase.equalsIgnoreCase("quit")) {
			phrase = JOptionPane.showInputDialog("Please enter a word or a phrase, or enter 'quit' to exit: ");
			
			if(!phrase.equalsIgnoreCase("quit")) {
				// System.out.println("Original input: " + phrase);
	
				String cleanPhrase = cleanUserInput(phrase);
		
				String reversedPhrase = reversePhrase(cleanPhrase);
				
				if(comparePalindrome(cleanPhrase, reversedPhrase)) {
					System.out.println(phrase + " is a palindrome");
				}
				else {
					System.out.println(phrase + " is NOT a palindrome");
				}
			}
			
		}
		
	}


	public static String cleanUserInput(String phrase) {
		/*
		 * 2. Convert everything to lower case
		 * 3. Remove all non-letter characters
		 */
		// 2. Convert everything to lower case
		phrase = phrase.toLowerCase();
		// System.out.println("Converted to lowercase: " + phrase);

		// 3. Remove all non-letter characters
		/*
		 * a. Iterate through all characters in the input string
		 * b. If a character is a lowercase letter, keep it, otherwise ignore it
		 */

		int lowerBound = (int) 'a';
		int upperBound = (int) 'z';
		String cleanPhrase = "";

		for(int i=0;i<phrase.length();i++) {
			char letter = phrase.charAt(i);
			int asciiLetter = (int) letter;

			if(asciiLetter >= lowerBound && asciiLetter <= upperBound) {
				cleanPhrase = cleanPhrase + letter;
			}
		}


		// System.out.println("Removed non-letter chars: " + cleanPhrase);

		return cleanPhrase;
	}
	
	public static String reversePhrase(String cleanPhrase) {
		// 4. Reverse the phrase
		String reversedPhrase = "";

		for(int i=cleanPhrase.length()-1;i>=0;i--) {
			// System.out.print(cleanPhrase.charAt(i));
			// reversedPhrase = reversedPhrase +  cleanPhrase.charAt(i);
			reversedPhrase += cleanPhrase.charAt(i);

		}
		// System.out.println("Reversed string: " + reversedPhrase);
		return reversedPhrase;
	}
	
	public static boolean comparePalindrome(String orig, String reversed) {
		// 5. Compare the two strings
		if(orig.equals(reversed)) {
			return true;
		}
		else {
			return false;
		}
	}

}
