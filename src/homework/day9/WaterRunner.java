package homework.day9;

import homework.day8.objects.Bubble;
import homework.day8.objects.Water;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        Stream<Water> water = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный"));
        int sumOfChars = water.filter(w -> !w.getColor()
                        .contains("Прозрачная"))
                .sorted(Comparator.comparing(Water::getSmell).reversed())
                .map(w -> {
                    if (w.getSmell().contains("ы")) {
                        return new Water(w.getColor(), w.getSmell().replaceAll("ы", "ыы"));
                    } else {
                        return w;
                    }
                })
                .map(Water::getSmell)
                .collect(Collectors.joining())
                .length();
        System.out.println(sumOfChars);
    }
}
