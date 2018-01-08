public class Main {

  public static void main(String[] args) {
    try {
      Field field = new Field();
      field.createField();
      //ConsoleReader reader = new ConsoleReader();
      Battle battle = new Battle(field.getShips(), field.getField(), new ConsoleReader());
      battle.playTheGame();
      System.out.println(battle.printInfo());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
