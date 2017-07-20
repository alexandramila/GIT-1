import java.util.InputMismatchException;

public class TriangleMain {
  public static void main(String[] args) {
    InputSides input = new InputSides();
    double[] array = input.inputSides();
    try {
      Triangle triangle = new Triangle(array);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return;
    } catch(InputMismatchException e) { 
      System.out.println("Instead of the number, another character was entered.");
      return;
    } 
    try {
      EquilateralTriangle equilateral = new EquilateralTriangle(array);
      System.out.println("This triangle is equilateral.");
      return;
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    try {
      IsoscelesTriangle isosceles = new IsoscelesTriangle(array);
      System.out.println("This triangle is isosceles.");
      return;
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    try {
      NormalTriangle normal = new NormalTriangle(array);
      System.out.println("This triangle is normal.");
      return;
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
