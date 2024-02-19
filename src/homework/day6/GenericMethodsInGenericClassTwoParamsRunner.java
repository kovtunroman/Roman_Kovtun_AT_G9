package homework.day6;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.craft.Transportable;
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
import homework.day5.playground.essence.creatures.plant.vegetable.*;
import homework.day5.playground.essence.creatures.plant.flower.*;
import homework.day5.playground.essence.creatures.animal.*;
import homework.day5.playground.essence.creatures.animal.insect.*;
import homework.day5.playground.essence.creatures.animal.vertebrata.*;
import homework.day5.playground.essence.creatures.plant.flower.*;
import homework.day5.playground.essence.creatures.plant.*;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> one = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> two = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> three = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> four = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<AirVehicles, Copter> five = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Rocket> six = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Vehicle, Car> seven = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Moped, Motorbike> eight = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Container, Can> nine = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mug, Bottle> ten = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Animal, Beetle> eleven = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> twelve = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Flower> thirteen = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Fly, Insect> fourteen = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> fifteen = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Plant> sixteen = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Potato, Radish> seventeen = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Raven, Rose> eighteen = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Vegetable, Vertebrata> nineteen = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Transportable, Flyable> twenty = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(one.genericMethodGenArgs("Argument one"));
        System.out.println(one.genericMethodGenArgs("Argument one", "Argument two"));
        one.genericMethodHalfGenArgs("Argument one", "Test string");
        one.genericMethodHalfGenArgs("Argument one", "Argument two", "Test string");
        System.out.println();

        System.out.println(two.genericMethodGenArgs("This is a string"));
        System.out.println(two.genericMethodGenArgs("String", 300));
        two.genericMethodHalfGenArgs("Some string for arg1", "Test string");
        two.genericMethodHalfGenArgs("Some string for arg1", 800, "Test string lalala");
        System.out.println();

        System.out.println(three.genericMethodGenArgs("SOme string"));
        System.out.println(three.genericMethodGenArgs("Some string", 1000.5));
        three.genericMethodHalfGenArgs("Something for arg 1", "String as arg2");
        three.genericMethodHalfGenArgs("Arg1", 100.9, "String for testing");
        System.out.println();

        System.out.println(four.genericMethodGenArgs(100));
        System.out.println(four.genericMethodGenArgs(100, 200));
        four.genericMethodHalfGenArgs(100, "Some test");
        four.genericMethodHalfGenArgs(100, 200, "Hello");
        System.out.println();

        System.out.println(five.genericMethodGenArgs(new Plane(800, "Plane")));
        System.out.println(five.genericMethodGenArgs(new Rocket(1900, "Rocket"), new Copter(255, "Copter")));
        five.genericMethodHalfGenArgs(new Copter(250, "Copter"), "Test string hop");
        five.genericMethodHalfGenArgs(new Plane(1900, "Plane"), new Copter(280, "Copter"), "Just a string");
        System.out.println();

        System.out.println(six.genericMethodGenArgs(new Plane(900, "Plane")));
        System.out.println(six.genericMethodGenArgs(new Plane(900, "Plane"), new Rocket(2800, "Rocket")));
        six.genericMethodHalfGenArgs(new Plane(1300, "Plane"), "test string with plane");
        six.genericMethodHalfGenArgs(new Plane(1900, "Plane"), new Rocket(3000, "Rocket"), "lalalalala");
        System.out.println();

        System.out.println(seven.genericMethodGenArgs(new Car(250, "Car")));
        System.out.println(seven.genericMethodGenArgs(new Car(250, "Car"), new Car(280, "Car2")));
        seven.genericMethodHalfGenArgs(new Moped(180, "Moped"), "String for car");
        seven.genericMethodHalfGenArgs(new Motorbike(180, "Motorbike"), new Car(300, "Car"), "Hi");
        System.out.println();

        System.out.println(eight.genericMethodGenArgs(new Moped(120, "Moped")));
        System.out.println(eight.genericMethodGenArgs(new Moped(120, "Moped"), new Motorbike(180, "Motorbike")));
        eight.genericMethodHalfGenArgs(new Moped(115, "Moped"), "String");
        eight.genericMethodHalfGenArgs(new Moped(90, "Moped"), new Motorbike(150, "Motorbike"), "String");
        System.out.println();

        System.out.println(nine.genericMethodGenArgs(new Can(1, "Can")));
        System.out.println(nine.genericMethodGenArgs(new Bottle(1, "Bottle"), new Can(1, "Can")));
        nine.genericMethodHalfGenArgs(new Bottle(1, "Bottle"), "String ping");
        nine.genericMethodHalfGenArgs(new Can(1, "Can"), new Can(1, "Can2"), "Test string two cans");
        System.out.println();

        System.out.println(ten.genericMethodGenArgs(new Mug(1, "Mug")));
        System.out.println(ten.genericMethodGenArgs(new Mug(1, "Mug1"), new Bottle(1, "Bottle")));
        ten.genericMethodHalfGenArgs(new Mug(1, "Mug"), "String");
        ten.genericMethodHalfGenArgs(new Mug(2, "Mug2"), new Bottle(2, "Bottle name"), "Some string");
        System.out.println();

        System.out.println(eleven.genericMethodGenArgs(new Pigeon(14, "Pigeon")));
        System.out.println(eleven.genericMethodGenArgs(new Crocodile(200, "Crocodile"), new Beetle(8, "Beetle")));
        eleven.genericMethodHalfGenArgs(new Fly(12, "Fly"), "Test");
        eleven.genericMethodHalfGenArgs(new Raven(27, "Raven"), new Beetle(8, "Beetle"), "");
        System.out.println();

        System.out.println(twelve.genericMethodGenArgs(new Carrot(29, "Carrot")));
        System.out.println(twelve.genericMethodGenArgs(new Carrot(29, "Carrot"), new Chamomile(2, "Chamomile")));
        twelve.genericMethodHalfGenArgs(new Carrot(18, "Carrot"), "My string");
        twelve.genericMethodHalfGenArgs(new Carrot(19, "Carrot"), new Chamomile(2, "Chamomile two"), "Some test string carrot");
        System.out.println();

        System.out.println(thirteen.genericMethodGenArgs(new Crocodile(280, "Crocodile")));
        System.out.println(thirteen.genericMethodGenArgs(new Crocodile(220, "Crocodile2"), new Rose(1, "Rose")));
        thirteen.genericMethodHalfGenArgs(new Crocodile(230, "Crocodile"), "Hey");
        thirteen.genericMethodHalfGenArgs(new Crocodile(240, "Crocodile"), new Maylily(1, "Maylily"), "Some string");
        System.out.println();

        System.out.println(fourteen.genericMethodGenArgs(new Fly(1, "Fly")));
        System.out.println(fourteen.genericMethodGenArgs(new Fly(1, "Fly"), new Beetle(1, "Beetle")));
        fourteen.genericMethodHalfGenArgs(new Fly(1, "Fly"), "String fly");
        fourteen.genericMethodHalfGenArgs(new Fly(1, "Fly"), new Beetle(1, "Beetle"), "Hello");
        System.out.println();

        System.out.println(fifteen.genericMethodGenArgs(new Maylily(1, "Maylily")));
        System.out.println(fifteen.genericMethodGenArgs(new Maylily(1, "Maylily2"), new Mosquito(1, "Mosquito")));
        fifteen.genericMethodHalfGenArgs(new Maylily(1, "Maylily3"), "Test");
        fifteen.genericMethodHalfGenArgs(new Maylily(1, "Maylily4"), new Mosquito(1, "Mosquito2"), "Hello, my friends");
        System.out.println();

        System.out.println(sixteen.genericMethodGenArgs(new Pigeon(5, "Pigeon")));
        System.out.println(sixteen.genericMethodGenArgs(new Pigeon(5, "Pigeon2"), new Rose(1, "Rose")));
        sixteen.genericMethodHalfGenArgs(new Pigeon(3, "Pigeon3"), "Pigeon string");
        sixteen.genericMethodHalfGenArgs(new Pigeon(8, "Pigeon4"), new Potato(4, "Potato"), "Potato");
        System.out.println();

        System.out.println(seventeen.genericMethodGenArgs(new Potato(8, "Potato")));
        System.out.println(seventeen.genericMethodGenArgs(new Potato(8, "Potato"), new Radish(2, "Radish")));
        seventeen.genericMethodHalfGenArgs(new Potato(9, "Potato"), "Test");
        seventeen.genericMethodHalfGenArgs(new Potato(9, "Potato2"), new Radish(3, "Radish2"), "Hi");
        System.out.println();

        System.out.println(eighteen.genericMethodGenArgs(new Raven(15, "Raven")));
        System.out.println(eighteen.genericMethodGenArgs(new Raven(15, "Raven"), new Rose(1, "Rose")));
        eighteen.genericMethodHalfGenArgs(new Raven(17, "Raven"), "Raven");
        eighteen.genericMethodHalfGenArgs(new Raven(16, "Raven some"), new Rose(1, "Some rose"), "Rose and raven");
        System.out.println();

        System.out.println(nineteen.genericMethodGenArgs(new Radish(2, "Radish")));
        System.out.println(nineteen.genericMethodGenArgs(new Carrot(1, "Carrot"), new Raven(18, "Raven")));
        nineteen.genericMethodHalfGenArgs(new Carrot(4, "Carrot"), "Test nineteen");
        nineteen.genericMethodHalfGenArgs(new Potato(6, "Potato"), new Crocodile(190, "Crocodile"), "");
        System.out.println();

        System.out.println(twenty.genericMethodGenArgs(new Car(190, "Car")));
        System.out.println(twenty.genericMethodGenArgs(new Plane(890, "Plane"), new Fly(12, "Fly")));
        twenty.genericMethodHalfGenArgs(new Moped(90, "Moped"), "Last test");
        twenty.genericMethodHalfGenArgs(new Plane(990, "Plane"), new Mosquito(8, "Mosquito"), "Bye-bye");
        System.out.println();

    }
}