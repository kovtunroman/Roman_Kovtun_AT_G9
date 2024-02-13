package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

public abstract class Vegetable extends Matter {
    protected String name;

    public Vegetable(String name, int weight, int mass) {
        super(weight, mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
