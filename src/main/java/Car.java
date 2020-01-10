class Car {
  private String name;
  private int trialNum;
  private int movement;

  Car(String name) {
    this.name = name;
  }

  Car move() {
    trialNum += 1;
    if (RandomGenerator.getNumber() > 3) {
      movement += 1;
    }
    return this;
  }

  void printMovement() {
    System.out.println();
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
