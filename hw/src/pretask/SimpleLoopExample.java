package pretask;

import java.util.Random;

public class SimpleLoopExample {
    public static void main(String[] args) {
        int varaibleOne;
        Random random = new Random();
        varaibleOne = random.nextInt(10);
        for(int i = 0; i < varaibleOne; i++){
            System.out.println("Number is " + (i + 1) );
        }
    }
}
