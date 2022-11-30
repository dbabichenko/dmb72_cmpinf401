
public class Factorial {

	public static void main(String[] args) {
		int result = factorial(5);
		// System.out.println(result);
		
		// factorial_no_base(5);

	}
	
	static int factorial (int x) {
		int temp;
		if(x > 1){
			temp = x * factorial(x-1);
		}
		else{
			temp = 1;
		}
		System.out.println(temp);
		return temp;
	}
	
	static int factorial_no_base (int x) {
		int temp = x * factorial_no_base(x-1);
		System.out.println(temp);
		return temp;
	}


}
