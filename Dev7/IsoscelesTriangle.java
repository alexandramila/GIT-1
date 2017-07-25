/**
 * Extends from Triangle, represents an isosceles triangle.
 */
public class IsoscelesTriangle extends Triangle {
  /**
   * Constructor for this class.
   * @throws gives an exception if the sides of the triangle
   *         do not conform to the rules for constructing an isosceles triangle
   */
  public IsoscelesTriangle(double[] sides) {
    super(sides);
    if (!isIsosceles(sides)) {
      throw new IllegalArgumentException("This triangle is not isosceles.");
    }
  }

  /**
   * Checks whether the triangle is isosceles.
   * @param sides  the sides of the triangle
   * @return true  if the triangle is isosceles
   *         false if the triangle is not isosceles
   */
  public boolean isIsosceles(double[] sides) {
    if (Double.compare(sides[0], sides[1]) == 0 ||
        Double.compare(sides[1], sides[2]) == 0 ||
        Double.compare(sides[0], sides[2]) == 0) {
      return true;
    }
    return false;
  }
}
