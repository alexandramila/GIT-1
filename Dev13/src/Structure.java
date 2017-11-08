/**
 *
 */
public class Structure {

  private Criterion criterion;

  /**
   *
   */
  public Structure(Criterion strategy) {
    criterion = strategy;
  }

  /**
   *
   */
  public void executeOperation() {
    criterion.criterionDescription();
  }
}
