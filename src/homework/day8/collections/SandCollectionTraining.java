package homework.day8.collections;

import homework.day8.objects.Person;
import homework.day8.objects.Sand;
import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandCollectionTraining {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        printSandsWeightForEachThrough(sandbox, PrinterSymbol.SPACE);
        printSandsNamesForEachThrough(sandbox, PrinterSymbol.SPACE);

        Map<Integer, Sand> sandMap = new HashMap<>();
        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(i, sandbox.get(i));
        }
        Printer.printMapKeysThrough(sandMap);
        Printer.printMapValuesThrough(sandMap);
        Printer.printMapKeyValuePairsThrough(sandMap);
    }

    public static <T> void printSandsWeightForEachThrough(List<T> inputList, PrinterSymbol printerSymbol) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                if (element instanceof Sand) {
                    System.out.print(((Sand) element).getWeight());
                }
            } else {
                if (element instanceof Sand) {
                    System.out.print(((Sand) element).getWeight() + printerSymbol.getValue());
                }
            }
        }
        System.out.println();
    }

    public static <T> void printSandsNamesForEachThrough(List<T> inputList, PrinterSymbol printerSymbol) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                if (element instanceof Sand) {
                    System.out.print(((Sand) element).getName());
                }
            } else {
                if (element instanceof Sand) {
                    System.out.print(((Sand) element).getName() + printerSymbol.getValue());
                }
            }
        }
        System.out.println();
    }
}
