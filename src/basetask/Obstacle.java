package basetask;

public class Obstacle {
    private String description;
    private String severity;

    public Obstacle(String description, String severity) {
        this.severity = severity;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло " + this.severity + " препятствиие " + this.description);
    }
}
