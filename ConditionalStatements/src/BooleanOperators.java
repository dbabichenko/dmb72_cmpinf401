
public class BooleanOperators {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		boolean c = false;
		char x = 'x';
		
		if (a == 5 || b == 10) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		
		boolean isSkyBlue = true;
		System.out.println("Sky is blue: " + isSkyBlue);
		System.out.println("Sky is NOT blue: " + !isSkyBlue);
		
		if((a == 5 && b == 10) || (c == false && x == 'x')) {
			
		}
		
		
	}

}
