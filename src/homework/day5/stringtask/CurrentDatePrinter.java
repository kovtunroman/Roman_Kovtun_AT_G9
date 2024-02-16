package homework.day5.stringtask;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentDatePrinter {
    public static void printCurrentDate() {
        System.out.printf("Сейчас на дворе: %s %s, %s, %s часа %s минут",
                LocalDate.now().getDayOfMonth(), LocalDate.now().getMonth(), LocalDate.now().getYear(),
                LocalDateTime.now().getHour(), LocalDateTime.now().getMinute()).println();
    }
}
