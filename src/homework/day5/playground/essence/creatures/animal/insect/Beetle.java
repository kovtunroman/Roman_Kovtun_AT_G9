package homework.day5.playground.essence.creatures.animal.insect;

import homework.day5.playground.essence.creatures.Crawlable;
import homework.day5.playground.essence.creatures.plant.vegetable.Carrot;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

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

    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units", getClass().getSimpleName(), getName(), direction, distance).println();
        System.out.println("vz-vz-vzz-zz..");
    }
}
