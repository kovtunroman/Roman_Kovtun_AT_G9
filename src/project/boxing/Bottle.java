package project.boxing;

import project.liquids.Bubble;
import project.liquids.SparklingWater;
import project.liquids.Water;

public class Bottle {
    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public Water getWater() {
        System.out.printf("Water in the bottle: %s", water).println();
        return water;
    }

    public void setWater(Water water) {
        System.out.printf("Water in the bottle set to: %s", water).println();
        this.water = water;
    }

    public void open() {
        System.out.println("Bottle was opened");
        if (water instanceof SparklingWater) {
            ((SparklingWater) this.water).setOpened();
        }
    }

    public void setBubbles() {
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        if (water instanceof SparklingWater) {
            ((SparklingWater) this.water).pump(bubbles);
        }
        System.out.printf("Bottle water bubbles were set. Number of bubbles: %s", bubbles.length).println();
    }

    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();
        water.setTemperature(temperature);
    }
}
