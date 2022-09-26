
public class Circle {
	private double radius;
	
	public Circle(double radius) {
		if(radius > 0) {
			this.radius = radius;
		}
		else {
			System.out.println("You cannot have a radius value equal to zero or negative");
		}
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double perimeter() {
		// 2πr
		return this.radius * 2 * Math.PI;
	}
	
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
}
