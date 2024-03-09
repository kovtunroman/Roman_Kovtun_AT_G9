package homework.day8.collections;

import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

import java.util.ArrayList;
import java.util.List;

public class Noodles {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        Printer.printListForEachThrough(noodles, PrinterSymbol.DASH);
        noodles = replaceChars("a", "o", noodles);
        Printer.printListIterateByIndexThrough(noodles, PrinterSymbol.SPACE);
    }

    private static List<String> replaceChars(String charForReplacement, String charReplacer, List<String> inputList) {
        for (int i = 0; i < inputList.size() - 1; i++) {
            inputList.set(i, inputList.get(i).replaceAll(charForReplacement, charReplacer));
        }
        return inputList;
    }
}
