package project.liquids;

public abstract class Water {
    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;

    public Water() {
    }

    public String getColor() {
        System.out.printf("Water color: %s", color).println();
        return color;
    }

    public void setColor(String color) {
        System.out.printf("Water color set to: %s", color).println();
        this.color = color;
    }

    public String getTransparency() {
        System.out.printf("Water Transperancy: %s", transparency).println();
        return transparency;
    }

    public void setTransparency(String transparency) {
        System.out.printf("Water Transperancy set to: %s", transparency).println();
        this.transparency = transparency;
    }

    public String getSmell() {
        System.out.printf("Smells like: %s", smell).println();
        return smell;
    }

    public void setSmell(String smell) {
        System.out.printf("Should smells like: %s", smell).println();
        this.smell = smell;
    }

    public int getTemperature() {
        System.out.printf("Water temperature is: %s", temperature).println();
        return temperature;
    }

    public void setTemperature(int temperature) {
        System.out.printf("Water temperature set to: %s", temperature).println();
        this.temperature = temperature;
    }
}
