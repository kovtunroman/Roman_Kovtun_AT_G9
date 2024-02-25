package homework.day8.collections;

import homework.day8.util.Printer;

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

        Printer.printListThroughSpaceForEach(elements);
        calculateNumberOfElementsWithMoreThanOneWord(elements);
        Printer.printListThroughSpaceIterateByIndex(elements);
        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");
        Printer.printListThroughSpaceForEach(elements);
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
