package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Transportable;
import homework.day5.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB){
        int range = transportable.move(pointA, pointB);
        System.out.printf("Transportable %s was moved to %s points", transportable.getClass().getSimpleName(), range);
    }

    public void runTransportable(Transportable transportable){
        runTransportable(transportable, CoordinatesGenerator.generateCoordinate(),
                CoordinatesGenerator.generateCoordinate());
    }
}
