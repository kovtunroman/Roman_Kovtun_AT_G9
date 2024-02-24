package project.boxing;

import project.Transformable;
import project.material.Material;

public class Cup extends Vessel implements Containable {
    public Cup(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }

    @Override
    public void addStuff(Transformable stuff) {
        System.out.printf("Adding %s into Cup", stuff.getClass().getSimpleName()).println();
        this.stuff = stuff;
    }

    @Override
    public Transformable removeStaff() {
        System.out.printf("Removing %s from Cup", stuff.getClass().getSimpleName()).println();
        this.stuff = null;
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (stuff == null) {
            System.out.printf("Cup is Empty").println();
            return true;
        } else {
            System.out.printf("Cup is NOT Empty").println();
            return false;
        }
    }
}
