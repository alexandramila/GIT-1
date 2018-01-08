import java.util.*;

/**
 * This class checks the path to the file.
 */
public class PathValidator {
  private String path;
  private char[] pathChar;
  static private final String[] CONST_INVALIDSYMBOLS = {"?", "<", ">", "|", "*", "\""};
  static private final String[] CONST_RESERVEDWORDS = {"CON", "PRN", "AUX", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7",
          "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};
  private ArrayList<String> directoriesAndFiles = new ArrayList<>();
  static private final int CONST_LOWA = 97;
  static private final int CONST_LOWZ = 122;
  static private final char CONST_COLON = ':';
  static private final String CONST_STRINGSLASH = "/";
  static private final char CONST_CHARSLASH = '/';
  static private final char CONST_DOT = '.';

  /**
   * Constructor for this class.
   *
   * @param path the path that has to be checked
   * @throws throw an exception if the path is empty
   */
  public PathValidator(String path) {
    if (path.length() == 0) {
      throw new IllegalArgumentException();
    } else {
      this.path = path;
      pathChar = path.toCharArray();
    }
  }

  /**
   * This method calls all sorts of checks for the path.
   *
   * @return true if the path is valid
   */
  public boolean validation() {
    return (checkColon() && checkReservedWords() && checkInvalidSymbols() && checkDotCombination());
  }

  private boolean checkColon() {
    for (int i = 0; i < pathChar.length; i++) {
      if (pathChar[i] == CONST_COLON && i != 1) {
        return false;
      }
    }
    if (pathChar.length > 2 && pathChar[1] == CONST_COLON) {
      return (checkFullPathBeginning());
    }
    if (path.startsWith(CONST_STRINGSLASH) && path.startsWith(CONST_STRINGSLASH, 1)) {
      return true;
    }
    return true;
  }

  private boolean checkFullPathBeginning() {
    String lowerCasePath = path.toLowerCase();
    char[] lowerCasePathChar = lowerCasePath.toCharArray();
    for (int i = CONST_LOWA; i <= CONST_LOWZ; i++) {
      if (lowerCasePathChar[0] == i) {
        return true;
      }
    }
    return false;
  }

  private boolean checkReservedWords() {
    splitPath();
    for (int i = 0; i < directoriesAndFiles.size(); i++) {
      for (int j = 0; j < CONST_RESERVEDWORDS.length; j++) {
        if (directoriesAndFiles.toArray()[i].equals(CONST_RESERVEDWORDS[j])) {
          return false;
        }
      }
    }
    return true;
  }

  private void splitPath() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < pathChar.length; i++) {
      if (pathChar[i] != CONST_CHARSLASH && pathChar[i] != CONST_COLON) {
        stringBuilder.append(pathChar[i]);
      } else if ((pathChar[i] == CONST_CHARSLASH || pathChar[i] == CONST_COLON) && stringBuilder.length() != 0) {
        directoriesAndFiles.add(stringBuilder.toString());
        stringBuilder.delete(0, stringBuilder.length());
      }
      if (i == pathChar.length - 1 && stringBuilder.length() != 0) {
        directoriesAndFiles.add(stringBuilder.toString());
      }
    }
  }

  private boolean checkInvalidSymbols() {
    for (int i = 0; i < CONST_INVALIDSYMBOLS.length; i++) {
      if (path.contains(CONST_INVALIDSYMBOLS[i])) {
        return false;
      }
    }
    return true;
  }

  private boolean checkDotCombination() {
    if (path.length() > 2) {
      if (pathChar[pathChar.length - 1] == CONST_DOT && pathChar[pathChar.length - 2] == CONST_CHARSLASH) {
        return false;
      }
    }
    for (int i = 1; i < pathChar.length; i++) {
      if (pathChar[i] == CONST_DOT && pathChar[i - 1] == CONST_CHARSLASH && pathChar[i + 1] == CONST_CHARSLASH) {
        return false;
      }
    }
    return true;
  }
}
