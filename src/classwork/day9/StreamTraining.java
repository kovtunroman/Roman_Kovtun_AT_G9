package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTraining {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "mila", "ramu", "mama", "chisto");
        System.out.println(list.stream().findFirst().orElse("mama"));
        System.out.println(list.stream().filter("mama"::equals).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println(list.stream().skip(2).limit(2).collect(Collectors.toList()));
        System.out.println(list.stream().filter(s -> s.contains("m")).distinct().collect(Collectors.toList()));
    }
}
