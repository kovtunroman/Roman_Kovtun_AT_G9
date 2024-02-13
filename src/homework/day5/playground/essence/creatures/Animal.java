package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

public abstract class Animal extends Matter {
    protected String name;

    public Animal(String name, int weight, int mass) {
        super(weight, mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant plant) {
        System.out.printf("I am %s and I am eating %s", name, plant.getName()).println();
    }
}
