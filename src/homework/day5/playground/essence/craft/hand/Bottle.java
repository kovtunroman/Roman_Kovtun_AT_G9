package homework.day5.playground.essence.craft.hand;

import homework.day5.playground.essence.material.Pourable;

public class Bottle extends Container implements Storable {
    public Bottle(int weight, String name) {
        super(weight, name);
    }

    public Bottle(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    @Override
    public void store(Pourable pourable, int amount) {
        pourable.spread(this.getClass().getSimpleName());
        System.out.printf("I am %s, my name is %s and I received %d of %s", getClass().getSimpleName(), getName(), amount, pourable.getClass().getSimpleName()).println();
        if (amount > getMass()) {
            System.out.println("wooh-wooh-wooh-hh..");
        }
    }
}
