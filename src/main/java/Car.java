public class Car {

    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void go() {
        if (Math.random() >= 0.4) {
            position++;
        }
    }

    public void printPostion() {
        System.out.println(name + " : " + new String(new char[position]).replace("\0", "-"));
    }

    public int getPosition() {
        return this.position;
    }

    public void printWinnerName(int maxPosition) { //TODO ㅋㅋ
        if (maxPosition == position) {
            System.out.print(name);
        }
    }

}
