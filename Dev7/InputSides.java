import java.util.Scanner;

/**
 * Enters the sides of the triangle.
 */
public class InputSides {
  /**
   * Enters the sides of the triangle.
   * @return sides  the sides of the triangle
   */
  public double[] inputSides() {
    Scanner scanner = new Scanner(System.in);
    double[] sides = new double[3];
    for (int i = 0; i < 3; i++) {
      System.out.println("Enter " + (i + 1) + " side:");
      sides[i] = scanner.nextDouble();
    }
    return sides;
  }
}
