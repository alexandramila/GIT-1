import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    int i = 0;
    double fibNumber = 0;
    final double sqrt5 = Math.sqrt(5);
    double goldenRatio = (1 + sqrt5) / 2;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a positive number to 2147483647: ");
    int number = scanner.nextInt();
    if (number >= 0) {
      while (fibNumber < number) {
        fibNumber = Math.round(Math.pow(goldenRatio, i) / sqrt5);
        i++;
      }
      if (number == fibNumber) {
        System.out.println("Your number is the Fibonacci number.");
      } else {
        System.out.println("Your number isn't the Fibonacci number.");
      }
    } else {
      System.out.println("Your number is negative.");
    }
  }
}
