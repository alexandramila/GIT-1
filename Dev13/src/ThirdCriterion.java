/**
 *
 */
public class ThirdCriterion extends Criterion {

  /**
   *
   */
  public ThirdCriterion(int amount, int productivity) {
    super(amount, productivity);
  }

  /**
   *
   */
  public void criterionDescription() {
    int countJunior = 0;
    int countMiddle = 0;
    int countSenior = 0;
    int countLead = 0;
    Worker[] sorted = sortByProductivity();
    if (fixedAmount < sorted[3].getSalary()) {
      System.out.println("Sorry, we can not complete your task.");
    }
    while (fixedAmount >= sorted[3].getSalary()) {
      fixedAmount -= sorted[3].getSalary();
      fixedProductivity -= sorted[3].getProductivity();
      countLead++;
    }
    if (fixedProductivity != 0) {
      System.out.println("Sorry, we can not complete your task.");
    }
    StringBuilder out = new StringBuilder();
    out.append(sorted[0].getName()).append(" ");
    out.append(countJunior).append(",");
    out.append(sorted[1].getName()).append(" ");
    out.append(countMiddle).append(",");
    out.append(sorted[2].getName()).append(" ");
    out.append(countSenior).append(",");
    out.append(sorted[3].getName()).append(" ");
    out.append(countLead).append(".");
    System.out.println(out);
  }
}
