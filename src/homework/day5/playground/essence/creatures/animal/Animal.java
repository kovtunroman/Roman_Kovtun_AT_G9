package homework.day5.playground.essence.creatures.animal;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.creatures.plant.Plant;

public abstract class Animal extends Matter {
    protected String name;

    public Animal(int weight, String name){
        super(weight, weight);
        this.name = name;
    }
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
