import java.util.Scanner;

/**
 * Reads data entered by a user from a console.
 */
class ReadFromConsole {

  /**
   * Reads the data from the console.
   *
   * @return the sequance
   */
  public String[] readSequenceConsole() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numerical sequence /please use space while entering/:");
    String s = scanner.nextLine();
    String gaps[] = s.split(" ");
    return s.split(" ");
  }
}
