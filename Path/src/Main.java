public class Main {

  public static void main(String[] args) {
    try {
      PathValidator path = new PathValidator("ldhabfjb/CON.txt");
      if (path.validation()) {
        System.out.println("This path is valid.");
      } else {
        System.out.println("This path is not valid.");
      }
    } catch (Exception e) {
      System.out.println("Exception " + e.getMessage());
    }
  }
}
