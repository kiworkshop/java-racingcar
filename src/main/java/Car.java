import java.util.Objects;

public class Car {

  private CarName carName;
  private int position;

  private Car(CarName carName) {
    this.carName = carName;
  }

  public static Car with(CarName carName) {
    return new Car(carName);
  }

  public CarSnapShot getCarSnapShot() {
    return CarSnapShot.of(carName.getName(), position);
  }

  public void go() {
    if (RandomNumGenerator.isGreaterThanCriterion()) {
      position++;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return position == car.position &&
        Objects.equals(carName, car.carName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carName, position);
  }
}
