package homework.day2.pretask;

import java.util.Random;

public class SimpleMathExample {
    public static void main(String[] args) {
        Random random = new Random();
        int lengthOfRectangle = random.nextInt(10);
        int highOfRectangle = random.nextInt(10);

        System.out.println("Rectangle Square is " + lengthOfRectangle * highOfRectangle);
    }
}
