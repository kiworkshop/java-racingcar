public class Car {
  public Car() {}
  public Car(String name) {
    this.name = name;
  }

  private String name;
  private String movement = "";
  private int sumOfMovement;

  public void move() {
    double randomValue = Math.random();
    int intValue = (int)(randomValue * 10);
    if (intValue > 3) {
      this.sumOfMovement += 1;
      this.movement = this.movement + "-";
    }
  }

  public void showMovement() {
    System.out.println(name + " : " + movement);
  }

}
