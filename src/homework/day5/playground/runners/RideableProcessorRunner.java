package homework.day5.playground.runners;

import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.field.Vehicle;
import homework.day5.playground.processors.RideableProcessor;

public class RideableProcessorRunner {
    public static void main(String[] args) {
        RideableProcessor rideableProcessor = new RideableProcessor();

        Rideable rideableCar = new Car(223, "Lada Rideable");
        rideableProcessor.runRideable(rideableCar);
        Rideable rideableMoped = new Moped(3452, "Honda EM1 837 Rideable");
        rideableProcessor.runRideable(rideableMoped);
        Rideable rideableMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Rideable");
        rideableProcessor.runRideable(rideableMotorbike);
        Vehicle vehicleCar = new Car(223, "Lada Vehicle");
        rideableProcessor.runRideable(vehicleCar);
        Vehicle vehicleMoped = new Moped(3452, "Honda EM1 837 Vehicle");
        rideableProcessor.runRideable(vehicleMoped);
        Vehicle vehicleMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Vehicle");
        rideableProcessor.runRideable(vehicleMotorbike);
        Car aCar = new Car(223, "Lada Car");
        rideableProcessor.runRideable(aCar);
        Moped aMoped = new Moped(3452, "Honda EM1 837 Moped");
        rideableProcessor.runRideable(aMoped);
        Motorbike aMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Motorbike");
        rideableProcessor.runRideable(aMotorbike);
        Vehicle anonymousVehicle = new Vehicle(3452, "Honda EM1 837 Vehicle"){};
        rideableProcessor.runRideable(anonymousVehicle);
        Rideable anonymousRideable = new Rideable(){
            String name = "Anonymous";
            @Override
            public void drive(String direction) {
                System.out.printf("\n I am %s, my name is %s and I amd drive to %s%n",
                        this.getClass().getSimpleName(), this.name, direction);
            }
        };
        rideableProcessor.runRideable(anonymousRideable);
        rideableProcessor.runRideable(aMoped, "nowere");
        rideableProcessor.runRideable(aMoped, "everyware");
        rideableProcessor.runRideable(anonymousRideable, "nowere");
        rideableProcessor.runRideable(anonymousRideable, "everyware");
    }
}
