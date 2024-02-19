package homework.day5.playground.essence.craft.hand;

public class Can extends Container implements Storable {
    public Can(int weight, String name) {
        super(weight, name);
    }

    public Can(String name, int weight, int mass) {
        super(name, weight, mass);
    }
}
