package classwork.day10;

import homework.day8.objects.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Миша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        System.out.println("Task 1: start");
        System.out.println(
                persons
                        .stream()
                        .filter(s ->
                                (s.getSex() == Person.Sex.WOMEN && s.getAge() >= 18 && s.getAge() <= 55) ||
                                        (s.getSex() == Person.Sex.MAN && s.getAge() >= 18 && s.getAge() <= 60))
                        .count());
        System.out.println("Task 1: end\n");
        System.out.println("Task 2: start");
        List<Person> peopleForSorting = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Миша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        peopleForSorting
                .stream()
                .map(Person::getName)
                .sorted()
                .forEach(System.out::println);
        System.out.println("Task 2: end\n");
        System.out.println("Task 3: start");
        List<Person> peopleForReverseSortingWithoutDuplicates = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Миша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        peopleForReverseSortingWithoutDuplicates
                .stream()
                .map(Person::getName)
                .sorted((s1, s2) -> -s1.compareTo(s2))
                .distinct()
                .forEach(System.out::println);
        System.out.println("Task 3: end\n");
        System.out.println("Task 4: start");
        List<Person> peopleForSortingByFields = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Миша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        List<Person> resultPeople =
                peopleForSortingByFields
                        .stream()
                        .sorted(
                                Comparator
                                        .comparing(Person::getSex)
                                        .thenComparing(Person::getAge))
                        .peek(System.out::println)
                        .collect(Collectors.toList());
        System.out.println(resultPeople);
        System.out.println("Task 4: end\n");
    }
}
