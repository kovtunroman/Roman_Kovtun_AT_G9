package homework.day8.collections;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Moscow");
        cities.add("Berlin");

        printCities(cities);
        calculateAndPrintNUmberOfAllChars(cities);
        printCitiesThroughSpaceIterateByIndex(cities);
    }

    private static void printCities(ArrayList<String> inputCities) {
        for (String butterflie : inputCities) {
            System.out.println(butterflie);
        }
    }

    private static void calculateAndPrintNUmberOfAllChars(ArrayList<String> inputCities) {
        int counter = 0;
        for (String city : inputCities) {
            counter += city.length();
        }
        System.out.printf("Number of all chars in cities is %s", counter).println();
    }

    private static void printCitiesThroughSpaceIterateByIndex(ArrayList<String> inputCities) {
        for (int i = 0; i < inputCities.size(); i++) {
            if (i == inputCities.size() - 1) {
                System.out.print(inputCities.get(i));
            } else {
                System.out.print(inputCities.get(i) + " ");
            }
        }
        System.out.println();
    }
}
