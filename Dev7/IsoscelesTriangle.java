/**
 * Extends from Triangle, creates an isosceles triangle if it exists.
 */
public class IsoscelesTriangle extends Triangle {
  public IsoscelesTriangle(double[] sides) {
    super(sides);
    if (!checkIsosceles(sides)) {
      throw new IllegalArgumentException("This triangle is not isosceles.");
    }
  }

  /**
   * Checks whether the triangle is isosceles.
   * @param sides  the sides of the triangle
   * @return true  if the triangle is isosceles
   *         false if the triangle is not isosceles
   */
  public boolean checkIsosceles(double[] sides) {
    if (Double.compare(sides[0], sides[1]) == 0 ||
        Double.compare(sides[1], sides[2]) == 0 ||
        Double.compare(sides[0], sides[2]) == 0) {
      return true;
    }
    return false;
  }
}
