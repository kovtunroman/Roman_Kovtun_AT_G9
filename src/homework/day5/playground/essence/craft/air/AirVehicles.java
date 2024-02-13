package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Matter;

public abstract class AirVehicles extends Matter {
    protected String name;

    public AirVehicles(String name, int weight, int mass) {
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
