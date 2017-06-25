import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    boolean test = true; 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter numerical sequence /please use space while entering/:");
    String s = input.nextLine();
    String gaps[] = s.split(" "); 	
    int seq[] = new int[gaps.length];  
    for (int i = 1; i < seq.length; i++) {
      if (seq[i] >= seq[i-1]) {
        test = true;
      } else {
        test = false;
        break;
      }
    } 
    if (test == true) {
      System.out.println("Your numerical sequence is non-decreasing.");
    } else {
      System.out.println("Your numerical sequence is decreasing.");
    }
  }
}
