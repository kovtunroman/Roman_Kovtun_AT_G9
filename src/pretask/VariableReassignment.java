package pretask;

import java.util.Random;

public class VariableReassignment {
    public static void main(String[] args) {
        Random random = new Random();
        int varaibleOne = random.nextInt(10);
        System.out.println("VaraibleOne was " + varaibleOne);
        varaibleOne = random.nextInt(10);
        System.out.println("VaraibleOne now is " + varaibleOne);
    }
}
