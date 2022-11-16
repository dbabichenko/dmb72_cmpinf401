/*
 * Example source: Design Patterns - Facade Pattern
 * https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
 */

public class ShapeDriver {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();		
	}
}
