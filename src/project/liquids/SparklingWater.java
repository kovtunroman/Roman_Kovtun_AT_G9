package project.liquids;

public class SparklingWater extends Water {
    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater() {
        isOpened();
    }

    public void showNumberOfBubbles() {
        int counter = 0;
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public void pump(Bubble[] bubbles) {
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        this.bubbles = bubbles;
    }

    public void degas() {
        int degasSpeed = 10 + 5 * this.getTemperature();
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] == null) {
                System.out.println("There are no bubbles in this volume");
                break;
            }
            bubbles[i].cramp();
            System.out.println(" " + (i + 1));
            bubbles[i] = null;
            if ((i + 1) % degasSpeed == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void isOpened() {
    }

    public void setOpened() {
        isOpened = true;
        degas();
    }
}
