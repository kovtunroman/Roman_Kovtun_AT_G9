package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

public abstract class Plant extends Matter {
    protected String name;
    public Plant(String name,int weight, int mass) {
        super(weight, mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
