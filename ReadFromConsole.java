/**
 * Reads data entered by a user from a console.
 * @param args   the data that was entered by the user
 *               in the console
 * @return true  when the data has been entered
 * @return false when the user didn't entered the data in the console  
 */
class ReadFromConsole {
  public static boolean read(String[] args) {
    if (args.length != 0) {
      return true;
    } else {
      return false;
    }
  }
}