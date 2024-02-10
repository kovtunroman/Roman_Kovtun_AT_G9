package project.liquids;

public class SparklingWater extends Water {
    private Bubble[] bubbles;

    public void showNumberOfBubbles() {
        int counter = 0;
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public void setBubbles(double volume) {
        this.bubbles = new Bubble[(int) (volume * 10000)];
        bubbles = pump(bubbles);
    }

    private Bubble[] pump(Bubble[] bubbles) {
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        return bubbles;
    }

    public void degas() {
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] == null) {
                System.out.println("There are no bubbles in this volume");
                break;
            }
            bubbles[i].cramp();
            System.out.println(" " + (i + 1));
            bubbles[i] = null;
        }
    }
}