package homework.day5.playground.essence.craft.air;

public class Rocket extends AirVehicles {
    public Rocket(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    public Rocket(int weight, String name) {
        super(weight, name);
    }
}
