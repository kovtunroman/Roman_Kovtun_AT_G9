package cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        new WhileTraining().showNumbersFromZeroToTwenty();
        new ForTraining().showOddNumbers();
        int[] demoArray = new ArrayFilingTraining().fillInArray();
        new ArrayToConsoleTraining().showArrayElements(demoArray);
        new ReverseArrayToConsoleTraining().reverseShowArrayElements(demoArray);
        new ArrayMultiplyElementsTraining().multiplyArrayElemetsAndShow(demoArray);
        new ArrayPowTrining().powArrayElemetsAndShow(demoArray);
        new ArrayFindMininmalElemetTraining().findMinimalElementAndShow(demoArray);
        new ArrayChangeBorderElemetsTraining().changeBorderArrayElemetsAndShow(demoArray);
        new ArraySortAndShow().sortArayAndShow(demoArray);
    }
}
