package homework.day9;

import homework.day8.collections.Doubles;
import homework.day8.objects.Bubble;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        Random random = new Random();
        int sum = doubles
                .mapToInt(d -> random.nextInt(0, (int) Math.round(d) + 1))
                .distinct()
                .mapToObj(i -> IntStream.range(0, i)
                        .mapToObj(Bubble::new)
                        .collect(Collectors.toList()))
                .peek(s -> s.stream().peek(System.out::println)
                        .collect(Collectors.toList()))
                .flatMapToInt(s -> IntStream.of(s.stream()
                        .mapToInt(Bubble::getVolume)
                        .sum()))
                .sum();
        System.out.println(sum);
    }
}
