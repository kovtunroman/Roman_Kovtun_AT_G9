package bubbles;

public class Bottle {
    private double volume;
    private SparklingWater water;
    public Bottle(double volume) {
        this(volume, new SparklingWater());
    }

    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
        this.water.setBubbles(this.volume);
    }

    public SparklingWater getWater() {
        return water;
    }

    public void open() {
        this.water.degas();
    }
}
