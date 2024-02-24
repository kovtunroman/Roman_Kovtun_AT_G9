package project.boxing;

import project.Transformable;
import project.material.Material;

public abstract class Vessel {
    private double volume;
    private double diameter;
    private int weight;
    private Material material;
    protected Transformable stuff;

    public Vessel(double volume, double diameter, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.material = material;
        this.weight = (int) Math.round(volume * material.getDensity() / diameter);
    }

    public double getVolume() {
        System.out.printf("Getting %s volume: %s", this.getClass().getSimpleName(), volume).println();
        return volume;
    }

    public void setVolume(double volume) {
        System.out.printf("The %s volume is set to %s", this.getClass().getSimpleName(), volume).println();
        this.volume = volume;
    }

    public double getDiameter() {
        System.out.printf("Getting %s diameter: %s", this.getClass().getSimpleName(), diameter).println();
        return diameter;
    }

    public void setDiameter(double diameter) {
        System.out.printf("The %s diameter is set to %s", this.getClass().getSimpleName(), diameter).println();
        this.diameter = diameter;
    }

    public int getWeight() {
        System.out.printf("Getting %s weight: %s", this.getClass().getSimpleName(), weight).println();
        return weight;
    }

    public void setWeight(int weight) {
        System.out.printf("The %s weight is set to %s", this.getClass().getSimpleName(), weight).println();
        this.weight = weight;
    }

    public Material getMaterial() {
        System.out.printf("Getting %s material: %s", this.getClass().getSimpleName(), material).println();
        return material;
    }

    public void setMaterial(Material material) {
        System.out.printf("The %s material is set to %s", this.getClass().getSimpleName(), material).println();
        this.material = material;
    }
}
