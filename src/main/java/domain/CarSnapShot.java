package domain;

import util.StringUtils;

public class CarSnapShot {

    private String name;
    private int position;

    public CarSnapShot(String name, int position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return name + ":" + StringUtils.multiply("-", position);
    }

}
