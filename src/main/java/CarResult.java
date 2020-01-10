class CarResult {
  private String name;
  private int trialNum;
  private int movement;

  CarResult(String name, int trialNum, int movement) {
    this.name = name;
    this.trialNum = trialNum;
    this.movement = movement;
  }

  void printMovement() {
    System.out.print(name + ":");
    for (int i = 0; i < movement; i++) {
      System.out.print("-");
    }
    System.out.println();
  }
}
