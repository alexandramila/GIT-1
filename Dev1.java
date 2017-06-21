public class Dev1 {
  public static void main(String[] args) {
    for (int n = 0; n <= 100; n++) {
      if ((n % 3 == 0) && (n % 5 == 0)) {
	System.out.println("Tutti-Frutti");
      } else if (n % 3 == 0) {
	System.out.println("Tutti");
      } else if (n % 5 == 0) {
	System.out.println("Frutti");
      } else {
	System.out.println(n);
      }
    }
  }
}
