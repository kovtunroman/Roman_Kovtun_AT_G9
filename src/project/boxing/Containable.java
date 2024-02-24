package project.boxing;

import project.Transformable;

public interface Containable {
    void addStuff (Transformable stuff);
    Transformable removeStaff();
    boolean isEmpty();
}
