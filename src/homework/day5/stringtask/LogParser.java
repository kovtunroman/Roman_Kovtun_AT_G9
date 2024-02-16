package homework.day5.stringtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser {
    public static void findIPUsages(String inputString) {
        Pattern pattern = Pattern.compile("\\n");
        String[] stringsWithIPArray = pattern.split(inputString);
        pattern = Pattern.compile("\\b(?:[0-9]{1,3}\\.){3}[0-9]{1,3}\\b");
        Matcher matcher = pattern.matcher(inputString);
        String uniqIPs = findUniqIP(inputString);
        while (matcher.find()) {
            if (uniqIPs.contains(matcher.group())) {
                int counterGranted = 0;
                int counterDenied = 0;
                for (String stringWithIP : stringsWithIPArray) {
                    if (stringWithIP.contains(matcher.group()) && stringWithIP.contains("granted")) {
                        counterGranted++;
                    }
                    if (stringWithIP.contains(matcher.group()) && stringWithIP.contains("denied")) {
                        counterDenied++;
                    }
                }
                System.out.printf("ip %s: ok - %s, failed - %s", matcher.group(), counterGranted, counterDenied).println();
                uniqIPs = uniqIPs.replaceAll(matcher.group(), "");
            }
        }
    }

    private static String findUniqIP(String inputString) {
        Pattern pattern = Pattern.compile("\\b(?:[0-9]{1,3}\\.){3}[0-9]{1,3}\\b");
        Matcher matcher = pattern.matcher(inputString);
        String resultString = "";
        while (matcher.find()) {
            if (resultString.contains(matcher.group()) && inputString.contains(matcher.group())) {
                continue;
            }
            if (!resultString.contains(matcher.group())) {
                resultString = resultString + " " + matcher.group();
            }
        }
        return resultString;
    }
}
