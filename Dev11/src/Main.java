import java.util.HashMap;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    try {
      DictionaryMaker dictionary = new DictionaryMaker();
      HashMap cyrillicLatinDictionary = new HashMap();
      cyrillicLatinDictionary = dictionary.createDictionary("C:\\Users\\alexa\\IdeaProjects\\Dev11\\src\\cyrillicToLatin.txt");
      HashMap latinCyrillicDictionary = new HashMap();
      latinCyrillicDictionary = dictionary.createDictionary("C:\\Users\\alexa\\IdeaProjects\\Dev11\\src\\latinToCyrillic.txt");
      String rus = "В ожидании чуда. Надеюсь, мне повезёт.";
      System.out.println(rus);
      Transliterator transliterator = new Transliterator();
      System.out.println(transliterator.translit(rus,cyrillicLatinDictionary ));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}