import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SorterTest {
  @Test
  public void testCallMethods() throws Exception {
    List<Car> notSorted = new ArrayList();
    notSorted.add(new Car("bb", "1", " aa", 5));
    notSorted.add(new Car("kk", "4", "zz", 5));
    notSorted.add(new Car("aa", "2", "kk", 5));
    notSorted.add(new Car("ii", "3", " kk", 5));

    List<Car> sorted = new ArrayList();
    sorted.add(new Car("bb", "1", "aa", 5));
    sorted.add(new Car("aa", "2", "kk", 5));
    sorted.add(new Car("ii", "3", "kk", 5));
    sorted.add(new Car("kk", "4", "zz", 5));

    assertEquals(new Sorter(notSorted).callMethods(), sorted);
  }
}
