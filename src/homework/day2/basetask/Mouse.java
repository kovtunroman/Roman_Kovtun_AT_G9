package homework.day2.basetask;

public class Mouse {
    private String name;
    private int age;

    public Mouse(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int color) {
        this.age = color;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + this.name + " и мне " + this.age + " лет");
    }
}
