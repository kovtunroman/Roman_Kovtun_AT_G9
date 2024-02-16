package homework.day5.stringtask.staticclasses;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormaterStatic {
    //    формат "22.00 07.09.2020"
    public static void format(String inputString) throws ParseException {
        LocalDateTime dateTime = LocalDateTime.parse(inputString, DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy"));
        String pattern = "MMMM, dd, yyyy HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        String dateTimeFormatted = dateTime.format(formatter);
        System.out.println(dateTimeFormatted);
    }
}
