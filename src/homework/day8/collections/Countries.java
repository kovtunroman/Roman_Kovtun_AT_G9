package homework.day8.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Countries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Andora");
        countries.add("Portugal");
        countries.add("England");
        countries.add("Zambia");
        countries.add("United Kingdom of Great Britain");

        printCountries(countries);
        System.out.println(calculateNumberOfCountriesContainsLessThenSevenChars(countries));
        printCountriesThroughNewLineIterateByIndex(countries);
    }

    private static void printCountries(List<String> inputCountries) {
        for (String figure : inputCountries) {
            if (inputCountries.indexOf(figure) == inputCountries.size() - 1) {
                System.out.print(figure);
            } else {
                System.out.print(figure + ", ");
            }
        }
        System.out.println();
    }

    private static int calculateNumberOfCountriesContainsLessThenSevenChars(List<String> inputCountries) {
        int counter = 0;
        for (String country : inputCountries) {
            if (country.length() < 7) {
                counter++;
            }
        }
        return counter;
    }

    private static void printCountriesThroughNewLineIterateByIndex(List<String> inputCountries) {
        for (int i = 0; i < inputCountries.size(); i++) {
            System.out.println(inputCountries.get(i));
        }
        System.out.println();
    }
}
