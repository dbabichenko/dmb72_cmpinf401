
public class Loops {

	public static void main(String[] args) {
		// Forward loop
		for(int i=1;i<=10;i=i+2) {
			// System.out.println(i);
		}
		
		// Backward loop
		for(int i=10;i>=1;i--) {
			// System.out.println(i);
		}
		
		// Looping through a string
		String temp = "Hello world";
		for(int i=0;i<=temp.length()-1;i++) {
			// System.out.println(temp.charAt(i));
			
		}
		
		
		for(int i=temp.length()-1;i>=0;i--) {
			System.out.print(temp.charAt(i));
			
		}
		
		

	}

}
