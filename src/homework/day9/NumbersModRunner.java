package homework.day9;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        numbersMod.filter(s -> String.valueOf(s).contains("3")).flatMapToInt(s -> String.valueOf(s).chars()).mapToObj(s -> (char) s).sorted().
                map(c -> {
                    return switch (c) {
                        case '0' -> "Zero";
                        case '1' -> "One";
                        case '2' -> "Two";
                        case '3' -> "Three";
                        case '4' -> "Four";
                        case '5' -> "Five";
                        case '6' -> "Six";
                        case '7' -> "Seven";
                        case '8' -> "Eight";
                        case '9' -> "Nine";
                        default -> "";
                    };
                }).distinct().forEach(System.out::println);
    }
}
