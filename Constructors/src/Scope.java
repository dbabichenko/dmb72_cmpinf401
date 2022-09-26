
public class Scope {
	/**
	 * Three levels of scope:
	 * 1. Global
	 * 2. Local
	 * 3. Code block level (loop or if statement)
	 */
	
	// Global variable, accessible from anywhere in the class
	private int global; 
	
	public Scope() {
		this.global = 0;
	}
	
	public void changeGlobal() {
		this.global ++;
	}
	
	public void getGlobal() {
		System.out.println(this.global);
	}
	
	// someValue and test variables are only available to the LocalVarExample method
	public void LocalVarExample(int someValue) {
		String test = "Hello World";
	}
	
	public void breakLocalVarExample() {
		// This method DOES NOT know about someValue or test variables
		// System.out.println(test);
		// System.out.println(someValue);
	}
	
	public void loopScope1() {
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}
		
		// System.out.println(i);
		
	}
	
	public void loopScope2() {
		for(int i = 0; i< 10; i++) {
			double x = 10;
			System.out.println(x * i);
		}
		
		// System.out.println(x);
		
	}
	
	public void ifScope() {
		boolean i  = true;
		if(i) {
			boolean k = false;
		}
		
		// System.out.println(k);
	}
}
