package project.boxing;

import project.liquids.Bubble;
import project.liquids.SparklingWater;

public class Bottle {
    private double volume;
    private SparklingWater water;
    public Bottle(double volume) {
        this(volume, new SparklingWater());
    }

    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
        setBubbles();
    }

    public SparklingWater getWater() {
        return water;
    }

    public void open() {
        this.water.degas();
    }

    public void setBubbles(){
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        water.pump(bubbles);
    }
}
