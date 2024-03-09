package homework.day9;

import homework.day8.objects.Bubble;
import homework.day8.objects.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class FurnitureRunner {
    public static void main(String[] args) {
        Stream<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45));
        Random random = new Random();
        furniture
                .filter(c -> c.getHeight() >= 100 && c.getWeight() <= 50)
                .sorted(Comparator
                        .comparing(Chair::getHeight)
                        .thenComparing(Chair::getWeight, Comparator.reverseOrder()))
                .map(c -> new Chair(c.getHeight() / 2, c.getWeight() * random.nextInt(3, 9)))
                .map(c -> c.getWeight() * c.getHeight())
                .distinct()
                .max(Integer::compare)
                .stream()
                .map(i -> {
                    List<String> numbersString = new ArrayList<>();
                    char[] charArray = i.toString().toCharArray();
                    for (char c : charArray) {
                        numbersString.add(String.valueOf(c));
                    }
                    return new Bubble(i, numbersString
                            .stream()
                            .map(c -> switch (c) {
                                case "0" -> "Zero";
                                case "1" -> "One";
                                case "2" -> "Two";
                                case "3" -> "Three";
                                case "4" -> "Four";
                                case "5" -> "Five";
                                case "6" -> "Six";
                                case "7" -> "Seven";
                                case "8" -> "Eight";
                                case "9" -> "Nine";
                                default -> "";
                            })
                            .reduce((c1, c2) -> c1 + " " + c2)
                            .orElse("")
                            .trim());
                })
                .forEach(b -> {
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("chairsToBubbleFile.txt", true));
                        bufferedWriter.write(b.toString());
                        bufferedWriter.close();
                    } catch (IOException e) {
                        System.out.println(e.getCause() + " : " + e.getMessage());
                    }
                });
    }
}
