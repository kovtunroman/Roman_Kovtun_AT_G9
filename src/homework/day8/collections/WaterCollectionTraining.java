package homework.day8.collections;

import homework.day8.objects.Person;
import homework.day8.objects.Water;
import homework.day8.util.PrinterSymbol;

import java.util.Arrays;
import java.util.List;

public class WaterCollectionTraining {
    public static void main(String[] args) {
        List<Water> water = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));

        printWaterForEachThrough(water, PrinterSymbol.DASH);
    }

    public static <T> void printWaterForEachThrough(List<T> inputList, PrinterSymbol printerSymbol) {
        for (T element : inputList) {
            System.out.println(((Water) element).getColor() + printerSymbol.getValue() + ((Water) element).getSmell());
        }
        System.out.println();
    }
}
