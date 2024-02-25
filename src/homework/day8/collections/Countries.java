package homework.day8.collections;

import homework.day8.util.Printer;

import java.util.ArrayList;
import java.util.List;

public class Countries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Andora");
        countries.add("Portugal");
        countries.add("England");
        countries.add("Zambia");
        countries.add("United Kingdom of Great Britain");

        Printer.printListThroughCommaForEach(countries);
        System.out.println(calculateNumberOfCountriesContainsLessThenSevenChars(countries));
        Printer.printListThroughNewLineIterateByIndex(countries);
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
}
