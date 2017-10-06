import java.io.*;
import java.util.HashMap;

/**
 * Class contains a method that builds dictionary from file.
 */
public class DictionaryMaker {

  /**
   * Creates a HashMap from a text file.
   *
   * @param file a name of the file
   * @return HashMap dictionary
   * @throws IOException if file doesn't exist
   */
  public HashMap createDictionary(String file) throws IOException {
    HashMap dictionary = new HashMap();
    FileInputStream fileInputStream = new FileInputStream(file);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
    String line;
    while ((line = bufferedReader.readLine()) != null) {
      String[] symbols = line.split("-");
      dictionary.put(symbols[0], symbols[1]);
    }
    return dictionary;
  }
}
