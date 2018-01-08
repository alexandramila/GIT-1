import java.util.ArrayList;
import java.util.List;

/**
 * This class contains battle algorithm.
 */
public class Battle {

  private List<Coordinate> ships = new ArrayList<>();
  private List<Coordinate> field = new ArrayList<>();
  private ConsoleReader reader;
  private int shotsCount = 0;
  private int fallenShipsCount = 0;
  static private final String CONST_KILLED_MESSAGE = "One ship shot down.";
  //static private final String CONST_MISSED_MESSAGE = "Missed.";

  /**
   * This constructor initializes the fields of the game.
   *
   * @param ships placed ships
   * @param field a battlefield
   */
  public Battle(List<Coordinate> ships, List<Coordinate> field, ConsoleReader reader) {
    this.ships = ships;
    this.field = field;
    this.reader = reader;
  }

  /**
   * This method shots the ships.
   */
  public void playTheGame() {
    shotsCount++;
    while (ships.size() != 0) {
      for (Coordinate ship : ships) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ship.getNumber()).append(ship.getLetter());
        if (stringBuilder.toString().equals(reader.readCoordinate())/*letter == ship.getLetter() && number == ship.getNumber()*/) {
          System.out.println(CONST_KILLED_MESSAGE);
          ships.remove(ship);
          fallenShipsCount++;
          break;
        }/* else {
          System.out.println(CONST_MISSED_MESSAGE);
        }*/
      }
    }
  }

  /**
   * This method prints info about results of the game.
   *
   * @return info about number of shots and downed ships
   */
  public StringBuilder printInfo() {
    StringBuilder info = new StringBuilder();
    info.append("Shots count = ").append(shotsCount).append(", fallen ships count = ").append(fallenShipsCount);
    return info;
  }
}
