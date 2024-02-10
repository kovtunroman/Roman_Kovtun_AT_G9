package homework.day2.pretask;

import java.util.Random;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        Random random = new Random();
        int varaibleOne = random.nextInt(10);
        System.out.println("VaraibleOne was before: " + varaibleOne++);
        System.out.println("VaraibleOne after ++ : " + varaibleOne);

        System.out.println("VaraibleOne was before: " + varaibleOne--);
        System.out.println("VaraibleOne after ++ : " + varaibleOne);
    }
}
