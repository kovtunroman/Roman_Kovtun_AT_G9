package homework.day8.util;

import homework.day8.objects.Sand;

import java.util.List;
import java.util.Map;

public class Printer {
    public static <T> void printListForEachThrough(List<T> inputList, PrinterSymbol printerSymbol) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                System.out.print(element);
            } else {
                System.out.print(element + printerSymbol.getValue());
            }
        }
        System.out.println();
    }

    public static <T> void printListIterateByIndexThrough(List<T> inputList, PrinterSymbol printerSymbol) {
        for (int i = 0; i < inputList.size(); i++) {
            if (i == inputList.size() - 1) {
                System.out.print(inputList.get(i));
            } else {
                System.out.print(inputList.get(i) + printerSymbol.getValue());
            }
        }
        System.out.println();
    }

    public static <T> void printMapKeysThrough(Map<Integer, T> inputMap) {
        for (int key : inputMap.keySet()) {
            System.out.println(key);
        }
        System.out.println();
    }

    public static <T> void printMapValuesThrough(Map<Integer, T> inputMap) {
        for (T value : inputMap.values()) {
            System.out.println(value);
        }
        System.out.println();
    }

    public static <T> void printMapKeyValuePairsThrough(Map<Integer, T> inputMap) {
        for (int i = 0; i < inputMap.size(); i++) {
            System.out.println("Key {" + inputMap.keySet().toArray()[i] + "} : Value {" + inputMap.values().toArray()[i] + "}");
        }
        System.out.println();
    }
}

