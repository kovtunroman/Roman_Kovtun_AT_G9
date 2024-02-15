package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.Rideable;
import homework.day5.playground.essence.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
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
