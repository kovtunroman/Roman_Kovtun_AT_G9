package homework.day5.stringtask.staticclasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToCharColumnStatic {
    public static void process(String inputString){
        Pattern pattern = Pattern.compile("([a-zA-Z])");
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            System.out.println(inputString.substring(matcher.start(), matcher.end()));
        }
    }
}
