package homework.day8.collections;

import homework.day8.objects.Bubble;
import homework.day8.objects.Person;
import homework.day8.util.Printer;
import homework.day8.util.PrinterSymbol;

import java.util.ArrayList;
import java.util.List;

public class PersonsCollectionTraining {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(32, "Kolya"));
        persons.add(new Person(24, "Olya"));
        persons.add(new Person(55, "Vasya"));
        persons.add(new Person(63, "Masha"));

        printPersonsAgeForEachThrough(persons, PrinterSymbol.SPACE);
        printPersonsNamesForEachThrough(persons, PrinterSymbol.SPACE);
        Printer.printListIterateByIndexThrough(persons, PrinterSymbol.NEW_LINE);
    }

    public static <T> void printPersonsAgeForEachThrough(List<T> inputList, PrinterSymbol printerSymbol) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                if (element instanceof Person) {
                    System.out.print(((Person) element).getAge());
                }
            } else {
                if (element instanceof Person) {
                    System.out.print(((Person) element).getAge() + printerSymbol.getValue());
                }
            }
        }
        System.out.println();
    }

    public static <T> void printPersonsNamesForEachThrough(List<T> inputList, PrinterSymbol printerSymbol) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                if (element instanceof Person) {
                    System.out.print(((Person) element).getName());
                }
            } else {
                if (element instanceof Person) {
                    System.out.print(((Person) element).getName() + printerSymbol.getValue());
                }
            }
        }
        System.out.println();
    }
}
