package pretask;

import java.util.Random;

public class VariableExample {
    public static void main(String[] args) {
        Random random = new Random();
        int varaibleOne = random.nextInt(10);
        int varaibleTwo = random.nextInt(10);
        System.out.println(varaibleOne);
        System.out.println(varaibleTwo);
    }
}
