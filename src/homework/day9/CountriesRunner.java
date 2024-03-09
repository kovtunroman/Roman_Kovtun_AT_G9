package homework.day9;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        countries.filter(s -> s.matches("[А-ЯЁ][-А-яЁё]+")).filter(s -> s.length() < 7).
                map(String::toUpperCase).map(s -> "\"" + s + "\"").forEach(System.out::println);
    }
}
