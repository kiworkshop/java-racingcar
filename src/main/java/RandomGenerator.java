class RandomGenerator {
  static int getNumber() {
    double randomValue = Math.random();
    return (int)(randomValue * 10);
  }
}
