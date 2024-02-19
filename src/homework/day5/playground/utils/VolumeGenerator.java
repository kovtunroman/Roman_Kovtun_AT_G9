package homework.day5.playground.utils;

import java.util.Random;
import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Pourable;
import homework.day5.playground.essence.material.Water;

public class VolumeGenerator {
    public static int generateVolume(Pourable pourable) {
        Random random = new Random();
        int volume = 0;
        if(pourable instanceof Petrol || pourable instanceof Diesel) {
            volume = random.nextInt(50) + 1;
        } else if(pourable instanceof Water) {
            volume = random.nextInt(49, 100) + 1;
        }
        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %d", pourable.getClass().getSimpleName(), volume).println();
        return volume;
    }
}
