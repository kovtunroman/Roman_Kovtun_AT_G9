package homework.day5.playground.essence.craft.air;

public class Plane extends AirVehicles {
    public Plane(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    public Plane(int weight, String name) {
        super(weight, name);
    }
}
