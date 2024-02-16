package homework.day4;

import java.time.LocalDate;
import java.time.Month;

public class ArrayConsoleTraining {
    /*
     *   Метод, который принимает на вход целочисленном массив и считает сумму каждого n-ого элемента в нем,
     *   где n - целое число, передаваемое в сигнатуру этого метода
     */
    public static int sumOfEachNElementInArray(int[] inputIntArray, int intDelimiter) {
        int sum = 0;
        for (int i = 0; i < inputIntArray.length; i++) {
            if ((i + 1) % intDelimiter == 0) {
                sum += i + 1;
            }
        }
        return sum;
    }

    /*
     * Метод, который вернет целочисленный массив, состоящий только из тех элементов исходного
     * целочисленного массива (подается на вход этого метода), которые больше, чем число n,
     * где n - целое число, передаваемое в сигнатуру этого метода, элементы в результирующем
     * массиве должны быть расположены в обратном порядке
     */
    public static int[] reverseArrayWithElementsBiggerThenInThisArray(int[] inputIntArray, int intComparable) {

        int[] resultArray = arrayWithElementsBiggerThenInThisArray(inputIntArray, intComparable);
        return reverseArray(resultArray);

    }

    private static int[] arrayWithElementsBiggerThenInThisArray(int[] inputIntArray, int intComparable) {

        int[] resultArray = new int[numberOfArrayElemetsBiggerThenComparable(inputIntArray, intComparable)];
        int resultArrayElemntsIndex = 0;
        for (int i = 0; i < inputIntArray.length; i++) {
            if (inputIntArray[i] > intComparable) {
                resultArray[resultArrayElemntsIndex++] = inputIntArray[i];
            }
        }
        return resultArray;
    }

    private static int numberOfArrayElemetsBiggerThenComparable(int[] inputIntArray, int intComparable) {
        int numberOfElementsBiggerThenComparable = 0;
        for (int i = 0; i < inputIntArray.length; i++) {
            if (inputIntArray[i] > intComparable) {
                numberOfElementsBiggerThenComparable++;
            }
        }
        return numberOfElementsBiggerThenComparable;
    }

    private static int[] reverseArray(int[] inputArray) {
        int[] resultArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            resultArray[resultArray.length - i - 1] = inputArray[i];
        }
        return resultArray;
    }

    /*
     *   Метод, который вернет сумму тех элементов целочисленного массива, которые кратны числу текущего месяца
     *   (массив подается в сигнатуру метода)
     */
    public static int sumOfArrayElementsMultipleToCurrentMonthNumber(int[] inputIntArray) {
        int sumOfArrayElements = 0;
        for (int i = 0; i < inputIntArray.length; i++) {
            if (inputIntArray[i] % LocalDate.now().getMonthValue() == 0) {
                sumOfArrayElements += inputIntArray[i];
            }
        }
        return sumOfArrayElements;
    }

    /*
     * Написать метод, который "нарисует" в консоли
     * 	  ^__^
     *  (oo)\\_______
     * (__)\ ) \/\  \
     *      ||----w |\
     *      ||     ||
     */
    public static void printCow() {
        System.out.println("\t  ^__^\n" +
                "\t  (oo)\\\\_______\n" +
                "\t (__)\\ ) \\/\\  \\\n" +
                "\t      ||----w |\\\n" +
                "\t      ||     ||" +
                "");
    }
}
