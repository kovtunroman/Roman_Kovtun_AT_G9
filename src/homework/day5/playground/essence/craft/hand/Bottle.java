package homework.day5.playground.essence.craft.hand;

public class Bottle extends Container implements Storable {
    public Bottle(int weight, String name) {
        super(weight, name);
    }

    public Bottle(String name, int weight, int mass) {
        super(name, weight, mass);
    }
}
