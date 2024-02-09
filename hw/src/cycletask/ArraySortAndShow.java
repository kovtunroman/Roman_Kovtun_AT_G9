package cycletask;

public class ArraySortAndShow {
    private int[] sortArrayElements(int[] inputArray){
        for (int i = inputArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
        return inputArray;
    }
    public void sortArayAndShow(int[] inputArray){
        new ArrayToConsoleTraining().showArrayElements(sortArrayElements(inputArray));
    }
}
