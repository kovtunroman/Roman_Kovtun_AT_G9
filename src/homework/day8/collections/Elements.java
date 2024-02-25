package homework.day8.collections;

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

        printElementsThroughSpace(elements);
        calculateNumberOfElementsWithMoreThanOneWord(elements);
        printElementsThroughSpaceIterateByIndex(elements);
        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");
        printElementsThroughSpace(elements);
    }

    private static void printElementsThroughSpace(List<String> inputElements) {
        for (String element : inputElements) {
            System.out.printf("%s ", element);
        }
        System.out.println();
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

    private static void printElementsThroughSpaceIterateByIndex(List<String> inputElements) {
        for (int i = 0; i < inputElements.size(); i++) {
            if (i == inputElements.size() - 1) {
                System.out.print(inputElements.get(i));
            } else {
                System.out.print(inputElements.get(i) + " ");
            }
        }
        System.out.println();
    }
}
