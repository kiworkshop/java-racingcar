import java.util.Objects;

public class CarName {

  public static final String ERROR_NAME_LENGTH_EXCEEDED = "이름이 5자 넘었습니다.";

  private String carName;

  private CarName(String carName) {
    validate(carName);
    this.carName = carName;
  }

  public static CarName of(String carName) {
    return new CarName(carName);
  }

  private void validate(String carName) {
    if (carName.length() > 5) {
      throw new IllegalArgumentException(ERROR_NAME_LENGTH_EXCEEDED);
    }
  }

  public String getName() {
    return carName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CarName carName1 = (CarName) o;
    return Objects.equals(carName, carName1.carName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carName);
  }
}
