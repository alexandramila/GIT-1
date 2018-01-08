/**
 * Creates object of the class IsoscelesTriangle.
 */
public class BuilderIsosceles extends Builder {

  public BuilderIsosceles(Builder next) {
    super(next);
  }

  /**
   * Returns object of the class IsoscelesTriangle.
   *
   * @param sides sides of the triangle
   * @return object of the class IsoscelesTriangle
   */
  Triangle buildTriangle(double[] sides) {
    return new IsoscelesTriangle(sides);
  }
}
