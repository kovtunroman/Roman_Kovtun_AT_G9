package homework.day6;

import homework.day5.playground.essence.craft.air.AirVehicles;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.field.Vehicle;
import homework.day5.playground.essence.craft.hand.Bottle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.craft.hand.Mug;
import homework.day5.playground.essence.creatures.animal.Animal;
import homework.day5.playground.essence.creatures.animal.insect.Beetle;
import homework.day5.playground.essence.creatures.animal.insect.Fly;
import homework.day5.playground.essence.creatures.animal.insect.Insect;
import homework.day5.playground.essence.creatures.animal.insect.Mosquito;
import homework.day5.playground.essence.creatures.animal.vertebrata.Crocodile;
import homework.day5.playground.essence.creatures.animal.vertebrata.Pigeon;
import homework.day5.playground.essence.creatures.animal.vertebrata.Raven;
import homework.day5.playground.essence.creatures.plant.Plant;
import homework.day5.playground.essence.creatures.plant.flower.Chamomile;
import homework.day5.playground.essence.creatures.plant.flower.Flower;
import homework.day5.playground.essence.creatures.plant.flower.Maylily;
import homework.day5.playground.essence.creatures.plant.flower.Rose;
import homework.day5.playground.essence.creatures.plant.vegetable.Vegetable;
import homework.day5.playground.essence.creatures.plant.vegetable.Carrot;
import homework.day5.playground.essence.creatures.plant.vegetable.Potato;
import homework.day5.playground.essence.creatures.plant.vegetable.Radish;
import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Water;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        String mamaMilaRamu = "Mama Mila Ramu";

        GenericMethodsInGenericClassT<String> genericString = new GenericMethodsInGenericClassT<>();
        genericString.genericMethodOneGenArg(mamaMilaRamu);
        System.out.println(genericString.genericMethodTwoGenArgs(mamaMilaRamu, mamaMilaRamu));
        genericString.genericMethodHalfGenArgs(mamaMilaRamu, mamaMilaRamu);

        GenericMethodsInGenericClassT<Integer> genericInteger = new GenericMethodsInGenericClassT<>();
        genericInteger.genericMethodOneGenArg(1);
        System.out.println(genericInteger.genericMethodTwoGenArgs(1, 2));
        genericInteger.genericMethodHalfGenArgs(1, mamaMilaRamu);

        GenericMethodsInGenericClassT<Double> genericDouble = new GenericMethodsInGenericClassT<>();
        genericDouble.genericMethodOneGenArg(1.1);
        System.out.println(genericDouble.genericMethodTwoGenArgs(1.1, 1.1));
        genericDouble.genericMethodHalfGenArgs(1.1, mamaMilaRamu);

        GenericMethodsInGenericClassT<AirVehicles> genericMethodsInGenericClassT1 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT1.genericMethodOneGenArg(new AirVehicles(12, mamaMilaRamu) {
        });
        System.out.println(genericMethodsInGenericClassT1.genericMethodTwoGenArgs(new AirVehicles(12, mamaMilaRamu) {
                                                                                  },
                new AirVehicles(12, mamaMilaRamu) {
                }));
        genericMethodsInGenericClassT1.genericMethodHalfGenArgs(new AirVehicles(12, mamaMilaRamu) {
                                                                },
                mamaMilaRamu);

        GenericMethodsInGenericClassT<Fly> genericMethodsInGenericClassT3 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT3.genericMethodOneGenArg(new Fly(21, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT3.genericMethodTwoGenArgs(new Fly(12, mamaMilaRamu), new Mosquito(4, mamaMilaRamu)));
        genericMethodsInGenericClassT3.genericMethodHalfGenArgs(new Fly(34, mamaMilaRamu), mamaMilaRamu);

        GenericMethodsInGenericClassT<Copter> genericMethodsInGenericClassT5 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT5.genericMethodOneGenArg(new Copter(123, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT5.genericMethodTwoGenArgs(new Copter(11, mamaMilaRamu), mamaMilaRamu));
        genericMethodsInGenericClassT5.genericMethodHalfGenArgs(new Copter(212, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Plane> genericMethodsInGenericClassT6 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT6.genericMethodOneGenArg(new Plane(412, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT6.genericMethodTwoGenArgs(new Plane(222, mamaMilaRamu), new Fly(12, mamaMilaRamu)));
        genericMethodsInGenericClassT6.genericMethodHalfGenArgs(new Plane(232, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Rocket> genericMethodsInGenericClassT7 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT7.genericMethodOneGenArg(new Rocket(812, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT7.genericMethodTwoGenArgs(new Rocket(812, mamaMilaRamu), 900));
        genericMethodsInGenericClassT7.genericMethodHalfGenArgs(new Rocket(812, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Vehicle> genericMethodsInGenericClassT8 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT8.genericMethodOneGenArg(new Car(88, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT8.genericMethodTwoGenArgs(new Car(88, mamaMilaRamu), 120));
        genericMethodsInGenericClassT8.genericMethodHalfGenArgs(new Car(88, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Car> genericMethodsInGenericClassT9 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT9.genericMethodOneGenArg(new Car(80, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT9.genericMethodTwoGenArgs(new Car(80, mamaMilaRamu), new Plane(980, mamaMilaRamu)));
        genericMethodsInGenericClassT9.genericMethodHalfGenArgs(new Car(80, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Moped> genericMethodsInGenericClassT10 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT10.genericMethodOneGenArg(new Moped(12, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT10.genericMethodTwoGenArgs(new Moped(12, mamaMilaRamu), 190));
        genericMethodsInGenericClassT10.genericMethodHalfGenArgs(new Moped(12, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Motorbike> genericMethodsInGenericClassT11 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT11.genericMethodOneGenArg(new Motorbike(22, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT11.genericMethodTwoGenArgs(new Motorbike(22, mamaMilaRamu), mamaMilaRamu));
        genericMethodsInGenericClassT11.genericMethodHalfGenArgs(new Motorbike(22, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Container> genericMethodsInGenericClassT12 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT12.genericMethodOneGenArg(new Container(2, mamaMilaRamu) {
            @Override
            public void setMass(int mass) {
                super.setMass(mass);
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            }
        });
        System.out.println(genericMethodsInGenericClassT12.genericMethodTwoGenArgs(new Can(1, mamaMilaRamu), new Mug(1, mamaMilaRamu)));
        genericMethodsInGenericClassT12.genericMethodHalfGenArgs(new Can(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Bottle> genericMethodsInGenericClassT13 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT13.genericMethodOneGenArg(new Bottle(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT13.genericMethodTwoGenArgs(new Bottle(1, mamaMilaRamu), mamaMilaRamu));
        genericMethodsInGenericClassT13.genericMethodHalfGenArgs(new Bottle(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Can> genericMethodsInGenericClassT14 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT14.genericMethodOneGenArg(new Can(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT14.genericMethodTwoGenArgs(new Can(1, mamaMilaRamu), 1.0));
        genericMethodsInGenericClassT14.genericMethodHalfGenArgs(new Can(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Mug> genericMethodsInGenericClassT15 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT15.genericMethodOneGenArg(new Mug(2, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT15.genericMethodTwoGenArgs(new Mug(2, mamaMilaRamu), new Mug(2, mamaMilaRamu)));
        genericMethodsInGenericClassT15.genericMethodHalfGenArgs(new Mug(2, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Animal> genericMethodsInGenericClassT16 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT16.genericMethodOneGenArg(new Crocodile(100, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT16.genericMethodTwoGenArgs(new Crocodile(100, mamaMilaRamu), true));
        genericMethodsInGenericClassT16.genericMethodHalfGenArgs(new Crocodile(100, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Beetle> genericMethodsInGenericClassT17 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT17.genericMethodOneGenArg(new Beetle(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT17.genericMethodTwoGenArgs(new Beetle(1, mamaMilaRamu), false));
        genericMethodsInGenericClassT17.genericMethodHalfGenArgs(new Beetle(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Carrot> genericMethodsInGenericClassT18 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT18.genericMethodOneGenArg(new Carrot(2, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT18.genericMethodTwoGenArgs(new Carrot(2, mamaMilaRamu), mamaMilaRamu));
        genericMethodsInGenericClassT18.genericMethodHalfGenArgs(new Carrot(2, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Chamomile> genericMethodsInGenericClassT19 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT19.genericMethodOneGenArg(new Chamomile(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT19.genericMethodTwoGenArgs(new Chamomile(1, mamaMilaRamu), mamaMilaRamu));
        genericMethodsInGenericClassT19.genericMethodHalfGenArgs(new Chamomile(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Crocodile> genericMethodsInGenericClassT20 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT20.genericMethodOneGenArg(new Crocodile(102, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT20.genericMethodTwoGenArgs(new Crocodile(102, mamaMilaRamu), mamaMilaRamu));
        genericMethodsInGenericClassT20.genericMethodHalfGenArgs(new Crocodile(102, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Flower> genericMethodsInGenericClassT21 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT21.genericMethodOneGenArg(new Maylily(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT21.genericMethodTwoGenArgs(new Maylily(1, mamaMilaRamu), new Fly(12, mamaMilaRamu)));
        genericMethodsInGenericClassT21.genericMethodHalfGenArgs(new Maylily(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Insect> genericMethodsInGenericClassT22 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT22.genericMethodOneGenArg(new Fly(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT22.genericMethodTwoGenArgs(new Fly(1, mamaMilaRamu), mamaMilaRamu));
        genericMethodsInGenericClassT22.genericMethodHalfGenArgs(new Fly(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Maylily> genericMethodsInGenericClassT23 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT23.genericMethodOneGenArg(new Maylily(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT23.genericMethodTwoGenArgs(new Maylily(1, mamaMilaRamu), 0));
        genericMethodsInGenericClassT23.genericMethodHalfGenArgs(new Maylily(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Mosquito> genericMethodsInGenericClassT24 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT24.genericMethodOneGenArg(new Mosquito(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT24.genericMethodTwoGenArgs(new Mosquito(1, mamaMilaRamu), mamaMilaRamu));
        genericMethodsInGenericClassT24.genericMethodHalfGenArgs(new Mosquito(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Pigeon> genericMethodsInGenericClassT25 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT25.genericMethodOneGenArg(new Pigeon(25, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT25.genericMethodTwoGenArgs(new Pigeon(25, mamaMilaRamu), new Pigeon(25, mamaMilaRamu)));
        genericMethodsInGenericClassT25.genericMethodHalfGenArgs(new Pigeon(25, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Plant> genericMethodsInGenericClassT26 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT26.genericMethodOneGenArg(new Rose(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT26.genericMethodTwoGenArgs(new Rose(1, mamaMilaRamu), 1290));
        genericMethodsInGenericClassT26.genericMethodHalfGenArgs(new Rose(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Potato> genericMethodsInGenericClassT27 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT27.genericMethodOneGenArg(new Potato(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT27.genericMethodTwoGenArgs(new Potato(1, mamaMilaRamu), 0.5));
        genericMethodsInGenericClassT27.genericMethodHalfGenArgs(new Potato(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Radish> genericMethodsInGenericClassT28 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT28.genericMethodOneGenArg(new Radish(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT28.genericMethodTwoGenArgs(new Radish(1, mamaMilaRamu), new Car(320, mamaMilaRamu)));
        genericMethodsInGenericClassT28.genericMethodHalfGenArgs(new Radish(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Raven> genericMethodsInGenericClassT29 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT29.genericMethodOneGenArg(new Raven(2, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT29.genericMethodTwoGenArgs(new Raven(2, mamaMilaRamu), mamaMilaRamu));
        genericMethodsInGenericClassT29.genericMethodHalfGenArgs(new Raven(2, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Rose> genericMethodsInGenericClassT30 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT30.genericMethodOneGenArg(new Rose(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT30.genericMethodTwoGenArgs(new Rose(1, mamaMilaRamu), 3290));
        genericMethodsInGenericClassT30.genericMethodHalfGenArgs(new Rose(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Vegetable> genericMethodsInGenericClassT31 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT31.genericMethodOneGenArg(new Potato(1, mamaMilaRamu));
        System.out.println(genericMethodsInGenericClassT31.genericMethodTwoGenArgs(new Potato(1, mamaMilaRamu), true));
        genericMethodsInGenericClassT31.genericMethodHalfGenArgs(new Potato(1, mamaMilaRamu), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Diesel> genericMethodsInGenericClassT32 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT32.genericMethodOneGenArg(new Diesel(10));
        System.out.println(genericMethodsInGenericClassT32.genericMethodTwoGenArgs(new Diesel(20), mamaMilaRamu));
        genericMethodsInGenericClassT32.genericMethodHalfGenArgs(new Diesel(30), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Petrol> genericMethodsInGenericClassT33 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT33.genericMethodOneGenArg(new Petrol(10));
        System.out.println(genericMethodsInGenericClassT33.genericMethodTwoGenArgs(new Petrol(20), 0.2));
        genericMethodsInGenericClassT33.genericMethodHalfGenArgs(new Petrol(30), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<Water> genericMethodsInGenericClassT34 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT34.genericMethodOneGenArg(new Water(50));
        System.out.println(genericMethodsInGenericClassT34.genericMethodTwoGenArgs(new Water(60), new Copter(222, mamaMilaRamu)));
        genericMethodsInGenericClassT34.genericMethodHalfGenArgs(new Water(70), mamaMilaRamu);
        System.out.println();

        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassT35 = new GenericMethodsInGenericClassT<>();
        System.out.println(genericMethodsInGenericClassT35.genericMethodTwoGenArgs(mamaMilaRamu, 800));
        System.out.println();

        GenericMethodsInGenericClassT<Fly> genericMethodsInGenericClassT36 = new GenericMethodsInGenericClassT<>();
        System.out.println(genericMethodsInGenericClassT36.genericMethodTwoGenArgs(new Fly(10, mamaMilaRamu), mamaMilaRamu));
        System.out.println();

        GenericMethodsInGenericClassT<Fly> genericMethodsInGenericClassT37 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT37.genericMethodHalfGenArgs(new Fly(10, mamaMilaRamu), mamaMilaRamu);
        System.out.println();
    }
}
