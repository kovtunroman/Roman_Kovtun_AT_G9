package homework.day9;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        // Implemetation:
        // Every String in the Stream as WORD
        AtomicInteger index = new AtomicInteger();
        elements.map(s -> {
            if ((index.getAndIncrement() % 2) != 0) {
                return s.replaceAll("е", "а");
            } else {
                return s = String.valueOf(s.length());
            }
        }).distinct().forEach(System.out::println);
        // Implemetation:
        // Every Word in every String of the Stream as WORD
        Stream<String> elementsSecondTry = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        elementsSecondTry.flatMap(s -> Arrays.stream(s.split(" "))).map(s -> {
            if ((index.getAndIncrement() % 2) != 0) {
                return s.replaceAll("е", "а");
            } else {
                return s = String.valueOf(s.length());
            }
        }).distinct().forEach(System.out::println);
    }
}
