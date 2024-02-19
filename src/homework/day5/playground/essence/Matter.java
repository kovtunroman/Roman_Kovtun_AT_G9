package homework.day5.playground.essence;

public abstract class Matter {
    protected int weight;
    public int mass;

    public Matter(int weight, int mass) {
        this.weight = weight;
        this.mass = mass;
    }

    public Matter(int mass) {
        this.mass = mass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
