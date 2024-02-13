package homework.day5.playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    public Vertebrata(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    public void eat(Insect food) {
        System.out.printf("I am %s and I am eating %s", name, food.getName()).println();
    }
}
