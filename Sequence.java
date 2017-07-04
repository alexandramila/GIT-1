public class Sequence {
  public static void main(String[] args) {
    ReadFromCommandLine read = new ReadFromCommandLine();
    CheckSequence check = new CheckSequence();
    try {
      if (check.checkNondecreasing(read.readSequenceCommandLine(args))) {
        System.out.println("Your numerical sequence is non-decreasing.");
      } else {
        System.out.println("Your numerical sequence is not non-decreasing.");
      }
      return;
    } catch (Exception e) {
      System.out.println("You've entered invalid number format.");
    }
  }
}
