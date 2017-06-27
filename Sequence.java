import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numerical sequence /please use space while entering/:");
    String s = scanner.nextLine();
    String gaps[] = s.split(" "); 	 
    try {
      for (int i = 1; i < gaps.length; i++) {
        if (Integer.parseInt(gaps[i]) < Integer.parseInt(gaps[i-1])) {
          System.out.println("Your numerical sequence is not non-decreasing.");
          return;
        }
      }
      System.out.println("Your numerical sequence is non-decreasing.");
    } catch (Exception e) {
        System.out.println("You've entered invalid number format.");
        return;
      }
  }
}
