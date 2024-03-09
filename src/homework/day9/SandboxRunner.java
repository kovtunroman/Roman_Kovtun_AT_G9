package homework.day9;

import homework.day8.objects.Sand;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SandboxRunner {
    public static void main(String[] args) {
        List<Sand> sands = new ArrayList<>();
        sands.add(new Sand(12, "Речной"));
        sands.add(new Sand(8, "Речной"));
        sands.add(new Sand(15, "Карьерный"));
        sands.add(new Sand(7, "Карьерный"));
        sands.add(new Sand(11, "Речной"));
        sands.stream()
                .filter(s -> s.getWeight() > 9 && s.getName().contains("ч"))
                .sorted(Comparator.comparing(Sand::getWeight))
                .map(s -> new Sand(s.getWeight() * 2, s.getName().toUpperCase()))
                .collect(Collectors.toMap(Sand::getWeight, Sand::getName))
                .forEach((k, v) -> {
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sandFile.txt", true));
                        bufferedWriter.write(k + ":" + v + "\n");
                        bufferedWriter.close();
                    } catch (IOException e) {
                        System.out.println(e.getCause() + " : " + e.getMessage());
                    }
                });
    }
}

