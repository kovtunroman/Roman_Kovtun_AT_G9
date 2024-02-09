package cycletask;

public class ArrayFindMininmalElemetTraining {
    private int findMinimalArrayElemets(int[] inputArray){
        int minimalValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if(minimalValue >= inputArray[i]){
                minimalValue = inputArray[i];
            }
        }
        return minimalValue;
    }
    public void findMinimalElementAndShow(int[] inputArray){
        System.out.println(findMinimalArrayElemets(inputArray));;
    }
}
