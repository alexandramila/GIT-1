import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    int i = 0;
    double FibNumber = 0;
    double sqrt5 = Math.sqrt(5);
    double GoldenRatio = (1 + sqrt5) / 2;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a positive number to 2147483647: ");
    int number = input.nextInt();
    if (number > 0) {
      while (FibNumber < number) {
        FibNumber = Math.round(Math.pow(GoldenRatio, i) / sqrt5);
        i++;
      } if (number == FibNumber) {
        System.out.println("Your number is the Fibonacci number.");
      } else {
        System.out.println("Your number isn't the Fibonacci number.");
      }
    } else {
      System.out.println("Your number is negative.");
      System.exit(0);
    }   
  }
}
