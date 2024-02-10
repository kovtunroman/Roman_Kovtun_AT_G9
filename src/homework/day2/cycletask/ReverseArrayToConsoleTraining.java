package homework.day2.cycletask;

public class ReverseArrayToConsoleTraining {
    public void reverseShowArrayElements(int[] inputArray) {
        System.out.print("Array elements: ");
        for (int i = inputArray.length - 1; i > -1; i--) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
