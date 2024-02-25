package homework.day8.collections;

import homework.day8.util.Printer;

import java.util.Arrays;
import java.util.List;

import static homework.day8.util.Printer.printListThroughSpaceForEach;

public class Doubles {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        Printer.printListThroughSpaceForEach(doubles);
        System.out.println(multiply(doubles));
        System.out.println(calculateSumOfDecimalParts(doubles));
        Printer.printListThroughSpaceIterateByIndex(doubles);
    }

    private static double multiply(List<Double> inputDoubles) {
        double result = 1;
        for (Double doubleElement : inputDoubles) {
            result *= doubleElement;
        }
        return result;
    }

    private static double calculateSumOfDecimalParts(List<Double> inputDoubles) {
        double result = 0;
        for (double doubleElement : inputDoubles) {
            result += doubleElement - (int) doubleElement;
        }
        return result;
    }
}
