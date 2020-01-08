import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rule {
  private static final Random random = new Random();

  public static List<Integer> getPositions(int round) {
    List<Integer> positions = new ArrayList<>();

   for (int i = 0; i < round; i++) {
     int change = getPositionChange();
     if (i == 0) {
        positions.add(change);
        continue;
     }
     positions.add(change + positions.get(i - 1));
   }
   return positions;
  }

  private static int getPositionChange() {
    int randomNumber = random.nextInt(10);
    if (randomNumber >= 4) {
      return 1;
    }
      return 0;
  }
}
