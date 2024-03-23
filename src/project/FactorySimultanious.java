package project;

import project.boxing.Bottle;
import project.liquids.SparklingWater;
import project.liquids.Water;
import project.material.Glass;

public class FactorySimultanious {
    public static void main(String[] args) {
        Factory bottleFactory = new Factory();
        Bottle[] bottles = new Bottle[3];
        bottles[0] = bottleFactory.createBottleWith(0.5, new SparklingWater("no", "no", "transparent", 5));
        bottles[1] = bottleFactory.createBottleWith(1, new SparklingWater("no", "no", "transparent", 5));
        bottles[2] = bottleFactory.createBottleWith(1.5, new SparklingWater("no", "no", "transparent", 22));

        bottles[0].open();
        bottles[1].open();
        bottles[2].open();
//        for (Bottle bottle : bottles) {
//            bottle.open();
//            if (bottle.getWater() instanceof SparklingWater) {
//                ((SparklingWater) bottle.getWater()).showNumberOfBubbles();
//            }
//            bottle.removeStaff();
//        }
    }

    public Bottle createBottleWith(double volume, Water water) {
        Bottle bottle = new Bottle(volume, 5, new Glass());
        bottle.setWater(water);
        bottle.warm(water.getTemperature());
        bottle.addStuff(water);
        return bottle;
    }
}
