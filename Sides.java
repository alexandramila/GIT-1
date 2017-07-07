import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Input the sides of the triangle.
 */
class Sides {
  
  /**
   * Input the sides of the triangle from the console.
   */
  public void inputSides() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the lengths of the side A of the triangle:");
    BigDecimal sideA = scanner.nextBigDecimal();
    System.out.println("Enter the lengths of the side B of the triangle:");
    BigDecimal sideB = scanner.nextBigDecimal();
    System.out.println("Enter the lengths of the side C of the triangle:");
    BigDecimal sideC = scanner.nextBigDecimal();
    BigDecimal[] sides = {sideA, sideB, sideC};
  }
  
  /**
   * Sides getter.
   * @return the sides of the triangle
   */
  public BigDecimal[] getSides() {
    return sides;
  }
}
