package homework.day5.playground.essence.creatures.animal.insect;

import homework.day5.playground.essence.Crawlable;
import homework.day5.playground.essence.creatures.plant.vegetable.Carrot;

public class Beetle extends Insect implements Crawlable {
    public Beetle(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    public void nest(Carrot home) {
        if (weight < home.getWeight()) {
            System.out.printf("I am %s and I will nest there with %s my family members!", name, (home.getWeight() / weight)).println();
        } else {
            System.out.printf("This carrot is too small for nesting :(\n").println();
        }
    }
}
