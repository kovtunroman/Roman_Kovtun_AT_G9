package homework.day5.stringtask.staticclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentDatePrinterStatic {
    public static void printCurrentDate() {
        System.out.printf("Сейчас на дворе: %s %s, %s, %s часа %s минут",
                LocalDate.now().getDayOfMonth(), LocalDate.now().getMonth(), LocalDate.now().getYear(),
                LocalDateTime.now().getHour(), LocalDateTime.now().getMinute()).println();
    }
}
