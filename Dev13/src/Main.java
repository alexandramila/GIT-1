import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int amount = 100000000;
    int productivity = 50000;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter criterion (1, 2 or 3): ");
    int choiceOfCriterion = scanner.nextInt();

    switch (choiceOfCriterion) {
      case 1:
        Structure context = new Structure(new FirstCriterion(amount, productivity));
        context.executeOperation();
        break;
      case 2:
        context = new Structure(new SecondCriterion(amount, productivity));
        context.executeOperation();
        break;
      case 3:
        context = new Structure(new ThirdCriterion(amount, productivity));
        context.executeOperation();
        break;
      default:
        System.out.println("You entered an incorrect number.");
        break;
    }
  }
}
