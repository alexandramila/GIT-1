public class Main {
  public static void main(String[] args) {
    String[] array = {"sweet", "APPLE"}; //to do - read from the console
    StringsReplacer replacer = new StringsReplacer();
    try {
      System.out.println("First sequence: " + array[0]);
      System.out.println("Second sequence: " + array[1]);
      System.out.println(replacer.picksRandomPlaces(array));
    } catch (IllegalArgumentException e) {
      System.out.println("Error, you need to enter only 2 sequences.");
    }
  }
}
