public class Sequence {

  public static void main(String[] args) {
    CommandLineArguments read = new CommandLineArguments();
    CheckSequence check = new CheckSequence();
    try {
      if (check.checkNondecreasing(read.sequenceCommandLine(args))) {
        System.out.println("Your numerical sequence is non-decreasing.");
      } else {
        System.out.println("Your numerical sequence is not non-decreasing.");
      }
    } catch (Exception e) {
      System.out.println("You've entered invalid number format.");
    }
  }
}
