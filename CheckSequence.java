/**
 * Analyzes the sequence that was entered by the user.
 */
class CheckSequence {
/**
 * Determines whether the sequence is non-decreasing,
 * and displays the result on the screen.
 * @param gaps the sequence that was entered by the user
 *             and that must be checked.
 */
  public static void checkNondecreasing(String[] gaps) {
    try {
      for (int i = 1; i < gaps.length; i++) {
        if (Integer.parseInt(gaps[i]) < Integer.parseInt(gaps[i-1])) {
          System.out.println("Your numerical sequence is not non-decreasing.");
          return;
        }
      }
      System.out.println("Your numerical sequence is non-decreasing.");
    } catch (Exception e) {
      System.out.println("You've entered invalid number format.");
      return;
    }
  }
}
