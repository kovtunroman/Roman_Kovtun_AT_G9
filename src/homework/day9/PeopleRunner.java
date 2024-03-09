package homework.day9;

import homework.day8.objects.Bubble;
import homework.day8.objects.Person;

import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class PeopleRunner {
    public static void main(String[] args) {
        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));
        double averageAge =  people
                .filter(p -> p.getAge() < 60)
                .sorted(Comparator.comparing(Person::getName))
                .map(p -> new Person(p.getAge() + 4, p.getName()))
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
        System.out.println(averageAge);
    }
}
