import java.util.Objects;

public class CarSnapShot {

  public static final String NULL = "\0";
  public static final String DELIMITER = "-";

  private String carName;
  private int position;

  private CarSnapShot(String carName, int position) {
    this.carName = carName;
    this.position = position;
  }

  public static CarSnapShot of(String carName, int position) {
    return new CarSnapShot(carName, position);
  }

  public void show() {
    System.out.println(carName + " : " + positionToString(position));
  }

  public String positionToString(int position) {
    return new String(new char[position]).replace(NULL, DELIMITER);
  }

  public int getPosition() {
    return position;
  }

  public boolean isGreaterThan(int maxPosition) {
    return position > maxPosition;
  }

  public boolean isSame(int maxPosition) {
    return position == maxPosition;
  }

  public String getName() {
    return carName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CarSnapShot that = (CarSnapShot) o;
    return position == that.position &&
        Objects.equals(carName, that.carName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carName, position);
  }
}
