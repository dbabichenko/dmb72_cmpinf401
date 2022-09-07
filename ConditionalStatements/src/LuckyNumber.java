import javax.swing.JOptionPane;

public class LuckyNumber {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please enter a number: ");

		int userInputInt = Integer.parseInt(userInput);
		
		if(userInputInt == 7) {
			System.out.println("Lucky number");
		}
		else {
			System.out.println("Pick another number");
		}
	}

}
