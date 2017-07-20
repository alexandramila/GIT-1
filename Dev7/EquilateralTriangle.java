/**
 * Extends from Triangle, creates an equilateral triangle if it exists.
 */
public class EquilateralTriangle extends Triangle {
  public EquilateralTriangle(double[] sides) {
    super(sides);
    if (!checkEquilateral(sides)) {
      throw new IllegalArgumentException("This triangle is not equilateral.");
    }
  }

  /**
   * Checks whether the triangle is equilateral.
   * @param sides  the sides of the triangle
   * @return true  if the triangle is equilateral
   *         false if the triangle is not equilateral
   */
  public boolean checkEquilateral(double[] sides) { 
    if (Double.compare(sides[0], sides[1]) == 0 &&
        Double.compare(sides[1], sides[2]) == 0) {
      return true;
    }
    return false;
  }
}
