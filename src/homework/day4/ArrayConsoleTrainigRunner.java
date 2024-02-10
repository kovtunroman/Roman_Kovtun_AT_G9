package homework.day4;

import homework.day4.ArrayConsoleTraining;

import java.util.Arrays;

public class ArrayConsoleTrainigRunner {
    public static void main(String[] args) {
        int[] demoArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int demoIntDelimiter = 5;
        System.out.println("ArrayConsoleTraining 1.1: " + ArrayConsoleTraining.sumOfEachNElementInArray(demoArray, demoIntDelimiter));
        System.out.println("ArrayConsoleTraining 1.2: ");
        System.out.println(Arrays.toString(ArrayConsoleTraining.reverseArrayWithElementsBiggerThenInThisArray(demoArray, demoIntDelimiter)));
        System.out.println("ArrayConsoleTraining 1.3: " + ArrayConsoleTraining.sumOfArrayElementsMultipleToCurrentMonthNumber(demoArray));
        System.out.println("ArrayConsoleTraining 1.4: ");
        ArrayConsoleTraining.printCow();

    }
}
