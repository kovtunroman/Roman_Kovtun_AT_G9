package homework.day5.playground.essence.creatures.animal.vertebrata;

import homework.day5.playground.essence.creatures.animal.Animal;

public class Raven extends Vertebrata {
    public Raven(int weight, String name) {
        super(weight, name);
    }

    public Raven(String name, int weight, int mass) {
        super(name, weight, mass);
    }
}
