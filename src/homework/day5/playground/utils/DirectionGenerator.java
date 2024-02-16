package homework.day5.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        int random = new Random().nextInt(1, 40);
        if (random >= 1 && random <= 9) {
            return "NORTH";
        } else if (random >= 10 && random <= 19) {
            return "SOUTH";
        } else if (random >= 20 && random <= 29) {
            return "WEST";
        } else if (random >= 20 && random <= 40) {
            return "EAST";
        }
        return null;
    }
}
