package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;

public abstract class Vehicle extends Matter {
    protected String name;

    public Vehicle(String name, int weight, int mass) {
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
