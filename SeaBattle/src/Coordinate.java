/**
 * This class contains coordinates of the ship.
 */
public class Coordinate {
  private int number;
  private char letter;

  /**
   * This constructor initializes the fields of the coordinate.
   *
   * @param letter a letter
   * @param number a number
   */
  public Coordinate(char letter, int number) {
    this.letter = letter;
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public char getLetter() {
    return letter;
  }
}
