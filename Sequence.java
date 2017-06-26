import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numerical sequence /please use space while entering/:");
    String s = scanner.nextLine();
    String gaps[] = s.split(" "); 	
    int sequence[] = new int[gaps.length];  
    try {
      for (int i = 0; i < gaps.length; i++) {
        sequence[i] = Integer.parseInt(gaps[i]);
      }
    } catch (Exception e) {
        System.out.println("You've entered invalid number format.");
        return;
      }
    for (int i = 1; i < sequence.length; i++) {
      if (sequence[i] < sequence[i-1]) {
        System.out.println("Your numerical sequence is not non-decreasing.");
        return;
      }
    } 
    System.out.println("Your numerical sequence is non-decreasing.");
  }
}
