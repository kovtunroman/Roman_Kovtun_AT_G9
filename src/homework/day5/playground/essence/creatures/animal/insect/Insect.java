package homework.day5.playground.essence.creatures.animal.insect;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.creatures.animal.Animal;

public abstract class Insect extends Animal {
    protected String name;

    public Insect(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
