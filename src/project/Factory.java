package project;

import project.boxing.Bottle;
import project.liquids.SparklingWater;
import project.liquids.Water;

public class Factory {
    public static void main(String[] args) {
        Factory bottleFactory = new Factory();
        Bottle[] bottles = new Bottle[3];
        bottles[0] = bottleFactory.createBottleWith(0.05, new SparklingWater(), 12);
        bottles[1] = bottleFactory.createBottleWith(0.1, new SparklingWater(), 18);
        bottles[2] = bottleFactory.createBottleWith(0.2, new SparklingWater(), 25);
        for (Bottle bottle : bottles) {
            bottle.open();
            if (bottle.getWater() instanceof SparklingWater) {
                ((SparklingWater) bottle.getWater()).showNumberOfBubbles();
            }
        }
    }

    public Bottle createBottleWith(double volume, Water water, int temperature) {
        Bottle bottle = new Bottle(volume);
        bottle.setWater(water);
        bottle.warm(temperature);
        if (water instanceof SparklingWater) {
            bottle.setBubbles();
        }
        return bottle;
    }
}
