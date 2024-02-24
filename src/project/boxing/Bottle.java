package project.boxing;

import project.Transformable;
import project.liquids.Bubble;
import project.liquids.SparklingWater;
import project.liquids.Water;
import project.material.Material;

public class Bottle extends Vessel implements Containable {
    private Water water;

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }

    public Water getWater() {
        System.out.printf("Water in the bottle: %s", water).println();
        return water;
    }

    public void setWater(Water water) {
        System.out.printf("Water in the bottle set to: %s", water).println();
        this.water = water;
    }

    public void open() {
        System.out.println("Bottle was opened");
        if (water instanceof SparklingWater) {
            ((SparklingWater) this.water).setOpened();
        }
    }

    private void setBubbles() {
        Bubble[] bubbles = new Bubble[(int) (getVolume() * 10000)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        if (water instanceof SparklingWater) {
            ((SparklingWater) this.water).pump(bubbles);
        }
        System.out.printf("Bottle water bubbles were set. Number of bubbles: %s", bubbles.length).println();
    }

    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();
        water.setTemperature(temperature);
    }

    @Override
    public void addStuff(Transformable stuff) {
        if (stuff instanceof SparklingWater){
            setBubbles();
        }
        System.out.printf("Adding %s into Bottle", stuff.getClass().getSimpleName()).println();
    }

    @Override
    public Transformable removeStaff() {
        System.out.printf("Removing %s from Bottle", stuff.getClass().getSimpleName()).println();
        this.stuff = null;
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (stuff == null) {
            System.out.printf("Bottle is Empty").println();
            return true;
        } else {
            System.out.printf("Bottle is NOT Empty").println();
            return false;
        }
    }
}
