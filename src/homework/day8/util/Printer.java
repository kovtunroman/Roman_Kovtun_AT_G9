package homework.day8.util;

import java.util.List;

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
}

