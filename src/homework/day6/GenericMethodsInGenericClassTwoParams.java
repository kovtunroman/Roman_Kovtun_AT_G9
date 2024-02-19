package homework.day6;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X inputTOne) {

        return "I received 1 argument of type: " + inputTOne.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(X inputTOne, Y inputTTwo) {

        return "I received 2 arguments of type: " + inputTOne.getClass().getSimpleName() + " class and " + inputTTwo.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X inputTOne, Y inputTTwo, String inputTString) {
        int len = inputTString.length();
        System.out.printf("I got an object of %s class and %s class and string with %d characters", inputTOne.getClass().getSimpleName(), inputTTwo.getClass().getSimpleName(), len).println();
    }

    public void genericMethodHalfGenArgs(X inputTOne, String inputTString) {
        int len = inputTString.length();
        System.out.printf("I got an object of %s class and string with %d characters", inputTOne.getClass().getSimpleName(), len).println();
    }
}