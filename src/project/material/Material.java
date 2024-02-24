package project.material;

public abstract class Material {
    private double thermalConductivity;
    private String color;
    private double density;

    public Material(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }

    public double getThermalConductivity() {
        System.out.printf("Getting %s thermalConductivity: %s", this.getClass().getSimpleName(), thermalConductivity).println();
        return thermalConductivity;
    }

    public void setThermalConductivity(double thermalConductivity) {
        System.out.printf("The %s thermalConductivity is set to %s", this.getClass().getSimpleName(), thermalConductivity).println();
        this.thermalConductivity = thermalConductivity;
    }

    public String getColor() {
        System.out.printf("Getting %s color: %s", this.getClass().getSimpleName(), color).println();
        return color;
    }

    public void setColor(String color) {
        System.out.printf("The %s color is set to %s", this.getClass().getSimpleName(), color).println();
        this.color = color;
    }

    public double getDensity() {
        System.out.printf("Getting %s density: %s", this.getClass().getSimpleName(), density).println();
        return density;
    }

    public void setDensity(double density) {
        System.out.printf("The %s density is set to %s", this.getClass().getSimpleName(), density).println();
        this.density = density;
    }
}
