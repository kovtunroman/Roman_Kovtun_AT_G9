package project.boxing;

import project.Transformable;
import project.material.Material;

public class Can extends Vessel implements Containable {
    public Can(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }

    @Override
    public void addStuff(Transformable stuff) {
        System.out.printf("Adding %s into Can", stuff.getClass().getSimpleName()).println();
        this.stuff = stuff;
    }

    @Override
    public Transformable removeStaff() {
        System.out.printf("Removing %s from Can", stuff.getClass().getSimpleName()).println();
        this.stuff = null;
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (stuff == null) {
            System.out.printf("Can is Empty").println();
            return true;
        } else {
            System.out.printf("Can is NOT Empty").println();
            return false;
        }
    }
}
