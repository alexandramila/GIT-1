import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    try {
      DoubleArrays doubleArrays = new DoubleArrays();
      double[][] arrays = doubleArrays.initialize();
      Outputer outputer = new Outputer();
      outputer.outputArrays(arrays);
      ArrayList newArray = new DoubleArrays().createNewArray(arrays);
      if (new DoubleArrays().checkForNonEmpty(newArray)) {
        outputer.outputNewArray(newArray);
      } else {
        System.out.println("Array is empty.");
      }
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
