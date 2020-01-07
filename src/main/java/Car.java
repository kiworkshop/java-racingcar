public class Car {

    public static final double GO_FLOOR = 0.4;
    public static final String DELIMITER_PRINT_POSITION = " : ";
    public static final String PROGRESS_BAR = "-";
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

    private boolean isOverGoFloor() {
        return Math.random() >= GO_FLOOR;
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

}
