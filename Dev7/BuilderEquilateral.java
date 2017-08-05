/**
 * Creates object of the class EquilateralTriangle.
 */
public class BuilderEquilateral extends Builder {

  public BuilderEquilateral(Builder next) {
    super(next);
  }
 
  /**
   * Returns object of the class EquilateralTriangle.
   * @param sides sides of the triangle
   * @return object of the class EquilateralTriangle
   */
  Triangle buildTriangle(double[] sides) {
    return new EquilateralTriangle(sides);
  }
}
