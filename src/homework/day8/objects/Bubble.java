package homework.day8.objects;

import java.util.Objects;

public class Bubble {
    private int volume;
    private String name;

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public Bubble(int i){
        this.volume = i;
        this.name = "Bubble vol- " + i;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bubble bubble = (Bubble) o;
        return volume == bubble.volume && Objects.equals(name, bubble.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, name);
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}
