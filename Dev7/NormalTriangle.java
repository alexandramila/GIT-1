/**
 * Extends from Triangle, represents a normal triangle.
 */
public class NormalTriangle extends Triangle {
  /**
   * Constructor for this class.
   * @throws gives an exception if the sides of the triangle
   *         do not conform to the rules for constructing a normal triangle
   */
  public NormalTriangle(double[] sides) {
    super(sides);
    if (!isNormal(sides)) {
      throw new IllegalArgumentException("This triangle is not normal.");
    }
  }

  /**
   * Checks whether the triangle is normal.
   * @param sides  the sides of the triangle
   * @return true  if the triangle is normal
   *         false if the triangle is not normal
   */
  public boolean isNormal(double[] sides) {
    if (Double.compare(sides[0], sides[1]) != 0 &&
        Double.compare(sides[1], sides[2]) != 0 &&
        Double.compare(sides[0], sides[2]) != 0) {
      return true;
    }
    return false;
  }
}
