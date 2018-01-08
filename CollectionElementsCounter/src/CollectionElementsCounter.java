import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class works with collection.
 */
public class CollectionElementsCounter {
  private int count = 0;
  private List userObjects = new ArrayList();

  /**
   * Constructor for this class.
   *
   * @param userObjects collection that was entered by user
   */
  public CollectionElementsCounter(List userObjects) {
    if (userObjects.size() < 2) {
      throw new IllegalArgumentException();
    } else {
      this.userObjects = userObjects;
    }
  }

  /**
   * This method counts the elements in the collection that repeat.
   *
   * @return number of repeating elements
   */
  public int countRepetitiveElements() {
    Collections.sort(userObjects);
    //userObjects.sort(integerComparator);
    for (int i = 1; i < userObjects.size() - 1; i++) {
      if (userObjects.get(i).equals(userObjects.get(i - 1)) && (!userObjects.get(i).equals(userObjects.get(i + 1)))) {
        count++;
      }
    }
    if (userObjects.get(userObjects.size() - 2).equals(userObjects.get(userObjects.size() - 1))) {
      count++;
    }
    return count;
  }

  //private void sortCollection() {
    //userObjects.sort(integerComparator);
  //}

  static private Comparator<Integer> integerComparator = new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
      if (o1 < o2) {
        return -1;
      } else if (o1 > o2) {
        return 1;
      } else {
        return 0;
      }
    }
  };

  static private Comparator<Double> doubleComparator = new Comparator<Double>() {
    @Override
    public int compare(Double o1, Double o2) {
      if (o1 < o2) {
        return -1;
      } else if (o1 > o2) {
        return 1;
      } else {
        return 0;
      }
    }
  };

  static private Comparator<String> stringComparator = new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
      if (o1.equals(o2)) {
        return 0;
      }
      return 1;
    }
  };
}
