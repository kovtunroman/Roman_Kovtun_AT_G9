package homework.day5.playground.essence.craft.hand;

public class Mug extends Container{
    public Mug(int weight, String name) {
        super(weight, name);
    }
    public Mug(String name, int weight, int mass) {
        super(name, weight, mass);
    }
}
