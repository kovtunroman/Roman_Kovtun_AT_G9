package homework.day5.playground.essence.creatures.plant.flower;

import homework.day5.playground.essence.creatures.plant.Plant;

public abstract class Flower extends Plant {

    public Flower(int weight, String name) {
        super(weight, name);
    }
    public Flower(String name, int weight, int mass) {
        super(name, weight, mass);
    }
}
