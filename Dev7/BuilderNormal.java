/**
 * Creates object of the class NormalTriangle.
 */
public class BuilderNormal extends Builder {

  public BuilderNormal(Builder next) {
    super(next);
  }

  /**
   * Returns object of the class NormalTriangle.
   *
   * @param sides sides of the triangle
   * @return object of the class NormalTriangle
   */
  Triangle buildTriangle(double[] sides) {
    return new NormalTriangle(sides);
  }
}
