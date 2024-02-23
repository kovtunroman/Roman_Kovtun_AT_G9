package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;

import java.io.Serializable;

public class Copter extends AirVehicles implements Flyable,Serializable {
    public Copter(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    public Copter(int weight, String name) {
        super(weight, name);
    }

    @Override
    public String toString() {
        return String.format("Helicopter: name = %s, mass = %s", getName(), getWeight());
    }
}
