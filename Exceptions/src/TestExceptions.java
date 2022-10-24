import javax.swing.JOptionPane;

public class TestExceptions {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Please enter a value: " );
		double xNum = 0;
		Test t;
		try {
			xNum = Double.parseDouble(x);
			t = new Test();
		}
		catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Please enter a numeric value");
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Something went wrong");
			// System.out.println(ex.toString());
		}
		finally {
			t = null;
		}
		 
		System.out.println(xNum);

	}

}
