package homework.day8.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        printNumbers(numbers);
        System.out.println(sumOfElements(numbers));
        Collections.sort(numbers);
        printNumbersThroughSpaceIterateByIndex(numbers);
        Collections.reverse(numbers);
        printNumbersThroughSpace(numbers);
    }

    private static void printNumbers(List<Integer> inputNmbers) {
        for (int number : inputNmbers) {
            System.out.println(number);
        }
    }

    private static int sumOfElements(List<Integer> inputNumbers) {
        int sum = 0;
        for (int number : inputNumbers) {
            sum += number;
        }
        return sum;
    }

    private static void printNumbersThroughSpaceIterateByIndex(List<Integer> inputNumbers) {
        for (int i = 0; i < inputNumbers.size(); i++) {
            if (i == inputNumbers.size() - 1) {
                System.out.print(inputNumbers.get(i));
            } else {
                System.out.print(inputNumbers.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printNumbersThroughSpace(List<Integer> inputNmbers) {
        for (int number : inputNmbers) {
            System.out.printf("%s ", number);
        }
        System.out.println();
    }
}
