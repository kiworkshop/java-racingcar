public class Car {

    private static final double GO_THRESHOLD = 0.4;
    private static final String DELIMITER_PRINT_POSITION = " : ";
    private static final String PROGRESS_BAR = "-";
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void go() {
        if (isOverGoFloor()) {
            position++;
        }
    }

    public void printPostion() {
        System.out.println(name + DELIMITER_PRINT_POSITION + new String(new char[position]).replace("\0", PROGRESS_BAR));
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return name;
    }

    private boolean isOverGoFloor() {
        return Math.random() >= GO_THRESHOLD;
    }
}
