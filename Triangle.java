public class Triangle {
  public static void main(String[] args) {
    Sides input = new Sides();
    CheckSides check = new CheckSides();
    try {
      if (check.checkEquilateral()) {
        System.out.println("The triangle is equilateral.");
      } else if (check.checkIsosceles()) {
        System.out.println("The triangle is isosceles.");
      } else if (check.checkOrdinary()) {
        System.out.println("The triangle is \"ordinary\".");
      }
      return;
    } catch (Exception e) {
      System.out.println("You've entered invalid number format.");
    }
  }
}
