import java.util.Random;

/**
 * This class selects one random part from the second string to put it
 * in a random place in the first string
 */
public class StringsReplacer {

  /**
   * Picks random places in sequences
   *
   * @param array is strings that will be changed
   * @return result changing from another method
   */
  public String picksRandomPlaces(String[] array) {
    if (array.length != 2) {
      throw new IllegalArgumentException();
    }
    Random random = new Random();
    int firstIndex = random.nextInt(array[0].length());
    int firstLength = random.nextInt(array[0].length() - firstIndex);
    int secondIndex = random.nextInt(array[1].length());
    int secondLength = random.nextInt(array[1].length() - secondIndex);
    return replace(array, firstIndex, firstLength, secondIndex, secondLength);
  }

  /**
   * Replace random part from one string by another random part from another string
   *
   * @param array        two strings
   * @param firstIndex   the index from which the first random part begins
   * @param firstLength  the length of the first random part
   * @param secondIndex  the index from which the second random part begins
   * @param secondLength the length of the second random part
   * @return string which contains 2 parts from first string and one part from another
   */
  public String replace(String[] array, int firstIndex, int firstLength, int secondIndex, int secondLength) {
    String[] firstDivision = dividesIntoThreeParts(array[0], firstIndex, firstLength);
    String[] secondDivision = dividesIntoThreeParts(array[1], secondIndex, secondLength);
    String resultingArray = firstDivision[0] + secondDivision[1] + firstDivision[2];
    return resultingArray;
  }

  /**
   * Divides strings into 3 parts
   *
   * @param stringForDivide the string that will be divided
   * @param firstIndex      the index from which division starts
   * @param lengthOfPart    the length of the divided part
   * @return an array of parts into which the string was divided
   */
  public String[] dividesIntoThreeParts(String stringForDivide, int firstIndex, int lengthOfPart) {
    int lastIndex = firstIndex + lengthOfPart;
    String[] parts = new String[3];
    parts[0] = stringForDivide.substring(0, firstIndex);
    parts[1] = stringForDivide.substring(firstIndex, lastIndex);
    parts[2] = stringForDivide.substring(lastIndex, stringForDivide.length());
    return parts;
  }
}
