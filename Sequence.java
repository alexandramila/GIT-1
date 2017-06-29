import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    ReadFromConsole read = new ReadFromConsole();
    if (read.read(args)) {
    } else {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter numerical sequence /please use space while entering/:");
      String s = scanner.nextLine();
      String gaps[] = s.split(" ");
      CheckSequence checking = new CheckSequence();
      checking.checkNondecreasing(gaps);
    }
  }
}

/**
 * Reads data entered by a user from a console.
 * If the user entered some data then call checking method.
 * @param args   the data that was entered by the user
 *               in the console
 * @return true  when the data has been entered
 * @return false when the user didn't entered the data in the console  
 */
class ReadFromConsole {
  public static boolean read(String[] args) {
    CheckSequence check = new CheckSequence();
    if (args.length != 0) {
      check.checkNondecreasing(args);
      return true;
    } else {
      return false;
    }
  }
}

/**
 * Determines whether the sequence is non-decreasing,
 * and displays the result on the screen.
 * @param gaps the sequence that was entered by the user
 *             and that must be checked.
 */
class CheckSequence {
  public static void checkNondecreasing(String[] gaps) {
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
