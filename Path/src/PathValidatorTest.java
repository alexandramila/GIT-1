import static org.junit.Assert.*;

public class PathValidatorTest {
  @org.junit.Test
  public void validationPositiveTest() throws Exception {
    assertTrue(new PathValidator("d").validation());
    assertTrue(new PathValidator("d:/jdh/lj/").validation());
    assertTrue(new PathValidator("//kmlj/bljfb").validation());
    assertTrue(new PathValidator("/kmlj/bljfb/").validation());
    assertTrue(new PathValidator("../jdh/lj/l54fb").validation());
    assertTrue(new PathValidator("./jdh/lj/b/").validation());
    assertTrue(new PathValidator("D:hbdCOM1/HGJ").validation());
    assertTrue(new PathValidator("..//.../..//").validation());
    assertTrue(new PathValidator("......../jdh/lj/").validation());
    assertTrue(new PathValidator("ddh/lj/jfb/").validation());
  }

  @org.junit.Test
  public void validationNegativeTest() throws Exception {
    assertFalse(new PathValidator("H::jdh/lj/ljfb/").validation());
    assertFalse(new PathValidator("5:/jdh/lj/fb/").validation());
    assertFalse(new PathValidator("d:/jdh/./lj").validation());
    assertFalse(new PathValidator("/jdh/lj/jfb/.").validation());
    assertFalse(new PathValidator("d:/j?dh/lj/bljf?b/").validation());
    assertFalse(new PathValidator("./j<dh/lj/>blb/").validation());
    assertFalse(new PathValidator("//jdh|lj/bl|jfb/").validation());
    assertFalse(new PathValidator("../j*dh/lj/bljfb/").validation());
    assertFalse(new PathValidator("jdh/l\"j/bljfb/").validation());
    assertFalse(new PathValidator("//CON/hbjhd/HGJ").validation());
    try {
      assertFalse(new PathValidator("").validation());
      fail();
    } catch (Exception e) {}
  }
}
