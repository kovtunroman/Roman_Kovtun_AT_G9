package classwork.day4;

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
}
