/**
 *
 */
public class FirstCriterion extends Criterion {

  /**
   *
   */
  public FirstCriterion(int amount, int productivity) {
    super(amount, productivity);
  }

  /**
   *
   */
  public void criterionDescription() {
    int finalProductivity = 0;
    int countJunior = 0;
    int countMiddle = 0;
    int countSenior = 0;
    int countLead = 0;
    Worker[] workers = sortByProductivity();
    while (fixedAmount > workers[3].getSalary()) {
      if (fixedAmount >= workers[0].getSalary()) {
        fixedAmount -= workers[0].getSalary();
        finalProductivity += workers[0].getProductivity();
        countJunior++;
      } else if (fixedAmount < workers[0].getSalary() && fixedAmount >= workers[1].getSalary()) {
        fixedAmount -= workers[1].getSalary();
        finalProductivity += workers[1].getProductivity();
        countMiddle++;
      } else if (fixedAmount < workers[1].getSalary() && fixedAmount >= workers[2].getSalary()) {
        fixedAmount -= workers[2].getSalary();
        finalProductivity += workers[2].getProductivity();
        countSenior++;
      } else if (fixedAmount < workers[2].getSalary() && fixedAmount >= workers[3].getSalary()) {
        fixedAmount -= workers[3].getSalary();
        finalProductivity += workers[3].getProductivity();
        countLead++;
      }
      if (fixedAmount < workers[3].getSalary()) {
        break;
      }
    }
    if (finalProductivity < fixedProductivity) {
      System.out.println("Sorry, we can not complete your task.");
    } else {
      StringBuilder out = new StringBuilder();
      out.append(workers[0].getName()).append(" ");
      out.append(countJunior).append(",");
      out.append(workers[1].getName()).append(" ");
      out.append(countMiddle).append(",");
      out.append(workers[2].getName()).append(" ");
      out.append(countSenior).append(",");
      out.append(workers[3].getName()).append(" ");
      out.append(countLead).append(".");
      System.out.println(out);
    }
  }
}
