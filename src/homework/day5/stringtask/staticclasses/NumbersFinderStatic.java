package homework.day5.stringtask.staticclasses;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersFinderStatic {

    public static void findNumbersAndPrint(String inputString) {
        System.out.println(Arrays.toString(findNumberInString(inputString)));
    }

    private static int[] findNumberInString(String inputString) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(inputString);
        String processingString = "";
        while (matcher.find()) {
            processingString += matcher.group();
        }
        return charArrayToIntArray(processingString.toCharArray());
    }

    private static int[] charArrayToIntArray(char[] inputCharArray) {
        int[] resultIntArray = new int[inputCharArray.length];
        for (int i = 0; i < inputCharArray.length; i++) {
            resultIntArray[i] = Integer.parseInt(String.valueOf(inputCharArray[i]));
        }
        return resultIntArray;
    }
}
