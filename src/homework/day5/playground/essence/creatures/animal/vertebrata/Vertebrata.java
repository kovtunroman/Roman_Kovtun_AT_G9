package homework.day5.playground.essence.creatures.animal.vertebrata;

import homework.day5.playground.essence.creatures.animal.Animal;
import homework.day5.playground.essence.creatures.animal.insect.Insect;

public abstract class Vertebrata extends Animal {
    public Vertebrata(int weight, String name){
        super(weight, name);
    }
    public Vertebrata(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    public void eat(Insect food) {
        System.out.printf("I am %s and I am eating %s", name, food.getName()).println();
    }
}
