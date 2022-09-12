import javax.swing.JOptionPane;

public class NestedIfs {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		boolean isTrue = false;

		if(a == 10 && b == 15) {
			if(isTrue == false) {
				System.out.println("Executed nested if");
			} // end of (isTrue == false)
			else {
				System.out.println("isTrue == true");
			}
			
		} // end of (a == 10 && b == 15)
		
		String userInput = JOptionPane.showInputDialog("Please enter a numeric value: ");
		int userInputNum;
		
		if(userInput != null) {
			if (!userInput.equalsIgnoreCase("")) {
				userInputNum = Integer.parseInt(userInput);
				System.out.println(userInputNum);
			}
		}
		
		
		
		

	}

}
