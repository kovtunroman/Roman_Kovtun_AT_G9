package pretask;

import java.util.Random;

public class MathOperatorsExample {
    public static void main(String[] args) {
        Random random = new Random();
        int varaibleOne = random.nextInt(10);
        int varaibleTwo = random.nextInt(10);
        MathOperatorsExample calculator = new MathOperatorsExample();
        System.out.println("VaraibleOne: " + varaibleOne);
        System.out.println("VaraibleTwo: " + varaibleTwo);
        System.out.println("Sum of varaibles: " + calculator.sum(varaibleOne, varaibleTwo));
        System.out.println("Deduction of varaibles: " + calculator.deduction(varaibleOne, varaibleTwo));
        System.out.println("Multiplication of varaibles: " + calculator.mult(varaibleOne, varaibleTwo));
        System.out.println("Devision of varaibles: " + calculator.devide(varaibleOne, varaibleTwo));

    }

    private int sum(int thisInt, int withThisInt){
        return thisInt + withThisInt;
    }

    private int deduction(int thisInt, int withThisInt){
        return thisInt - withThisInt;
    }

    private int mult(int thisInt, int onThisInt){
        return thisInt * onThisInt;
    }

    private int devide(int thisInt, int onThisInt){
        return thisInt / onThisInt;
    }
}
