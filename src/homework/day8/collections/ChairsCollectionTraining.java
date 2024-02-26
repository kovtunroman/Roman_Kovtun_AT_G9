package homework.day8.collections;

import homework.day8.objects.Chair;
import homework.day8.objects.Sand;
import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChairsCollectionTraining {
    public static void main(String[] args) {
        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(2, 2),
                new Chair(2, 4));

        calculateAndPrintChairsFieldsMultiplication(furniture, PrinterSymbol.SPACE);

        Map<Integer, Chair> chairMap = new HashMap<>();
        for (int i = 0; i < furniture.size(); i++) {
            chairMap.put(i, furniture.get(i));
        }
        Printer.printMapKeysThrough(chairMap);
        Printer.printMapValuesThrough(chairMap);
        Printer.printMapKeyValuePairsThrough(chairMap);
    }

    public static void calculateAndPrintChairsFieldsMultiplication(List<Chair> inputList, PrinterSymbol printerSymbol) {
        for (Chair element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                System.out.println(element.getHeight() * element.getWeight());
            } else {
                System.out.print(element.getHeight() * element.getWeight() + printerSymbol.getValue());
            }
        }
        System.out.println();
    }
}
