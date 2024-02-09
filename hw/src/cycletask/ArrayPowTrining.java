package cycletask;

public class ArrayPowTrining {
    private int[] powArrayElemets(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) Math.pow(inputArray[i], 2);
        }
        return inputArray;
    }
    public void powArrayElemetsAndShow(int[] inputArray){
        new ArrayToConsoleTraining().showArrayElements(powArrayElemets(inputArray));
    }
}
