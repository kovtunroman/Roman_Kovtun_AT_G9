package homework.day5.playground.essence.creatures.animal.vertebrata;

import homework.day5.playground.essence.creatures.animal.Animal;

public class Pigeon extends Vertebrata {
    public Pigeon(int weight, String name) {
        super(weight, name);
    }

    public Pigeon(String name, int weight, int mass) {
        super(name, weight, mass);
    }
}
