package homework.day8.objects;

import java.util.Objects;

public class Chair {
    private int height;
    private int weight;

    public Chair(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return height == chair.height && weight == chair.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
