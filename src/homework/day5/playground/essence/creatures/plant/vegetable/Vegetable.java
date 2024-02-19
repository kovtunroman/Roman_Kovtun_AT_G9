package homework.day5.playground.essence.creatures.plant.vegetable;

import homework.day5.playground.essence.creatures.plant.Plant;

public abstract class Vegetable extends Plant {
    public Vegetable(int weight, String name) {
        super(weight, name);
    }

    public Vegetable(String name, int weight, int mass) {
        super(name, weight, mass);
    }
}
