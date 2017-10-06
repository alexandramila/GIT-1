import java.util.HashMap;

/**
 * Class contains method that performs the process of transliteration
 * from Cyrillic to Latin or from Latin to Cyrillic.
 */
public class Transliterator {

  /**
   * Performs the process of transliteration from Cyrillic to Latin
   * or from Latin to Cyrillic.
   *
   * @param text       a string that will be translated
   * @param dictionary Cyrillic to Latin or Latin to Cyrillic dictionary
   * @return transliterated string
   */
  public String translit(String text, HashMap dictionary) {
    String output = "";
    for (int i = 0; i < text.length(); i++) {
      String key = text.substring(i, i + 1);
      if (dictionary.containsKey(key)) {
        output = output + dictionary.get(key);
      } else {
        output = output + key;
      }
    }
    return output;
  }
}
