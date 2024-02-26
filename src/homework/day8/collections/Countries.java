package homework.day8.collections;

import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

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

        Printer.printListForEachThrough(countries, PrinterSymbol.COMMA);
        System.out.println(calculateNumberOfCountriesContainsLessThenSevenChars(countries));
        Printer.printListIterateByIndexThrough(countries, PrinterSymbol.NEW_LINE);
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
