package homework.day8.collections;

import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cars {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Mers");
        cars.add("Audi");
        cars.add("Jigul");
        cars.add("Reno");
        cars.add("Jigul");
        cars.add("Jigul");
        cars.add("Audi");

        printCarsrToFile(cars);
        cars = findAndDeleteCarsWIthLengthMoreThenFour(cars);
        Printer.printListIterateByIndexThrough(cars, PrinterSymbol.SPACE);
    }

    private static void printCarsrToFile(List<String> inputCars) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("cars.txt"));
            String resultString = "";
            for (String car : inputCars) {
                resultString += "\n\"" + car + "\"";
            }
            out.write(resultString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static List<String> findAndDeleteCarsWIthLengthMoreThenFour(List<String> inputCars) {
        Iterator<String> iterator = inputCars.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() > 4) {
                iterator.remove();
            }
        }
        return inputCars;
    }

    private static void printCarsThroughSpaceIterateByIndex(List<String> inputCars) {
        for (int i = 0; i < inputCars.size(); i++) {
            if (i == inputCars.size() - 1) {
                System.out.print(inputCars.get(i));
            } else {
                System.out.print(inputCars.get(i) + " ");
            }
        }
        System.out.println();
    }
}
