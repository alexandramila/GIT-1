import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    try {
      System.out.println("Number of repeating elements: " + new CollectionElementsCounter(Arrays.asList()).countRepetitiveElements());
    } catch (Exception e) {
      System.out.println("Exception " + e.getMessage());
    }
  }
}
