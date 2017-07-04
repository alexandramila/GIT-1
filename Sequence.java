import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    ReadFromConsole read = new ReadFromConsole();
    CheckSequence check = new CheckSequence();
    if (read.readSequence(args)) {
      check.checkNondecreasing(args);
    } else {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter numerical sequence /please use space while entering/:");
      String s = scanner.nextLine();
      String gaps[] = s.split(" ");
      check.checkNondecreasing(gaps);
    }
  }
}
