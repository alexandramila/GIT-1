/**
 * Extends from Triangle, creates a normal triangle if it exists.
 */
public class NormalTriangle extends Triangle {
  public NormalTriangle(double[] sides) {
    super(sides);
    if (!checkNormal(sides)) {
      throw new IllegalArgumentException("This triangle is not normal.");
    }
  }

  /**
   * Checks whether the triangle is normal.
   * @param sides  the sides of the triangle
   * @return true  if the triangle is normal
   *         false if the triangle is not normal
   */
  public boolean checkNormal(double[] sides) {
    if (Double.compare(sides[0], sides[1]) != 0 &&
        Double.compare(sides[1], sides[2]) != 0 &&
        Double.compare(sides[0], sides[2]) != 0) {
      return true;
    }
    return false;
  }
}
