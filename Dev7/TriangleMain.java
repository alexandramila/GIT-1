import java.util.InputMismatchException;

public class TriangleMain {
  public static void main(String[] args) {
    InputSides input = new InputSides();
    double[] array = input.inputSides();
    Triangle triangle = new Triangle(array);
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
