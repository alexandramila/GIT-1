public class Main {

  public static void main(String[] args) {
    InputSides input = new InputSides();
    double[] array = input.inputSides();
    BuilderEquilateral builder = new BuilderEquilateral(new BuilderIsosceles(new BuilderNormal(null)));
    builder.build(array);
    Triangle triangle = builder.build(array);
    if (triangle != null) {
      System.out.println(triangle.toString() + "triangle exists.");
    }
  }
}
