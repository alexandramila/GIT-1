import java.util.Scanner;

/**
 * This class reads data entered by a user from a console.
 */
public class ConsoleReader implements IReader {

  private Scanner scanner = new Scanner(System.in);

  /**
   * Reads an entered coordinate from the console.
   *
   * @return the entered coordinate
   */
  @Override
  public String readCoordinate() {
    System.out.println("Input the coordinate: ");
    return (scanner.nextLine());
  }
}
