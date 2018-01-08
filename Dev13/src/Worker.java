/**
 *
 */
public class Worker {

  private int salary;
  private int productivity;
  String name;

  /**
   *
   */
  public Worker(int salary, int productivity, String name) {
    this.salary = salary;
    this.productivity = productivity;
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public int getProductivity() {
    return productivity;
  }

  public String getName() {
    return name;
  }

  /**
   * @return
   */
  public double productivityIntoSalary() {
    return this.productivity / this.salary;
  }
}
