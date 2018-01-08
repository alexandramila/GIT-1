import java.util.Arrays;

import static org.junit.Assert.*;

public class CollectionElementsCounterTest {
  @org.junit.Test
  public void countRepetitiveElementsTest() throws Exception {
    assertEquals(3, new CollectionElementsCounter(Arrays.asList(0, 1, 1, 2, 2, 3, 3, 4)).countRepetitiveElements());
    assertEquals(1, new CollectionElementsCounter(Arrays.asList(0, 0, 0, 0)).countRepetitiveElements());
    assertEquals(0, new CollectionElementsCounter(Arrays.asList(0, 1, 2, 3, 4)).countRepetitiveElements());
    assertEquals(0, new CollectionElementsCounter(Arrays.asList(0, 2)).countRepetitiveElements());
    try {
      assertEquals(0, new CollectionElementsCounter(Arrays.asList()).countRepetitiveElements());
      assertEquals(0, new CollectionElementsCounter(Arrays.asList(1, 1, "hi", 5.2)).countRepetitiveElements());
      assertEquals(0, new CollectionElementsCounter(Arrays.asList(0)).countRepetitiveElements());
    } catch (Exception e) {
    }
  }
}
