
public class Force {

	public static void main(String[] args) {
	
		double result = force(10, 9.8);
		System.out.println(result);
		
		result = force(20, 9.8);
		System.out.println(result);
		
		result = force(30, 9.8);
		System.out.println(result);

	}
	
	public static double force(double mass, double acc) {
		double forceCalc = mass * acc;
		
		return forceCalc;
	}

}
