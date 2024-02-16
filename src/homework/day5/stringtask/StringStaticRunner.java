package homework.day5.stringtask;

public class StringStaticRunner {
    public static void main(String[] args) {
        StringToCharColumn.process("123seafsa wef123 123seafsa");
        StringDuplicateFinder.processViaRegex("Mama Mila Mama Mila Ramu Mama");
        StringDuplicateFinder.processViaStringBuilder("Mama Mila Mama Mila Ramu Mama Doma");
        NumbersFinder.findNumbersAndPrint("Mama MilA 123 3213 Ramu");
    }
}
