package project.liquids;

public class Bubble {
    private final double volume = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public double getVolume() {
        return volume;
    }

    public String getGasComposition() {
        return gasComposition;
    }

    public void setGasComposition(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void cramp() {
        System.out.print("Cramp!");
    }

}
