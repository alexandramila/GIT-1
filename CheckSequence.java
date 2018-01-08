/**
 * Analyzes the sequence that was entered by the user.
 */
class CheckSequence {

  /**
   * Determines whether the sequence is non-decreasing.
   *
   * @param gaps the sequence that was entered by the user
   *             and that must be checked.
   */
  public boolean checkNondecreasing(String[] gaps) {
    for (int i = 1; i < gaps.length; i++) {
      if (Integer.parseInt(gaps[i]) < Integer.parseInt(gaps[i - 1])) {
        return false;
      }
    }
    return true;
  }
}
