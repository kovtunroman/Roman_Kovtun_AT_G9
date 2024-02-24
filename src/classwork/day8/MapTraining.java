package classwork.day8;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapTraining {
    public static void splitByRegExp(String inputString) {
        Map<Integer, String> myMap = new HashMap<>();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(inputString);
        int counter = 0;
        while (matcher.find()) {
            myMap.put(counter, matcher.group());
            counter++;
        }
        for (int wordIndex : myMap.keySet()) {
            System.out.println(myMap.get(wordIndex));
        }
        for (String word : myMap.values()) {
            System.out.println(word);
        }
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.printf("Key = %s, Value = %s", entry.getKey(), entry.getValue()).println();
        }
    }

    public static void main(String[] args) {
        splitByRegExp("Mama mila ramu mama");
    }
}
