import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class fills field with ships.
 */
public class Field {
  static private final char CONST_LOW_A = 'a';
  static private final char CONST_LOW_J = 'j';
  static private final int CONST_TEN = 10;
  private List<Coordinate> field = new ArrayList<>();
  private List<Coordinate> ships = new ArrayList<>();
  private int numberOfShips = new Random().nextInt(25);

  /**
   * Creates a battlefield with the ships.
   */
  public void createField() {
    for (int i = 1; i <= CONST_TEN; i++) {
      for (char j = CONST_LOW_A; j <= CONST_LOW_J; j++) {
        field.add(new Coordinate(j, i));
      }
    }
    putShips();
  }

  private void putShips() {
    for (int i = 0; i <= numberOfShips; i++) {
      int indexOfCoordinateOfShip = new Random().nextInt(99);
      if (!addShipToField(field.get(indexOfCoordinateOfShip))) {
        i--;
      }
    }
  }

  private boolean addShipToField(Coordinate coordinate) {
    if (ships.size() == 0) {
      ships.add(coordinate);
    } else {
      for (Coordinate ship : ships) {
        if ((coordinate.getLetter() >= ship.getLetter() - 1 && coordinate.getNumber() >= ship.getNumber() - 1)
                && (coordinate.getLetter() <= ship.getLetter() + 1 && coordinate.getNumber() <= ship.getNumber() + 1)) {
          //throw new IllegalArgumentException("Cannot place two ships in one place. Please try again.");
          return false;
        }
      }
      ships.add(coordinate);
    }
    return true;
  }

  public List<Coordinate> getField() {
    return field;
  }

  public List<Coordinate> getShips() {
    return ships;
  }
}
