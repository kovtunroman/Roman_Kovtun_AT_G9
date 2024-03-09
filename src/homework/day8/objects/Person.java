package homework.day8.objects;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private Sex sex;

    public Person(String name, int age, Sex sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public Person(int age, String name){
        this(name, age, Sex.MAN);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public enum Sex{
        MAN, WOMEN
    }
}
