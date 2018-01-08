/**
 * Create triangle.
 */
abstract class Builder {
  Builder next;

  public Builder(Builder next) {
    this.next = next;
  }

  /**
   * Returns object of the class Triangle.
   *
   * @param sides sides of the triangle
   * @return object of the class Triangle
   */
  abstract Triangle buildTriangle(double[] sides);

  /**
   * Checks the type of the entered triangle.
   *
   * @param sides sides of the triangle.
   * @return object of the class Triangle.
   */
  public Triangle build(double[] sides) {
    Triangle triangle = null;
    try {
      triangle = buildTriangle(sides);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      if (next != null) {
        triangle = next.build(sides);
      }
    }
    return triangle;
  }
}
