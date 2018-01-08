/**
 * This class creates car.
 */
public class Car {
  private String carBrand;
  private String carModel;
  private String carType;
  private int carPrice;

  /**
   * This constructor initializes the fields of the car.
   *
   * @param carBrand the brand of the car
   * @param carModel the model of the car
   * @param carType  the type of the car
   * @param carPrice the price of the car
   */
  public Car(String carBrand, String carModel, String carType, int carPrice) {
    this.carBrand = carBrand;
    this.carModel = carModel;
    this.carType = carType;
    this.carPrice = carPrice;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public String getCarModel() {
    return carModel;
  }

  public String getCarType() {
    return carType;
  }

  public int getCarPrice() {
    return carPrice;
  }
}
