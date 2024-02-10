package pretask;

import java.util.Random;

public class ConditionalExample {
    public static void main(String[] args) {
        int varaibleOne;
        Random random = new Random();
        varaibleOne = random.nextInt(20);
        if (varaibleOne > 10) {
            System.out.println("varaibleOne: " + varaibleOne + " is bigger then 10");
        } else {
            System.out.println("varaibleOne: " + varaibleOne + " less then 10");
        }
    }
}
