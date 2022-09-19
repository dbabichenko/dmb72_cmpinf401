import javax.swing.JOptionPane;

public class WhileLooop {

	public static void main(String[] args) {
		/**
		 * An example of an infinite loop
		 */
		
		/*
		boolean i = true;
		
		while(i == true) {
			System.out.println("I'm inside a loop");
		}
		*/
		
		String userInput = "";
		
		while(!userInput.equalsIgnoreCase("quit")) {
			userInput = JOptionPane.showInputDialog("Please enter a word.  Enter 'quit' to exit: ");
			System.out.println(userInput);
		}

	}

}
