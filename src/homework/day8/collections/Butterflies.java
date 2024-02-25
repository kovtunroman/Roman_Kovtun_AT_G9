package homework.day8.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Butterflies {
    public static void main(String[] args) {
        ArrayList<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        printButterflies(butterflies);
        calculateAndPrintButterfliesWithO(butterflies);
        printButterfliesThroughSpaceIterateByIndex(butterflies);
        printButterfliesThroughNewLine(butterflies);
    }

    private static void printButterflies(ArrayList<String> inputButterflies) {
        for (String butterflie : inputButterflies) {
            System.out.printf("\"%s\"", butterflie).println();
        }
    }

    private static void calculateAndPrintButterfliesWithO(ArrayList<String> inputButterflies) {
        int counter = 0;
        for (String butterflie : inputButterflies) {
            if (butterflie.toLowerCase().contains("o")) {
                counter++;
            }
        }
        System.out.printf("Number of butterflies with \"o\" char is %s", counter).println();
    }

    private static void printButterfliesThroughSpaceIterateByIndex(ArrayList<String> inputButterflies) {
        for (int i = 0; i < inputButterflies.size(); i++) {
            if (i == inputButterflies.size() - 1) {
                System.out.print(inputButterflies.get(i));
            } else {
                System.out.print(inputButterflies.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printButterfliesThroughNewLine(ArrayList<String> inputButterflies) {
        for (String butterflie : inputButterflies) {
            System.out.println(butterflie);
        }
    }
}
