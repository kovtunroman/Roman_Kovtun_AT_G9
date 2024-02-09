package bubbles;

public class Bottle {
    private double volume;
    private SparklingWater water;
    public SparklingWater getWater(){
        return water;
    }
    public Bottle(double volume){
        this.volume = volume;
        this.water = new SparklingWater();
        this.water.setBubbles(this.volume);
    }
    public Bottle(double volume, SparklingWater water){
        this.volume = volume;
        this.water = water;
        this.water.setBubbles(this.volume);
    }
    public void open(){
        this.water.degas();
    }
}
