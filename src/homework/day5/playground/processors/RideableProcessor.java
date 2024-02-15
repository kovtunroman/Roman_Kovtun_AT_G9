package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        runRideable(rideable, DirectionGenerator.generateDirection());
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}
