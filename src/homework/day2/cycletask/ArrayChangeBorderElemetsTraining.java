package cycletask;

public class ArrayChangeBorderElemetsTraining {
    private int[] changeBorderArrayElemets(int[] inputArray) {
        int buffer = inputArray[0];
        inputArray[0] = inputArray[inputArray.length - 1];
        inputArray[inputArray.length - 1] = buffer;
        return inputArray;
    }

    public void changeBorderArrayElemetsAndShow(int[] inputArray) {
        ArrayToConsoleTraining.showArrayElements(changeBorderArrayElemets(inputArray));
    }
}
