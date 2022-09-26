
public class Calculator {
	public double sum(double num1, double num2){
		return (num1 + num2);
	}

	/*
	
	This method is NOT overloaded!
	public double sum(double num2, double num1){
		return (num1 + num2);
	}
	*/
	
	public double sum(int num2, double num1){
		return (num1 + num2);
	}
	
	public double sum(double num2, int num1){
		return (num1 + num2);
	}
	
	/* 
	This method IS NOT overloaded!
	Java does not care about return data type
	 
	public int sum(double num2, int num1){
		return (int) (num1 + num2);
	}
	*/
	
}
