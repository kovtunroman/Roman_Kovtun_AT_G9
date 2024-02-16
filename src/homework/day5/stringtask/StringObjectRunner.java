package homework.day5.stringtask;

public class StringObjectRunner {
    public static void main(String[] args) {
        new StringToCharColumn().process("123seafsa wef123 123seafsa");
        new StringDuplicateFinder().processViaRegex("Mama Mila Mama Mila Ramu Mama");
        new StringDuplicateFinder().processViaStringBuilder("Mama Mila Mama Mila Ramu Mama Doma");
        new NumbersFinder().findNumbersAndPrint("Mama MilA 123 3213 Ramu");
    }
}
