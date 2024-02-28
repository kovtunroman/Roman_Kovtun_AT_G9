package homework.day8.collections;

import homework.day8.objects.Bubble;
import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

import java.util.Arrays;
import java.util.List;

public class BubblesCollectionTraining {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        printBubblesVolumesForEachThrough(bubbles, PrinterSymbol.SPACE);
        printBubblesNamesForEachThrough(bubbles, PrinterSymbol.SPACE);
        System.out.println(calculateSumOfBubblesVolumes(bubbles));;
        Printer.printListIterateByIndexThrough(bubbles, PrinterSymbol.NEW_LINE);
    }

    public static <T> void printBubblesVolumesForEachThrough(List<T> inputList, PrinterSymbol printerSymbol) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                if (element instanceof Bubble) {
                    System.out.print(((Bubble) element).getVolume());
                }
            } else {
                if (element instanceof Bubble) {
                    System.out.print(((Bubble) element).getVolume() + printerSymbol.getValue());
                }
            }
        }
        System.out.println();
    }

    public static <T> void printBubblesNamesForEachThrough(List<T> inputList, PrinterSymbol printerSymbol) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                if (element instanceof Bubble) {
                    System.out.print(((Bubble) element).getName());
                }
            } else {
                if (element instanceof Bubble) {
                    System.out.print(((Bubble) element).getName() + printerSymbol.getValue());
                }
            }
        }
        System.out.println();
    }

    public static <T> int calculateSumOfBubblesVolumes(List<T> inputList) {
        int volumeCounter = 0;
        for (T element : inputList) {
            if (element instanceof Bubble) {
                volumeCounter += ((Bubble) element).getVolume();
            }
        }
        return volumeCounter;
    }
}
