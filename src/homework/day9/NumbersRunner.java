package homework.day9;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        System.out.println(numbers.peek(System.out::println).sorted().peek(System.out::println).mapToInt(Integer::valueOf).sum());
    }
}
