class Car {
  private String name;
  private int trialNum;
  private int distance;

  Car(String name) {
    this.name = name;
  }

  CarResult move() {
    trialNum += 1;
    if (RandomGenerator.getNumber() > 3) {
      distance += 1;
    }
    return new CarResult(name, trialNum, distance);
  }

  public String getName() {
    return name;
  }

  public int getTrialNum() {
    return trialNum;
  }

  public int getDistance() {
    return distance;
  }
}
