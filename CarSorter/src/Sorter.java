import java.util.Comparator;
import java.util.List;

/**
 * This class sorts the cars by price, type, brand and model.
 */
public class Sorter {
  private List<Car> listOfCars;

  /**
   * This constructor initializes list of cars.
   *
   * @param listOfCars the not sorted list of the cars
   */
  public Sorter(List listOfCars) {
    this.listOfCars = listOfCars;
  }

  /**
   * Calls methods that sorts the list of cars and
   * the method that print the sorted list of cars.
   */
  public List<Car> callMethods() {
    listOfCars.sort(sortByPriceComparator);
    outputCars();
    return listOfCars;
  }

  private Comparator<Car> sortByPriceComparator = new Comparator<Car>() {
    @Override
    public int compare(Car o1, Car o2) {
      if (o1.getCarPrice() == o2.getCarPrice() && o1.getCarType().equals(o2.getCarType())) {
        return o1.getCarBrand().compareTo(o2.getCarBrand());
      }
      if (o1.getCarPrice() == o2.getCarPrice()) {
        return o1.getCarType().compareTo(o2.getCarType());
      }
      if (o1.getCarPrice() < o2.getCarPrice()) {
        return -1;
      } else if (o1.getCarPrice() > o2.getCarPrice()) {
        return 1;
      }
      return 0;
    }
  };

  /*private Comparator<Car> sortByTypeComparator = new Comparator<Car>() {
    @Override
    public int compare(Car o1, Car o2) {
      if (o1.getCarPrice() == o2.getCarPrice()) {
        return o1.getCarType().compareTo(o2.getCarType());
      }
      return 1;
    }
  };

    private Comparator<Car> sortByBrandComparator = new Comparator<Car>() {
      @Override
      public int compare(Car o1, Car o2) {
        if (o1.getCarType().equals(o2.getCarType()) && o1.getCarBrand().equals(o2.getCarBrand())) {
          return 0;
        }
        return 1;
      }
    };*/


  /**
   * Displays sorted list of cars with all the characteristics.
   */
  private void outputCars() {
    for (int i = 0; i <= listOfCars.size(); i++) {
      System.out.println("Car number " + i + 1 + ":");
      System.out.print("BRAND: " + listOfCars.get(i).getCarBrand() + " ");
      System.out.print("MODEL: " + listOfCars.get(i).getCarModel() + " ");
      System.out.print("TYPE: " + listOfCars.get(i).getCarType() + " ");
      System.out.println("PRICE: " + listOfCars.get(i).getCarPrice() + " ");
    }
  }
}
