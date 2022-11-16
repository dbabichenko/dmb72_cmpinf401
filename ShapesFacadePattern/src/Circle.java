/*
 * Example source: Design Patterns - Facade Pattern
 * https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
 */
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Circle::draw()");
   }
}