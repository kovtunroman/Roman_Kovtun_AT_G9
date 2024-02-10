package project;

import project.boxing.Bottle;

public class Runner {
    public static void main(String[] args) {
        Bottle[] bottles = new Bottle[]{
                new Bottle(0.05),
                new Bottle(0.1),
                new Bottle(0.2)};
        for (Bottle bottle : bottles) {
            bottle.open();
            bottle.getWater().showNumberOfBubbles();
        }
        bottles[0].open();
    }
}