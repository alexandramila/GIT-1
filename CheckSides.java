import java.math.BigDecimal;

/**
 * Analyzes the sides of the triangle that was entered by the user.
 */
class CheckSides {
  public void createSides(Sides sides) {
    double[] triangle = sides.getSides();
    BigDecimal sideA = new BigDecimal(sides[0]);
    BigDecimal sideB = new BigDecimal(sides[1]);
    BigDecimal sideC = new BigDecimal(sides[2]); 
  }

  /**
   * Determines whether the triangle is equilateral.
   * @return true  if the triangle is equilateral
   *         false if it's not
   */
  public boolean checkEquilateral() {
    if (sideA == sideB == sideC) {
      return true;
    }
    return false;
  }

  /**
   * Determines whether the triangle is isosceles.
   * @return true  if the triangle is isosceles
   *         false if it's not
   */
  public boolean checkIsosceles() {
    if (sideA == sideB || sideB == sideC || sideA == sideC) {
      return true;
    }
    return false;
  }

  /**
   * Determines whether the triangle is ordinary.
   * @return true  if the triangle is ordinary
   *         false if it's not
   */
  public boolean checkOrdinary() {
    if (!checkEquilateral() && !checkIsosceles()) {
      return true;
    }
    return false;
  }
}
