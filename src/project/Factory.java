package project;

import project.boxing.Bottle;
import project.liquids.SparklingWater;

public class Factory {
    public static void main(String[] args) {
        Bottle[] bottles = new Bottle[]{
                new Bottle(0.05, new SparklingWater()),
                new Bottle(0.1, new SparklingWater()),
                new Bottle(0.2, new SparklingWater())};
        bottles[0].getWater().setTemperature(12);
        bottles[1].getWater().setTemperature(18);
        bottles[2].getWater().setTemperature(25);
        for (Bottle bottle : bottles) {
            bottle.open();
            bottle.getWater().showNumberOfBubbles();
        }
    }
}
