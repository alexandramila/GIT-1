/**
 * Extends from Triangle, represents an equilateral triangle.
 */
public class EquilateralTriangle extends Triangle {
  /**
   * Constructor for this class.
   * @throws gives an exception if the sides of the triangle
   *         do not conform to the rules for constructing an equilateral triangle
   */
  public EquilateralTriangle(double[] sides) {
    super(sides);
    if (!isEquilateral(sides)) {
      throw new IllegalArgumentException("This triangle is not equilateral.");
    }
  }

  /**
   * Checks whether the triangle is equilateral.
   * @param sides  the sides of the triangle
   * @return true  if the triangle is equilateral
   *         false if the triangle is not equilateral
   */
  public boolean isEquilateral(double[] sides) { 
    if (Double.compare(sides[0], sides[1]) == 0 &&
        Double.compare(sides[1], sides[2]) == 0) {
      return true;
    }
    return false;
  }

  /**
   * @return string "Equilateral".
   */
  public String toString() {
    return "Equilateral ";
  }
}
