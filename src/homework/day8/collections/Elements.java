package homework.day8.collections;

import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Elements {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        Printer.printListForEachThrough(elements, PrinterSymbol.SPACE);
        calculateNumberOfElementsWithMoreThanOneWord(elements);
        Printer.printListIterateByIndexThrough(elements, PrinterSymbol.SPACE);
        elements.add(3, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");
        Printer.printListForEachThrough(elements, PrinterSymbol.SPACE);
    }

    private static int calculateNumberOfWords(String word) {
        Pattern pattern = Pattern.compile("(\\w+)|(\\w+-\\w+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    private static void calculateNumberOfElementsWithMoreThanOneWord(List<String> inputElements) {
        int counter = 0;
        for (String element : inputElements) {
            if (calculateNumberOfWords(element) > 1) {
                counter++;
            }
        }
        System.out.printf("Number of elements with more then one word is %s", counter).println();
    }
}
