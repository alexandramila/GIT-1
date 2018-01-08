import java.lang.Double;

/**
 * Creates the triangle if it exists.
 */
public class Triangle {
  private double[] sides = new double[3];

  public Triangle(double[] sides) {
    for (int i = 0; i < 3; i++) {
      this.sides[i] = sides[i];
    }
    checkForExistence(sides);
  }

  /**
   * Checks if the triangle exists.
   *
   * @param sides the sides of the triangle
   */
  public void checkForExistence(double[] sides) {
    if (Double.compare(sides[0], 0) <= 0 ||
            Double.compare(sides[1], 0) <= 0 ||
            Double.compare(sides[2], 0) <= 0) {
      throw new IllegalArgumentException("Can not create a triangle with negative sides.");
    } else if (Double.compare(sides[0], sides[1] + sides[2]) >= 0 ||
            Double.compare(sides[1], sides[0] + sides[2]) >= 0 ||
            Double.compare(sides[2], sides[0] + sides[1]) >= 0) {
      throw new IllegalArgumentException("Can not create a triangle with these sides.");
    }
  }
}
