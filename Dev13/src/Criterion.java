import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */
abstract class Criterion {

  public int fixedAmount;
  public int fixedProductivity;
  private int amount;
  private int productivity;

  private Worker junior = new Worker(200, 100, "Junior");
  private Worker middle = new Worker(550, 500, "Middle");
  private Worker senior = new Worker(900, 1000, "Senior");
  private Worker lead = new Worker(1500, 2000, "Lead");

  /**
   *
   */
  public Criterion(int amount, int productivity) {
    this.amount = amount;
    this.productivity = productivity;
  }

  abstract public void criterionDescription();

  /**
   * @return
   */
  public Worker[] sortByProductivity() {
    Worker[] workers = {lead, senior, middle, junior};
    Arrays.sort(workers, new Comparator<Worker>() {
      public int compare(Worker a, Worker b) {
        return (int) (a.productivityIntoSalary() - b.productivityIntoSalary());
      }
    });
    return workers;
  }
}
