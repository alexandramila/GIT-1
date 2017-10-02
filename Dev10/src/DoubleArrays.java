import java.util.ArrayList;
import java.util.Random;

/**
 * This class contains methods that works with arrays.
 */
public class DoubleArrays {

  /**
   * Initializes an array of arrays with random length and elements.
   *
   * @return an array of arrays
   */
  public double[][] initialize() {
    Random random = new Random();
    double[][] arrays = new double[random.nextInt(5)][];
    for (int i = 0; i < arrays.length; i++) {
      arrays[i] = new double[random.nextInt(5)];
      for (int j = 0; j < arrays[i].length; j++) {
        arrays[i][j] = random.nextDouble() * (random.nextInt(21) - 10);
      }
    }
    return arrays;
  }

  /**
   * Creates a new array which contains elements that belong at least two arrays.
   *
   * @param arrays array of arrays
   * @return new array
   */
  public ArrayList createNewArray(double[][] arrays) {
    ArrayList newArray = new ArrayList();
    for (int i = 0; i < arrays.length - 1; i++) {
      for (int j = 0; j < arrays[i].length; j++) {
        int count = 1;
        for (int l = i + 1; l < arrays.length; l++) {
          for (int k = 0; k < arrays[l].length; k++) {
            if (Math.abs(arrays[i][j] - arrays[l][k]) < 10e-9) {
              count++;
              break;
            }
          }
          if (count >= 2) {
            if (!newArray.contains(arrays[i][j])) {
              newArray.add(arrays[i][j]);
            }
            break;
          }
        }
      }
    }
    return newArray;
  }

  /**
   * Checks new array is empty or not.
   *
   * @param array new array
   * @return true if the array is not empty
   */
  public boolean checkForNonEmpty(ArrayList array) {
    if (array.size() == 0) {
      return false;
    }
    return true;
  }
}
