class Car {
  private String name;
  private int trialNum;
  private int movement;

  Car(String name) {
    this.name = name;
  }

  CarResult move() {
    trialNum += 1;
    if (RandomGenerator.getNumber() > 3) {
      movement += 1;
    }
    return new CarResult(name, trialNum, movement);
  }

  public String getName() {
    return name;
  }

  public int getTrialNum() {
    return trialNum;
  }

  public int getMovement() {
    return movement;
  }
}
