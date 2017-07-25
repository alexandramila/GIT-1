import java.util.InputMismatchException;

public class TriangleMain {
  public static void main(String[] args) {
    InputSides input = new InputSides();
    double[] array = input.inputSides();
    try {
      EquilateralTriangle equilateral = new EquilateralTriangle(array);
      System.out.println("This triangle is equilateral.");
      return;
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      System.exit(1);
    }
    try {
      IsoscelesTriangle isosceles = new IsoscelesTriangle(array);
      System.out.println("This triangle is isosceles.");
      return;
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      System.exit(1);
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
