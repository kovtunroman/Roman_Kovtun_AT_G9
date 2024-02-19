package homework.day5.playground.essence.creatures.animal.vertebrata;

import homework.day5.playground.essence.creatures.Crawlable;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int weight, String name){
        super(weight, name);
    }
    public Crocodile(String name, int weight, int mass) {
        super(name, weight, mass);
    }
}
