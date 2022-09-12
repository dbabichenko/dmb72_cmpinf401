
public class PassingValues {

	public static void main(String[] args) {
		int c = addTwoNumbers(5, 10);
		System.out.println(c);
		
		int x = 5;
		int y = 10;
		c = addTwoNumbers(x, y);
		System.out.println(c);

	}
	
	public static int addTwoNumbers(int a, int b) {
		return a + b;
	}

}
