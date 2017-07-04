/**
 * Reads data entered by a user from a command line.
 */
class CommandLineArguments {
  /**
   * Checks if data has been entered via the command line.
   * @param args   the data that was entered by the user
   *               in the command line
   * @return the sequance  
   */
  public String[] sequenceCommandLine(String[] args) {
    if (args.length != 0) {
      return args;
    } else {
      ReadFromConsole read = new ReadFromConsole();
      return read.readSequenceConsole();
    }
  }
}
