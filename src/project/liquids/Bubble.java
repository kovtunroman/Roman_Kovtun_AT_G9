package project.liquids;

public class Bubble {
    private final double volume = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public double getVolume() {
        System.out.printf("Bubble volume: %s", volume).println();
        return volume;
    }

    public String getGasComposition() {
        System.out.printf("Bubble gas composition: %s", gasComposition).println();
        return gasComposition;
    }

    public void setGasComposition(String gasComposition) {
        System.out.printf("Bubble gas composition set to: %s", gasComposition).println();
        this.gasComposition = gasComposition;
    }

    public void cramp() {
        System.out.print("Cramp!");
    }

}
