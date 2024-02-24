package classwork.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListTraining {
    public static void splitByRegExp(String inputString) {
        ArrayList<String> myList = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            myList.add(matcher.group());
        }
        for (String word : myList) {
            System.out.println(word);
        }
    }

    public static void splitByList(String inputString) {
        List<String> processingList = Arrays.asList(inputString.split(" "));
        for (String word : processingList) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String inputString = "Mama mila ramu mila";
        splitByRegExp(inputString);
        splitByList(inputString);
    }
}
