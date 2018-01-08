import java.util.ArrayList;

/**
 * This class is for outputting arrays.
 */
public class Outputer {
  /**
   * Outputting an array of arrays.
   *
   * @param arrays the array of arrays
   */
  public void outputArrays(double[][] arrays) {
    for (int i = 0; i < arrays.length; i++) {
      for (int j = 0; j < arrays.length; j++) {
        System.out.print(arrays[i][j]);
      }
      System.out.println();
    }
  }

  /**
   * Outputting an new array.
   *
   * @param newArray the new array
   */
  public void outputNewArray(ArrayList newArray) {
    for (int i = 0; i < newArray.size(); i++) {
      System.out.println("New array: " + newArray);
    }
  }
}
