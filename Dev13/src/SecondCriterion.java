/**
 *
 */
public class SecondCriterion extends Criterion {

  /**
   *
   */
  public SecondCriterion(int amount, int productivity) {
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
    while (fixedProductivity > sorted[3].getProductivity()) {
      if (fixedProductivity >= sorted[0].getProductivity()) {
        fixedProductivity -= sorted[0].getProductivity();
        fixedAmount -= sorted[0].getSalary();
        countJunior++;
      } else if (fixedProductivity < sorted[0].getProductivity() &&
              fixedProductivity >= sorted[1].getProductivity()) {
        fixedProductivity -= sorted[1].getProductivity();
        fixedAmount -= sorted[1].getSalary();
        countMiddle++;
      } else if (fixedProductivity < sorted[1].getProductivity() &&
              fixedProductivity >= sorted[2].getProductivity()) {
        fixedProductivity -= sorted[2].getProductivity();
        fixedAmount -= sorted[2].getSalary();
        countSenior++;
      } else if (fixedProductivity < sorted[2].getProductivity() &&
              fixedProductivity >= sorted[3].getProductivity()) {
        fixedProductivity -= sorted[3].getProductivity();
        fixedAmount -= sorted[3].getSalary();
        countLead++;
      }
      if (fixedProductivity < sorted[3].getProductivity()) {
        break;
      }
    }
    if (fixedAmount < 0 && fixedProductivity != 0) {
      System.out.println("Sorry, we cannot help you");
    } else {
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
}
