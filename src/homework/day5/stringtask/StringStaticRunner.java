package homework.day5.stringtask;

import homework.day5.stringtask.staticclasses.*;

import java.text.ParseException;

public class StringStaticRunner {
    public static void main(String[] args) throws ParseException {
        StringToCharColumnStatic.process("123seafsa wef123 123seafsa");
        StringDuplicateFinderStatic.processViaRegex("Mama Mila Mama Mila Ramu Mama");
        StringDuplicateFinderStatic.processViaString("Mama Mila Mama Mila Ramu Mama Doma");
        NumbersFinderStatic.findNumbersAndPrint("Mama MilA 123 3213 Ramu");
        LogParserStatic.findIPUsages("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n");
        CurrentDatePrinterStatic.printCurrentDate();
        DateTimeFormaterStatic.format("22.00 07.09.2020");
        NewDateStatic.calculateNewDate("aaa f");
    }
}
