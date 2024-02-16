package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Transportable;

public abstract class AirVehicles extends Matter implements Flyable, Transportable {
    protected String name;

    public AirVehicles(int weight, String name) {
        super(weight, weight);
        this.name = name;
    }

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

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(),
                this.getName(), direction).println();
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.printf("\n I am %s, my name is %s and I am moving from point %s to point %s", this.getClass().getSimpleName(),
                this.getName(), pointA, pointB).println();
        return Math.abs(pointB - pointA);
    }
}
