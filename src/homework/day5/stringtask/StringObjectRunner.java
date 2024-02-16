package homework.day5.stringtask;

public class StringObjectRunner {
    public static void main(String[] args) {
        new StringToCharColumn().process("123seafsa wef123 123seafsa");
        new StringDuplicateFinder().processViaRegex("Mama Mila Mama Mila Ramu Mama");
        new StringDuplicateFinder().processViaString("Mama Mila Mama Mila Ramu Mama Doma");
        new NumbersFinder().findNumbersAndPrint("Mama MilA 123 3213 Ramu");
        new LogParser().findIPUsages("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n");
        new CurrentDatePrinter().printCurrentDate();
        new NewDate().calculateNewDate("aaa f");
    }
}
