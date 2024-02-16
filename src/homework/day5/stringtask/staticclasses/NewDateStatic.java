package homework.day5.stringtask.staticclasses;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewDateStatic {
    public static void calculateNewDate(String inputString){
        LocalDate localDate = LocalDate.now().plusDays(calculateNumberOfVowelLetters(inputString));
        System.out.printf("Сгенерированная гласная дата: %s %s", localDate.getDayOfMonth(), localDate.getMonth()).println();
    }

    private static int calculateNumberOfVowelLetters(String inputString){
        Pattern pattern = Pattern.compile("[A,E,I,O,U,Y,a,e,i,o,u,y]");
        Matcher matcher = pattern.matcher(inputString);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
