package homework.day5.playground.essence.creatures.animal.insect;

import homework.day5.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int weight, String name) {
        super(weight, name);
    }

    public Mosquito(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(),
                getName(), direction).println();
    }
}
