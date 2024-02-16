package homework.day5.stringtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDuplicateFinder {
    public static void processViaRegex(String inputString) {
        Pattern pattern = Pattern.compile("(\\s)");
        String[] stringsArray = pattern.split(inputString);
        String[] processingArray = new String[stringsArray.length];
        System.arraycopy(stringsArray, 0, processingArray, 0, stringsArray.length);
        for (String string : stringsArray) {
            if (calculateNumberOfDuplicates(processingArray, string) > 1) {
                System.out.println(string);
                String[] bufferArray = arrayWithoutDupliates(processingArray, string);
                processingArray = new String[bufferArray.length];
                System.arraycopy(bufferArray, 0, processingArray, 0, bufferArray.length);
            }
        }
    }

    private static String[] arrayWithoutDupliates(String[] inputStringArray, String inputString) {
        String[] cleanedStringArray = new String[inputStringArray.length - calculateNumberOfDuplicates(inputStringArray, inputString)];
        int j = 0;
        for (int i = 0; i < inputStringArray.length; i++) {
            if (!inputStringArray[i].equals(inputString)) {
                cleanedStringArray[j] = inputStringArray[i];
                j++;
            }
        }
        return cleanedStringArray;
    }

    private static int calculateNumberOfDuplicates(String[] inputStringArray, String inputString) {
        int counter = 0;
        for (String string : inputStringArray) {
            if (string.equals(inputString)) {
                counter++;
            }
        }
        return counter;
    }

    public static void processViaString(String inputString) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(inputString);
        String resultString = "";
        while (matcher.find()) {
            if (resultString.contains(matcher.group()) && inputString.contains(matcher.group())) {
                break;
            }
            if (!resultString.contains(matcher.group())) {
                resultString = resultString + " " + matcher.group();
            }

        }
        System.out.println(resultString);
    }
}
