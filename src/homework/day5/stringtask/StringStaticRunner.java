package homework.day5.stringtask;

import java.text.ParseException;

public class StringStaticRunner {
    public static void main(String[] args) throws ParseException {
        StringToCharColumn.process("123seafsa wef123 123seafsa");
        StringDuplicateFinder.processViaRegex("Mama Mila Mama Mila Ramu Mama");
        StringDuplicateFinder.processViaString("Mama Mila Mama Mila Ramu Mama Doma");
        NumbersFinder.findNumbersAndPrint("Mama MilA 123 3213 Ramu");
        LogParser.findIPUsages("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n");
        CurrentDatePrinter.printCurrentDate();
        DateTimeFormater.format("22.00 07.09.2020");
    }
}
