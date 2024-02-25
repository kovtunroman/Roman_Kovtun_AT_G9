package homework.day8.collections;

import homework.day8.util.Printer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        Printer.printListThroughNewLineForEach(numbers);
        System.out.println(sumOfElements(numbers));
        Collections.sort(numbers);
        Printer.printListThroughSpaceIterateByIndex(numbers);
        Collections.reverse(numbers);
        Printer.printListThroughSpaceForEach(numbers);
    }

    private static int sumOfElements(List<Integer> inputNumbers) {
        int sum = 0;
        for (int number : inputNumbers) {
            sum += number;
        }
        return sum;
    }
}
