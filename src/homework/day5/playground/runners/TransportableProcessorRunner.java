package homework.day5.playground.runners;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;
import homework.day5.playground.essence.craft.air.AirVehicles;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.field.Vehicle;
import homework.day5.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {
    public static void main(String[] args) {
        TransportableProcessor transportableProcessor = new TransportableProcessor();

        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        transportableProcessor.runTransportable(transportableCopter);
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        transportableProcessor.runTransportable(transportablePlane);
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        transportableProcessor.runTransportable(transportableRocket);
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        transportableProcessor.runTransportable(transportableCar);
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        transportableProcessor.runTransportable(transportableMoped);
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        transportableProcessor.runTransportable(transportableMotorbike);
        AirVehicles aircraftCopter = new Copter(223, "AW109 Aircraft");
        transportableProcessor.runTransportable(aircraftCopter);
        AirVehicles aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        transportableProcessor.runTransportable(aircraftPlane);
        AirVehicles aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");
        transportableProcessor.runTransportable(aircraftRocket);
        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        transportableProcessor.runTransportable(vehicleCar);
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        transportableProcessor.runTransportable(vehicleMoped);
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        transportableProcessor.runTransportable(vehicleMotorbike);
        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
//        Flyable and Rideable interfaces hove no move method
//        transportableProcessor.runTransportable(flyableCopter);
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
//        transportableProcessor.runTransportable(flyablePlane);
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");
//        transportableProcessor.runTransportable(flyableRocket);
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
//        transportableProcessor.runTransportable(rideableCar);
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
//        transportableProcessor.runTransportable(rideableMoped);
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
//        transportableProcessor.runTransportable(rideableMotorbike);
        Copter aCopter = new Copter(223, "AW109 Copter");
        transportableProcessor.runTransportable(aCopter);
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        transportableProcessor.runTransportable(aPlane);
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        transportableProcessor.runTransportable(aRocket);
        Car aCar = new Car(23, "Tesla X Car");
        transportableProcessor.runTransportable(aCar);
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        transportableProcessor.runTransportable(aMoped);
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");
        transportableProcessor.runTransportable(aMotorbike);
        transportableProcessor.runTransportable(aMotorbike, 23, 242);
        transportableProcessor.runTransportable(aMotorbike, 93, 7);
    }
}
