package project.liquids;

import java.util.concurrent.TimeUnit;

public class SparklingWater extends Water {
    private Bubble[] bubbles;
    private boolean isOpened = false;

    public SparklingWater(String color, String smell, String transperency, int temperature) {
        super(color, smell, transperency, temperature);
        new Thread(() -> this.isOpened()).start();
    }

    public void showNumberOfBubbles() {
        int counter = 0;
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
                counter++;
            }
        }
        System.out.printf("Number of bubbles: %s", counter).println();
    }

    public void pump(Bubble[] bubbles) {
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        this.bubbles = bubbles;
        System.out.println("Bubbles pumped");
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
        System.out.println("Sparkling Water was degased successfully");
    }

    private void isOpened() {
        while(!isOpened){
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (isOpened) {
            System.out.println("Water is opened");
            degas();
        }
    }

    public void setOpened() {
        isOpened = true;
        System.out.println("Sparkling Water was set to opened");
    }
}
