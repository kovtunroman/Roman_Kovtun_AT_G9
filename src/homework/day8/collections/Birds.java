package homework.day8.collections;

import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Birds {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Seagull", "Thrush", "Busel", "Dove", "Sparrow", "Heron");

        printBird(birds);
        calculateNumberOfBirdsWithMoreThanOneVowel(birds);
        birds.set(3, "Tit");
        Printer.printListForEachThrough(birds, PrinterSymbol.SPACE);
    }

    private static void printBird(List<String> inputBirds) {
        for (String bird : inputBirds) {
            System.out.printf("--%s--", bird).println();
        }
    }

    private static int calculateNumberOfVowels(String word) {
        Pattern pattern = Pattern.compile("[aeiouAEIOU]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    private static void calculateNumberOfBirdsWithMoreThanOneVowel(List<String> inputBirds) {
        int counter = 0;
        for (String bird : inputBirds) {
            if (calculateNumberOfVowels(bird) > 1) {
                counter++;
            }
        }
        System.out.printf("Number of birds with more then one vowel is %s", counter).println();
    }
}
