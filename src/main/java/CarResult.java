class CarResult {
  private String name;
  private int trialNum;
  private int distance;

  CarResult(String name, int trialNum, int distance) {
    this.name = name;
    this.trialNum = trialNum;
    this.distance = distance;
  }

  void printDistance() {
    System.out.print(name + ":");
    for (int i = 0; i < distance; i++) {
      System.out.print("-");
    }
    System.out.println();
  }

  public String getName() {
    return name;
  }

  int getDistance() {
    return distance;
  }
}
