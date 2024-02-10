package cycletask;

public class ArrayMultiplyElementsTraining {
    private int[] multiplyArrayElemets(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] *= 5;
        }
        return inputArray;
    }

    public void multiplyArrayElemetsAndShow(int[] inputArray) {
        ArrayToConsoleTraining.showArrayElements(multiplyArrayElemets(inputArray));
    }

}
