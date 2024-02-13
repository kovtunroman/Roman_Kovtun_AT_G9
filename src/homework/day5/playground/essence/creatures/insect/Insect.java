package homework.day5.playground.essence.creatures.insect;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.creatures.plant.vegetable.Carrot;

public abstract class Insect extends Matter {
    protected String name;

    public Insect(String name, int weight, int mass) {
        super(weight, mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void nest(Carrot home) {
        if (weight < home.getWeight()) {
            System.out.printf("I am %s and I will nest there with %s my family members!", name, (home.getWeight() / weight)).println();
        } else {
            System.out.printf("This carrot is too small for nesting :(\n").println();
        }
    }
}
