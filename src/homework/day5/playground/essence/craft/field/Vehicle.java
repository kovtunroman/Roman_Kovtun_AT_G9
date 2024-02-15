package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;

    public Vehicle(int weight, String name) {
        super(weight, weight);
        this.name = name;
    }

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

    @Override
    public int move(int pointA, int pointB) {
        System.out.printf("\n I am %s, my name is %s and I am moving from point %s to point %s", this.getClass().getSimpleName(),
                this.getName(), pointA, pointB).println();
        return Math.abs(pointB - pointA);
    }

    @Override
    public void drive(String direction) {
        System.out.printf("\n I am %s, my name is %S and I amd driving to %S", this.getClass().getSimpleName(),
                this.getName(), direction).println();
    }
}
