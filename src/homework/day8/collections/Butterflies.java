package homework.day8.collections;

import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        printButterflies(butterflies);
        calculateAndPrintButterfliesWithO(butterflies);
        Printer.printListIterateByIndexThrough(butterflies, PrinterSymbol.SPACE);
        Printer.printListIterateByIndexThrough(butterflies, PrinterSymbol.NEW_LINE);
    }

    private static void printButterflies(List<String> inputButterflies) {
        for (String butterflie : inputButterflies) {
            System.out.printf("\"%s\"", butterflie).println();
        }
    }

    private static void calculateAndPrintButterfliesWithO(List<String> inputButterflies) {
        int counter = 0;
        for (String butterflie : inputButterflies) {
            if (butterflie.toLowerCase().contains("o")) {
                counter++;
            }
        }
        System.out.printf("Number of butterflies with \"o\" char is %s", counter).println();
    }

    private static void printButterfliesThroughSpaceIterateByIndex(List<String> inputButterflies) {
        for (int i = 0; i < inputButterflies.size(); i++) {
            if (i == inputButterflies.size() - 1) {
                System.out.print(inputButterflies.get(i));
            } else {
                System.out.print(inputButterflies.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printButterfliesThroughNewLine(List<String> inputButterflies) {
        for (String butterflie : inputButterflies) {
            System.out.println(butterflie);
        }
    }
}
