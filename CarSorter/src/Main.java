import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Car> listOrCars = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("How many cars do you want to enter?");
      int numberOfCars = scanner.nextInt();
      scanner.nextLine();
      int count = 0;
      while (count <= numberOfCars) {

        System.out.println("Enter car brand:");
        String brand = scanner.nextLine();
        System.out.println("Enter car model:");
        String model = scanner.nextLine();
        System.out.println("Enter car type:");
        String type = scanner.nextLine();
        System.out.println("Enter car price:");
        int price = scanner.nextInt();
        scanner.nextLine();
        listOrCars.add(new Car(brand, model, type, price));
        count++;
      }
      Sorter sorter = new Sorter(listOrCars);
      System.out.println(sorter.callMethods());
    } catch (Exception e) {
      System.out.print("Exception " + e.getMessage());
    }
  }
}
