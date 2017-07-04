/**
 * Reads data entered by a user from a console.
 */
class ReadFromConsole {
   /**
   * Checks if data has been entered via the console.
   * @param args   the data that was entered by the user
   *               in the console
   * @return true  when the data has been entered
   *         false when the user didn't entered the data in the console  
   */
  public boolean readSequence(String[] args) {
    if (args.length != 0) {
      return true;
    } else {
      return false;
    }
  }
}
